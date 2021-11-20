package LiskovSubstitutionInefficient;

import java.util.ArrayList;
import java.util.List;

/*
The principle defines that objects of a superclass shall be replaceable with objects of its subclasses without breaking the application. 
That requires the objects of your subclasses to behave in the same way as the objects of your superclass.
here Bicycle is a subclass of Vehicle class but it is violating the rules of Liskov substition priciple as 
useFuel() method is getting handled by throwing an exception which is not a conventional way to design Software.
*/

public class Liskov {
    public static void main(String[] args) throws Exception {
        List <Vehicle> vehicles;
        vehicles = new ArrayList<>();
        Car car1 = new Car("Ford",4);
        Car car2 = new Car("Lambo",4);
        Car car3 = new Car("Jaguar",4);
        Bus bus1 = new Bus("Hundai",8);
        Bus bus2 = new Bus("Tata",8);
        Bicycle bicycle1=new Bicycle("Mustang", 2);
        Bicycle bicycle2= new Bicycle("Random", 2);
        
        vehicles.add(car1);
        vehicles.add(car2);
        vehicles.add(car3);
        vehicles.add(bus1);
        vehicles.add(bus2);
        vehicles.add(bicycle1);
        vehicles.add(bicycle2);
    
        for( Vehicle vehicle : vehicles){
            vehicle.mantainance();
            //This is not an issue because its common in all of the vehicles .Problem Occurs when we apply useFuel() method;
        }
        
        for (Vehicle vehicle : vehicles ){
            if (vehicle instanceof Car || vehicle instanceof Bus){
                vehicle.usingFuel();
            }
            else {
                throw new Exception("Bicycles dont need fueling");
            }

        }
        
    }
    
}
