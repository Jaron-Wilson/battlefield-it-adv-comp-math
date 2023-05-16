import greenfoot.*;  // (Actor, World, Greenfoot, GreenfootImage)

public class CrabWorld extends World
{
    /**
     * Create the crab world (the beach). Our world has a size 
     * of 560x560 cells, where every cell is just 1 pixel.
     */
    public CrabWorld() 
    {
        super((int)(Math.random() * 601) + 400, (int)(Math.random() * 601) + 400, 1);
        //Greenfoot.playSound("fanfare.wav");

        prepare();
    }
    
    public void act()
    {   
        if(Math.random() < 0.1)
        {
            Lobster jerry = new Lobster();
            addObject(jerry, (int)(Math.random() * getWidth()), (int)(Math.random() * getHeight())); 
        }
        
    }
    

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Crab mrKrabs = new Crab();
        addObject( mrKrabs, 280, 280);
        
        Lobster lobster1 = new Lobster(); 
        addObject( lobster1, (int)(Math.random() * getWidth()), (int)(Math.random() * getHeight())); 

        Lobster larry = new Lobster(); 
        addObject( larry, (int)(Math.random() * getWidth()), (int)(Math.random() * getHeight())); 
      
    }
    
    
}