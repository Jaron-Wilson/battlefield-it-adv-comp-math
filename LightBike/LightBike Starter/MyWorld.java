import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 775, 1); 
        buildBikes();
    }

    public Boolean buildBikes() {
        Bike trueBike = new Bike(true);
        Bike falseBike = new Bike(false);
        
        addObject(trueBike, getWidth()/10, getHeight()/2);
        falseBike.setRotation(180);
        addObject(falseBike, getWidth()*9/10, getHeight()/2);
        
        
        return true;
    }
}
