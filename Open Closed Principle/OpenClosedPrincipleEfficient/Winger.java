package OpenClosedPrincipleEfficient;

public class Winger extends Player{
    String Name,height,overall;
    Winger(String Name , String height , String overall){
        super(Name,height);
        this.Name=Name;
        this.height=height;
        this.overall=overall;
        
        
    }
    public void dribbling(){
        //a unique attribute of winger to dribble 
    }
    public void crossing(){
        //Supply ball to the box
    }
    public void clinicalFinishing(){
        //areial threat for goalkeeper 
    }
    @Override
    public void showSkills() {
        // TODO Auto-generated method stub
        clinicalFinishing();
        dribbling();
        crossing();
        
    }
    
}
