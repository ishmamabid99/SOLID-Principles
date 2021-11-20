package LiskovSubstitutionInefficient;

/*
This Vehicle Class represents a class which Can be extended by other vehicle Car,Bus , Bicycle .
But not all of the  class might represent all of vehicle class functionality. As for example
her Car and Bus Class objects need to be fueled  where Bicycles dont need fueling .


*/

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

    public abstract void usingFuel();


}
