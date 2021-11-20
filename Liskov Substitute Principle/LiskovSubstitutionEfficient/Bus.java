package LiskovSubstitutionEfficient;
// Again Bus is a vehicle and also needs to use fuel so its using the useFuel() method by implementing Solve.
public class Bus extends Vehicle implements Solve{
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
    public void useFuel() {
        // TODO Auto-generated method stub
        
    }
    
}
