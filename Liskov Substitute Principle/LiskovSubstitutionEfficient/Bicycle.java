package LiskovSubstitutionEfficient;
// Bicycle is a vehicle so its extending the Vehicle method.

public class Bicycle extends Vehicle {
    public Bicycle(String Name , int noOfWheels){
        super(Name, noOfWheels);
        this.Name=Name;
        this.noOfWheels=noOfWheels;
        
    }
    public void mantainance() {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void runningOnStreets() {
        // TODO Auto-generated method stub
        
    }
    
}
