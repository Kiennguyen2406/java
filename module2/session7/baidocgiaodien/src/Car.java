
public class Car extends Vehicle {
    public Car(String model) {
        super(model);
    }

    @Override
    public void move() {
        System.out.println("The car " + model + " is moving.");
    }

}
