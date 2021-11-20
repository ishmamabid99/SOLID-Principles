package OpenClosedPricipleInefficient;

public class PlayerSkills{

    Object player;
    PlayerSkills(Object player){
        this.player=player;
    }
    public void showSkills(){

        if (player instanceof Midfielder){
            Midfielder midfielder= (Midfielder) player;
            midfielder.distanceShooting();
            midfielder.playmaking();
            midfielder.throughBalls();
        }
        else if (player instanceof Winger){
            Winger winger= (Winger) player;
            winger.clinicalFinishing();
            winger.dribbling();
            winger.dribbling();
        }
        else {
            //khela pare na 
        }

    }

}
/*
here this class violates open close principle as here if we want to add any other player such as striker or defender we need to
change this class or modify this class .
But Open Closed Principle clearly states that we can extend any class but can't modify it.

*/