package OpenClosedPrincipleEfficient;
/*
in order to get rid of that inefficient approach all we need to do is to creat an abstract class which implies an abstract method 
named showSkills which solves the problem of having a new catagoy.We can just call that method in every new class.
*/

abstract public class Player {
    String Name,height;
    Player(String Name , String height){
        super();
        this.Name=Name;
        this.height=height;
    }
    public abstract void  showSkills();
    //this show skills method can be used in every class which extends this player class.
}
