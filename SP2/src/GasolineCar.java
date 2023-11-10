public class GasolineCar extends AFuelCar{

    public GasolineCar(String registrationNumber, String make, String model, int numberOfDoors, int kmPrLitre) {
        super(registrationNumber, make, model, numberOfDoors, kmPrLitre);
    }

    @Override
    public String getFuelType() {
        return "Gasoline";
    }

    @Override
    public int getRegistrationFee() {
        int kmPrLitre = kmPrLitre();
        if (kmPrLitre > 20 && kmPrLitre < 50) {
            return 330;
        } else if (kmPrLitre > 15 && kmPrLitre < 20) {
            return 1050;
        } else if (kmPrLitre > 10 && kmPrLitre < 15) {
            return 2340;
        } else if (kmPrLitre > 5 && kmPrLitre < 10) {
            return 5500;
        } else if(kmPrLitre < 5) {
            return 10470;
        } else {
            return 0;
        }
    }

    @Override
    public String toString(){
        return "Registration number: " + getRegistrationNumber() +
                "\n Make: " + getMake() +
                "\n Model: " + getModel() +
                "\n Number of doors: " + getNumberOfDoors() +
                "\n Fuel type: " + getFuelType() +
                "\n Kilometer pr litre: " + getKmPrLitre()+
                "\n Registration fee: " + getRegistrationFee() + "\n";

    }
}
