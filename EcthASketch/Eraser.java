import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Eraser here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Eraser extends SmoothMover
{
    /**
     * Act - do whatever the Eraser wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {

        turn((int) (Math.random() * 11)+0);
        move(1);
        if( Math.random() <  0.01)
        {
            setLocation(
                (int) (Math.random() * (getWorld().getWidth() + 1)),
                (int) (Math.random() * (getWorld().getHeight() + 1))
            );
        }
        if(isTouching(Dot.class)){
            removeTouching(Dot.class);
        }
    }    
}
