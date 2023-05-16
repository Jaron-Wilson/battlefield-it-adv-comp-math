import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Shots here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Shots extends Actor
{
    /**
     * Act - do whatever the Shots wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        move(5);
        World w = getWorld();
        if(isAtEdge())
        {
            w.removeObject(this);
        }
        else {
            if(isTouching(BadGuys.class))
            {
                removeTouching(BadGuys.class);
            }
        }
    }    
}
