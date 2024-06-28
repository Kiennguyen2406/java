public class ProductManager {

    Product[] products;
    int size;

    public ProductManager() {
        products = new Product[10];
        int size = 0;
    }

    public void addProduct(Product product) {
        if (size < products.length) {
            products[size] = product;
            size++;
        } else {
            throw new ArrayIndexOutOfBoundsException("Product array is full");
        }
    }

    public Product getProduct(int index) {
        if (index >= 0 && index < size) {
            return products[index];
        } else {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
    }

}
