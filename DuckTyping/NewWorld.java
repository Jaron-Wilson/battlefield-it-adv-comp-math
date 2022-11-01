import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class NewWorld here.
 * 
 * @author Jaron Wilson 
 * @version 11/1/2022
 */
public class NewWorld extends World
{

    /**
     * Constructor for objects of class NewWorld.
     * 
     */
    private double duckPercent = 0.005;
    public NewWorld()
    {    
        super(1000, 800, 1); 
        Gator gator1 = new Gator();
        addObject(gator1, 100, 800);
        Gator gator2 = new Gator();
        addObject(gator2, 200, 800);
        Gator gator3 = new Gator();
        addObject(gator3, 300, 800);
        Gator gator4 = new Gator();
        addObject(gator4, 400, 800);

        Gator gator5 = new Gator();
        addObject(gator5, 500, 800);
        Gator gator6 = new Gator();
        addObject(gator6, 600, 800);
        Gator gator7 = new Gator();
        addObject(gator7, 700, 800);
        Gator gator8 = new Gator();
        addObject(gator8, 800, 800);
        Gator gator9 = new Gator();
        addObject(gator9, 900, 800);
    }

    public void act()
    {
        if(Math.random() < duckPercent){
            Duck duck = new Duck();
            addObject(duck, (int)(Math.random() * 901), 50);
            duckPercent = duckPercent + 0.0005;
        }
    }
}
