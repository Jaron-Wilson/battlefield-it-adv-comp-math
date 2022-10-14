import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class tile here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tile extends World
{
    /**
     * Constructor for objects of class tile.
     * 
     */
    public Tile()
    {   
        super(1280, 720, 1);
        Greenfoot.playSound("fanfare.wav");
        Plane myPlane = new Plane();

        addObject(myPlane,130,365);
        showText("heelo", 100, 100);
    }

}
