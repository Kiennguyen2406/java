public class Bicycle extends Vehicle {
    public Bicycle(String model) {
        super(model);
    }

    @Override
    public void move() {
        System.out.println("The bicycle " + model + " is moving.");
    }

    }
