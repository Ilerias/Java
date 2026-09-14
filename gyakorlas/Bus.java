public class Bus extends Vehicle {
    private int passangerCapacity;

    public Bus(String brand, double weight, int passangerCapacity) {
        super(brand, weight);
        this.passangerCapacity = passangerCapacity;
    }

    public int getPassangerCapacity() {
        return passangerCapacity;
    }

    public void setPassangerCapacity(int passangerCapacity) {
        if(passangerCapacity < 0) {
            throw new IllegalArgumentException("A kapacitásnak pozitívnak kell lennie!");
        }
        else {
            this.passangerCapacity = passangerCapacity;
        }
    }

    public double calculateTax() {
        return 1.5 * weight;
    }

    public int getMaxPassengers() {
        return passangerCapacity;
    }
}
