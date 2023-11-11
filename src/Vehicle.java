class Vehicle {
    private int numberOfWheels;

    public Vehicle(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public void moveForward() {
        System.out.println("Vehicle is moving forward.");
    }

    public void turn() {
        System.out.println("Vehicle is turning.");
    }
}