public class Product implements Comparable<Product> {

    public String productName;
    public int id;
    public double price;

    public Product(String productName, int id, double price) {
        this.price = price;
        this.id = id;
        this.productName = productName;
    }

    public int getId() {
        return id;
    }

    public double getPrice() {
        return price;
    }

    public String getProductName() {
        return productName;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", id=" + id +
                ", price=" + price +
                '}';
    }

    @Override
    public int compareTo(Product o) {
        return (int) (this.getPrice()-o.getPrice());//tăng dần.
    }
}
