import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BadGuys here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BadGuys extends Actor
{
    /**
     * Act - do whatever the BadGuys wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        move(-5);
        World w = getWorld();
        if(isAtEdge())
        {
            //w.removeObject(this);
            setLocation(590, getY());
        }
    }    
}
