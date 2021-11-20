package OpenClosedPrincipleEfficient;

public class Striker extends Player {
    String Name,height,overall;
    Striker(String Name , String height , String overall){
        super(Name,height);
        this.Name=Name;
        this.height=height;
        this.overall=overall;
        
    }
    public void powerShooting(){
        //power shots
    }
    public void heading(){
       // head towards goal.
    }
    public void pressOnDefenders(){
        //press defenders
    }
    @Override
    public void showSkills() {
        // TODO Auto-generated method stub
        heading();
        pressOnDefenders();
        powerShooting();
        
    }
}
