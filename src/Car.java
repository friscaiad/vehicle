class Car extends Vehicle {
    private int numberOfDoors;
    private double fuelTankCapacity;
    private String transmissionType;

    public Car(int numberOfWheels, int numberOfDoors, double fuelTankCapacity, String transmissionType) {
        super(numberOfWheels);
        this.numberOfDoors = numberOfDoors;
        this.fuelTankCapacity = fuelTankCapacity;
        this.transmissionType = transmissionType;
    }

    public void fillGas() {
        System.out.println("Filling gas into the car.");
    }

    // Override method moveForward
    @Override
    public void moveForward() {
        System.out.println("Car is moving forward.");
    }

    // Additional method specific to Car
    public void changeGear() {
        System.out.println("Changing gear in the car.");
    }
}