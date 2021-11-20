package OpenClosedPrincipleEfficient;

public class PlayerSkills  {
    Object obj;
    PlayerSkills( Object playerType){
        this.obj = playerType; 
    }
    public void skillSet(Player player){
        player.showSkills();
    }
    
}
//now this skill set method will do all the things that was needed
// it will solve the violation of open closed principle and we dont modify the class we are extending now