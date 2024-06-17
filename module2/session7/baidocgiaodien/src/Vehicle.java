public abstract class Vehicle implements InterfaceName {
    protected String model;

    public Vehicle(){

    }
    public Vehicle(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
    // Phương thức trừu tượng
}
