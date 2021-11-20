package InterfaceSegregationEfficient;
/*
Recalling The inefficient code there The Maker interface was implemented  by CoffeeMaking
TeaMaking JuiceMaking DiabaticShake classes whew add milk and add sugar method of that interface was violating 
Interface segregation principle.
Interface Segregation Principle : Client shouldnt be forced to implent interface the it doesn't use .
To Solve that problem I created 2 new more interface AddMilk and AddSugar . 
The class which needs them are implementing them and using its methods.

*/
public interface Maker {

    public void mix();
    public void pour();
}
