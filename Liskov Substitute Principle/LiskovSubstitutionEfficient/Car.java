package LiskovSubstitutionEfficient;
//The class car is a vehicle and also needs fuel so , its implementing the Solve interface.
public class Car extends Vehicle implements Solve {
    
    String Name ;
    int noOfWheels;
    public Car(String Name , int noOfWheels){
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
    public void automaticGear(){
        //defines that this car is an automatic car.
    }
    @Override
    public void useFuel() {
        // TODO Auto-generated method stub
        
    }
    
}
