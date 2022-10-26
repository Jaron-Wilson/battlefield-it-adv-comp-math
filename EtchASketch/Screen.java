import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Screen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Screen extends World
{

    /**
     * Constructor for objects of class Screen.
     * 
     */
    public Screen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(768, 634, 1);
        createObjects();
    }
    
    private void createObjects() {
        Stylus stylus = new Stylus();
        addObject(stylus, getWidth()/2, getHeight()/2);
        Eraser eraser = new Eraser();
        addObject(eraser, getWidth()/2, 634);
    }
}
