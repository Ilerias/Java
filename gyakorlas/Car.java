public class Car extends Vehicle {
    private int enginePower;
    private boolean isElectric;

    public Car(String brand, double weight, int enginePower, boolean isElectric) {
        super(brand, weight);
        this.enginePower = enginePower;
        this.isElectric = isElectric;
    }

    public int getEnginePower() {
        return enginePower;
    }

    public boolean getIsElectric() {
        return isElectric;
    }

    public void setEnginePower(int enginePower) {
        if(enginePower < 0) {
            throw new IllegalArgumentException("A teljesítménynek pozitívnak kell lennie!");
        }
        else {
            this.enginePower = enginePower;
        }
    }

    public double calculateTax() {
        if(isElectric) {
            return 0 * enginePower;
        }
        else {
            return 250 * enginePower;
        }
    }

    public int getMaxPassengers() {
        return 5;
    }
}
