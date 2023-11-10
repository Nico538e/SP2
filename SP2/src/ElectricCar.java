public class ElectricCar extends ACar{
    int maxRange;
    int batteryCapacity;

    public ElectricCar(String registrationNumber, String make, String model, int numberOfDoors, int maxRange, int batteryCapacity) {
        super(registrationNumber, make, model, numberOfDoors);
        this.maxRange = maxRange;
        this.batteryCapacity = batteryCapacity;
    }

    @Override
    public int getRegistrationFee() {
        double whPrKm = getWhPrKm();
        double kmNumber = 100 / (whPrKm / 91.25);
        if (kmNumber > 20 && kmNumber < 50) {
            return 330;
        } else if (kmNumber > 15 && kmNumber < 20) {
            return 1050;
        } else if (kmNumber > 10 && kmNumber < 15) {
            return 2340;
        } else if (kmNumber > 5 && kmNumber < 10) {
            return 5500;
        } else {
            return 10470;

        }
    }

    public int getBatteryCapacityKWh(){
        return batteryCapacity;
    }

    public int getMaxRangeKM(){
        return maxRange;
    }

    public int getWhPrKm(){
        return (batteryCapacity*1000)/maxRange;
    }

    @Override
    public String toString(){
        return "Registration number: " + getRegistrationNumber() +
                "\n Make: " + getMake() +
                "\n Model: " + getModel() +
                "\n Number of doors: " + getNumberOfDoors() +
                "\n Max range: " + getMaxRangeKM() +
                "\n Battery capacity: " + getBatteryCapacityKWh() +
                "\n Registration fee: " + getRegistrationFee() + "\n";

    }
}
