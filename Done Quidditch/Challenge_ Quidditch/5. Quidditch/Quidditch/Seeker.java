import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Seeker here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Seeker extends Actor
{
    // Create a scoreBoard object
    private ScoreBoard scoreBoard = null;
    // Constructor
    public Seeker(ScoreBoard score){
        // Set this scoreboard to the one given in the parameter.
        this.scoreBoard = score;
    }

    /**
     * Act - do whatever the Seeker wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        //move 5
        move(5);
        if(Greenfoot.isKeyDown("1")){
            //turn if key is pressed
            turn(-5);
        }
        if(Greenfoot.isKeyDown("2")){
            //turn if key is pressed
            turn(5);
        }
        if(isTouching(Snitch.class)){
            // if yes:
            // play sound
            Greenfoot.playSound("longsounddududun.mp3");
            // add score 10
            addScore(150);
            // remove the object it is touching
            removeTouching(Snitch.class);
        }
        if(isTouching(Bludger.class)){
            // set the location to the bottom of the screen.
            setLocation(getX(), 530);
            // play the sound
            Greenfoot.playSound("thud.wav");
        }
    }    

    private int addScore(int scoreToAdd){
        // add the score to the scoreboard.
        return scoreBoard.getAndIncrementScore2(scoreToAdd);
    }
}
