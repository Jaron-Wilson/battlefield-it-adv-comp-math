import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Duck here.
 * 
 * @author Jaron Wilson 
 * @version 11/1/2022
 */
public class Duck extends SmoothMover
{
    private static int score = 0;
    private static int livesLeft = 10;
    private double velocity = 0.0;
    private String myKey = "" + (char)(Math.random() * 26 + 'A');
    public Duck()
    {
         getImage().drawString(myKey, 50, 80 );
    }
    
    public void act() 
    {
        getWorld().showText("Lives:" + livesLeft, 250, 50);
        getWorld().showText("Score:" + score, 750, 50);
        setLocation(getX(), getY()+velocity);
        velocity = velocity + 0.1;
        if(isTouching(Gator.class)){
            getWorld().removeObject(this);
            livesLeft--;
            Greenfoot.playSound("quack.mp3");
        }
        if(Greenfoot.isKeyDown(myKey)){
            score++;
            getWorld().removeObject(this);
        }
    }   
}
