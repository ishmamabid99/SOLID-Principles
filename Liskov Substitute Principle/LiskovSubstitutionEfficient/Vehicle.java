package LiskovSubstitutionEfficient;

public abstract class Vehicle {
    String Name ;
    int noOfWheels;

    public Vehicle(String Name , int noOfWheels){
        super();
        this.Name=Name;
        this.noOfWheels=noOfWheels;
    }
    public abstract void mantainance();

    public abstract void runningOnStreets();
    
}
