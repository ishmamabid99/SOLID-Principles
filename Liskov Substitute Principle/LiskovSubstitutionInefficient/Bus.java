package LiskovSubstitutionInefficient;

public class Bus extends Vehicle {
    String Name ;
    int noOfWheels;
    public Bus(String Name , int noOfWheels){
        super(Name, noOfWheels);
        this.Name=Name;
        this.noOfWheels=noOfWheels;
        
    }
    @Override
    public void mantainance() {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void runningOnStreets() {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void usingFuel() {
        // TODO Auto-generated method stub
        
    }
    public void manualGear (){
        //defines that the car is manual.
    }
}
