package InterfaceSegregationInefficient;

/*
This code might seem to be allright but ist definetly not .
Interface Segregation :  A Client should not be forced to implement an interface that it doesn't use.
Here JuiceMaking and DiabaticShake  classes are using addMilk and addSugar method respectively but these 
method are not its behaviour.Just because of implementing Maker interface they are forced to implement  
its methods too. 
That's why it's an inefficient code.

*/

public class JuiceMaking  implements Maker {

    
    @Override
    public void addMilk() {
        // TODO Auto-generated method stub
        /*This is where the problem occurs  JuiceMaking doesn't need addMilk proccess . But because of its imp;ementing
        maker Interface we must need to derive all its abastract method. 
        
        */
        System.out.println("Its not Happening");
    }
    @Override
    public void addSugar() {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void mix() {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void pour() {
        // TODO Auto-generated method stub
        
    }

}
