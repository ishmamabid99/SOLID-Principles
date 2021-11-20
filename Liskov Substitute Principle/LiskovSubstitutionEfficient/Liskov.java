package LiskovSubstitutionEfficient;

import java.util.ArrayList;
import java.util.List;

public class Liskov   {
    
    public static void main(String[] args)  {
        List <Solve> fuelVehicles;
        List <Vehicle> vehicles;
        vehicles= new ArrayList<>();
        fuelVehicles = new ArrayList<>();
        Car car1 = new Car("Ford",4);
        Car car2 = new Car("Lambo",4);
        Car car3 = new Car("Jaguar",4);
        Bus bus1 = new Bus("Hundai",8);
        Bus bus2 = new Bus("Tata",8);
        Bicycle bicycle1=new Bicycle("Mustang", 2);
        Bicycle bicycle2= new Bicycle("Random", 2);
        
        fuelVehicles.add(car1);
        fuelVehicles.add(car2);
        fuelVehicles.add(car3);
        fuelVehicles.add(bus1);
        fuelVehicles.add(bus2);
        vehicles.add(car1);
        vehicles.add(car2);
        vehicles.add(car3);
        vehicles.add(bus1);
        vehicles.add(bus2);
        vehicles.add(bicycle1);
        vehicles.add(bicycle2);
        for (Solve fuel : fuelVehicles){
            fuel.useFuel();
        }
        
    }
}
