import java.util.ArrayList;

public class FleetOfCars {
    private ArrayList<Car> fleet;

    public FleetOfCars(){
       fleet = new ArrayList<>();
    }

    public void addCar(Car car){
        fleet.add(car);
    }

    public int getTotalRegistrationFeeForFleet(){
        int totalRegistrationFee = 0;
        for(Car car: fleet){
            totalRegistrationFee += car.getRegistrationFee();
        }
        return totalRegistrationFee;
    }


    @Override
    public String toString(){
        return "Cars in the fleet:\n";

    }

}
