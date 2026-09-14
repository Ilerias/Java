public class VehicleManagerApp {
    public static void main(String[] args) {
        VehicleManagerApp program = new VehicleManagerApp();
        program.start();
    }

    public void start() {
        double baseBudget = 150000.75;
        System.out.println((int) baseBudget);

        boolean isFinished = false;
        int counter = 0;
        while(!isFinished) {
            if (counter < 5) {
                System.out.println("* ");
            }
            else {
                isFinished = true;
            }
            counter++;
        }

        Car ferrari = new Car("Ferrari", 15000, 600, false);
        ferrari.setEnginePower(745);
        System.out.println(ferrari.getBrand() + " adó: " + ferrari.calculateTax() + " Ft, " + (ferrari.getIsElectric() ? "Elektromos" : "Benzines"));

        Vehicle[] fleet = new Vehicle[5];
        for(int i = 0; i < fleet.length; i++) {
            if(i < 3) {
                fleet[i] = new Car("Toyota", 1000 + (i * 50), 125 + (i * 50), (i % 2 == 0) ? true : false);
            }
            else {
                fleet[i] = new Bus("Mercedes", 5000 + (i * 100), 30 + (i * 5));
            }
        }

        for(Vehicle vehicle : fleet) {
            System.out.println(vehicle.getBrand() + " adó: " + vehicle.calculateTax() + " Ft, Max utasok: " + vehicle.getMaxPassengers());
        }
    }
}