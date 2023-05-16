import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GoalHoop here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GoalHoop extends Actor
{
    // Create a scoreBoard object
    private ScoreBoard scoreBoard = null;
    // Constructor
    public GoalHoop(ScoreBoard score){
        // Set this scoreboard to the one given in the parameter.
        this.scoreBoard = score;
    }
    /**
     * Act - do whatever the GoalHoop wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // run the method
        checkTouching();
    }    
    private void checkTouching(){
        // is it touching?
        if (isTouching(Quaffle.class)){
            // if yes:
            // play sound
            Greenfoot.playSound("chime.wav");
            // add score 10
            addScore(10);
            // remove the object it is touching
            removeTouching(Quaffle.class);
        }
    }
    private int addScore(int scoreToAdd){
        // add the score to the scoreboard.
        return scoreBoard.getAndIncrementScore1(scoreToAdd);
    }
}
