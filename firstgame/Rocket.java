import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Rocket here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class Rocket extends Actor
{
    /**
     * Act - do whatever the Rocket wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        
        // Add your action code here.
        mover();
        shooter();
    }    
    public void mover()
    {
        if(Greenfoot.isKeyDown("up"))
        {
            setLocation(getX(), getY() - 10);
        }
        if(Greenfoot.isKeyDown("down"))
        {
            setLocation(getX(), getY() + 10);
        }
    }
    public void shooter() 
    {
        World world = getWorld();
        if (Greenfoot.isKeyDown("space")) 
        {
            world.addObject(new Shots(), getX() + 50, getY());
        }
    }
}
