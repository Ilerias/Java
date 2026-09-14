public abstract class Vehicle {
    protected String brand;
    protected double weight;

    public Vehicle(String brand, double weight) {
        this.brand = brand;
        this.weight = weight;
    }

    public String getBrand() {
        return brand;
    }

    public double getWeight() {
        return weight;
    }

    public abstract double calculateTax();

    public abstract int getMaxPassengers();
}
