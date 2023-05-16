import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bludger here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bludger extends Actor
{
    /**
     * Act - do whatever the Bludger wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // move 10 spaces
        move(10);
        // Is it at edge?
        if(isAtEdge()){
            // if yes remove this object
            getWorld().removeObject(this);
        }
    }    
}
