import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Lobster here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lobster extends Actor
{
    /**
     * Act - do whatever the Lobster wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        move((int) (Math.random() * 81) + 140);
        if(isAtEdge()){
            turn((int) (Math.random() * 360));
        }
        if(isTouching(Plane.class)) {
            Greenfoot.playSound("gs.mp3");
            removeTouching(Plane.class);
        }
    }    
}
