import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Trail here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Trail extends Actor
{
    //Integer called timer – it will represent if the Trail is currently “active” or not.
    private int timer;
    //Build a constructor that is sent a Boolean parameter to represent if the Trail is blue.
    public Trail(Boolean trailColor)
    {    
        /* Create a test to determine the truth value of the Boolean variable.  
         i. If it is true... 
             1. Set the image to the blue trail (trail1.png) 
         ii. If it is false... 
             1. Set the image to the red trail (trail2.png) 
        c. Set the timer variable to 10.
        */

        if(trailColor){
            setImage("trail1.png");
        }else {
            setImage("trail2.png");
        }
        timer = 10;
        
    }

    public void act() {
        // Subtract 1 from the timer
        timer--;
        /*
        If the timer is below zero and the Trail is touching a Bike, it should remove the 
        Bike it is touching from the screen.
        */
        if(timer < 0 && isTouching(Bike.class)) {
            removeTouching(Bike.class);
        }
    }
}
