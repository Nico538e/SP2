public class DieselCar extends AFuelCar{
    private boolean hasParticleFilter;

    public DieselCar(String registrationNumber, String make, String model, int numberOfDoors, int kmPrLitre, boolean hasParticleFilter) {
        super(registrationNumber, make, model, numberOfDoors, kmPrLitre);
        this.hasParticleFilter = hasParticleFilter;
    }

    @Override
    public String getFuelType() {
        return "Diesel";
    }

    public boolean hasParticleFilter() {
        return hasParticleFilter;
    }


    @Override
    public int getRegistrationFee() {
        int kmPrLitre = kmPrLitre();
        int registrationFee = 0;
        if (kmPrLitre > 20 && kmPrLitre < 50) {
            registrationFee = 330 + 130;
        } else if (kmPrLitre > 15 && kmPrLitre < 20) {
            registrationFee = 1050 + 1390;
        } else if (kmPrLitre > 10 && kmPrLitre < 15) {
            registrationFee = 2340 + 1850;
        } else if (kmPrLitre > 5 && kmPrLitre < 10) {
            registrationFee = 5500 + 2770;
        } else if(kmPrLitre < 5) {
            registrationFee = 10470 + 15260;

        }
        if(!hasParticleFilter()){
            registrationFee += 1000;
        }

        return registrationFee;
    }


    @Override
    public String toString(){
        return "Registration number: " + getRegistrationNumber() +
                "\n Make: " + getMake() +
                "\n Model: " + getModel() +
                "\n Number of doors: " + getNumberOfDoors() +
                "\n Fuel type: " + getFuelType() +
                "\n Kilometer pr litre: " + getKmPrLitre() +
                "\n Registration fee: " + getRegistrationFee() + "\n";


    }
}
