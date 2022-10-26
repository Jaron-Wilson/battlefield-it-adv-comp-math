import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Stylus here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Stylus extends SmoothMover
{
    /**
     * Act - do whatever the Stylus wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private double moveSpeed = 3;
    private double velocityY = 0.0;
    private double velocityX = 0.0;
    public void act() 
    {
        //Gravity
        setLocation(getExactX() - velocityX, getExactY()  - velocityY);
        velocityY = velocityY - 0.5;
        velocityX = velocityX + 0.5;
        if(getExactY() > 376) {
            velocityY = 0.0;
        }
        
        if(getExactY() > 101) {
            velocityY = 0.0;
        }

        if(getExactX() < 665) {
            velocityX = 0.0;
        }

        if( Greenfoot.isKeyDown("left") )
        {
            move(1); 
            //setLocation(getExactX() - moveSpeed, getExactY());
            setRotation(180);
            Dot dot = new Dot();
            dot.setRotation(getRotation());
            getWorld().addObject(dot, getX(), getY());
        }

        if( Greenfoot.isKeyDown("right") )
        {
            setRotation(0);
            move(1);
            //setLocation(getExactX() + moveSpeed, getExactY());
            Dot dot = new Dot();
            dot.setRotation(getRotation());
            getWorld().addObject(dot, getX(), getY());
        }

        if( Greenfoot.isKeyDown("up") )
        {
            move(1); 
            setRotation(270);
            Dot dot = new Dot();
            dot.setRotation(getRotation());
            getWorld().addObject(dot, getX(), getY());
        }

        if( Greenfoot.isKeyDown("down") )
        {
            move(1); 
            setRotation(90);
            Dot dot = new Dot();
            dot.setRotation(getRotation());
            getWorld().addObject(dot, getX(), getY());
        }
    }    
}
