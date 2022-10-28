import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Dot here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Dot extends SmoothMover
{
    /**
     * Act - do whatever the Dot wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        if(Greenfoot.isKeyDown("w")){
            move(2);
        }
        if(isAtEdge()){
            getWorld().removeObject(this);
        }
        if(Greenfoot.isKeyDown("space")){
            getWorld().removeObject(this);
        }
    }    
}
