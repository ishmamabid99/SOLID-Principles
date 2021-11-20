package InterfaceSegregationInefficient;

public interface Maker {
    
    //used for making coffe , juice , Tea

    public void addSugar();
    public void addMilk();
    public abstract void mix();
    public abstract void pour();

}
