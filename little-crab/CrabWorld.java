import greenfoot.*;  // (Actor, World, Greenfoot, GreenfootImage)

public class CrabWorld extends World
{
    /**
     * Create the crab world (the beach). Our world has a size 
     * of 560x560 cells, where every cell is just 1 pixel.
     */
    public CrabWorld() 
    {
        //super(600, 400, 1);
        super(((int) (Math.random() * 601) + 400),
              ((int) (Math.random() * 601) + 400),1);
              
        Plane myPlane = new Plane();
        addObject(myPlane,getWidth()/2,getHeight()/2);
        
        Lobster myLobster = new Lobster();
        addObject(myLobster,
        ((int) (Math.random() * (getWidth()-getHeight())+1) + getHeight()),
        ((int) (Math.random() * (getHeight()-getWidth())+1) + getWidth()));

    }
    
}