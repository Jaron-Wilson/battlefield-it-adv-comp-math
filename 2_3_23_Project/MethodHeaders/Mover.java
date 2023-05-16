import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Mover here.
 * 
 * @author Jaron Wilson 
 * @version 2/3/23
 */
public class Mover extends Actor
{
    /**
     * Act - do whatever the Mover wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        turn((int)(Math.random() * 26));
        move(15);
        if (isAtEdge())
            getWorld().removeObject(this);
    }    
}
