import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Quaffle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Quaffle extends Actor
{
    /**
     * Act - do whatever the Quaffle wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // move 10
        move(10);
        //turn -10 to 10               v- add or subtract
        turn((int) (Math.random()* 21) +- 10);
         if(isAtEdge()){
             // if at edge remove object
            getWorld().removeObject(this);
        }
    }    
}
