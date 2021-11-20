package OpenClosedPrincipleEfficient;

public class Midfielder extends Player{
    String Name,height,overall;
    Midfielder(String Name , String height , String overall){
        super(Name,height);
        this.Name=Name;
        this.height=height;
        this.overall=overall;
        
    }
    public void playmaking(){
        //a unique attribute
    }
    public void distanceShooting(){
        //shoots Long Range balls 
    }
    public void throughBalls(){
        //provides through passes.
    }
    @Override
    public void showSkills() {
        // TODO Auto-generated method stub
        throughBalls();
        playmaking();
        distanceShooting();
        
    }
}
