package LiskovSubstitutionEfficient;
// I am  using an Interface  "Solve" which actually solves  
//Liskov Substitution Principle(LSP): Subclass/derived class should 
//be substitutable for their base/parent class.
/*
from the inefficient code  it was seen that the bicycle class was violation LSP  
 so  this Interface solve is implemented on those classes which actually are using 
 fuel and derived calss remains Subsitutable for parent ("Vehicle") class.
by overriding this abstract method usefuel Car and Bus can use this method whereas
 bicycle doesn't need this method so its not implementing this method.
 */
public interface Solve {
    public void useFuel();
}
