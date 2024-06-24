public class Product {
    private int id;
    private double price;
    private String name;

    public Product(int id,String name,double price) {
        this.id=id;
        this.price=price;
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", price='" + price + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}

