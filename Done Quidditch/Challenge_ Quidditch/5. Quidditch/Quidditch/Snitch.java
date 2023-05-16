import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Snitch here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Snitch extends Actor
{
    /**
     * Act - do whatever the Snitch wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // move 5
        move(5);
        //0-360
        if(isAtEdge()){
            setLocation((int)(Math.random() * getWorld().getWidth()),
                (int)(Math.random() * getWorld().getHeight()));
                
            turn((int)(Math.random() * 361) + 0);
        }
    }    
}
