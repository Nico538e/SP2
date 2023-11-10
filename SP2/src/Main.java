public class Main {
    public static void main(String[] args) {
    FleetOfCars fleet = new FleetOfCars();

    ElectricCar electricCar = new ElectricCar("JK124", "Tesla","Roadster",3,1000, 200);
    GasolineCar gasolineCar = new GasolineCar("GG420", "Audi","A5", 3,22);
    DieselCar dieselCar = new DieselCar("FF349", "Mercedes", "GLE300 d", 5, 18, false);

        System.out.println(fleet);
        System.out.println(electricCar);
        System.out.println(gasolineCar);
        System.out.println(dieselCar);

        fleet.addCar(electricCar);
        fleet.addCar(dieselCar);
        fleet.addCar(gasolineCar);

        System.out.println("Total fee of fleets: " + fleet.getTotalRegistrationFeeForFleet());

        if(!dieselCar.hasParticleFilter()){

        }

    }
}