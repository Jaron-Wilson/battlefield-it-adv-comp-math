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
    private double moveSpeed = 2;
    public void act() 
    {

        if( Greenfoot.isKeyDown("left") )
        {
            if(getExactX() < 101 || getExactX() > 664 ||getExactY() < 104 ||getExactY() > 512){
                move(0);
            }else{
                move(moveSpeed); 
            }
            //setLocation(getExactX() - moveSpeed, getExactY());
            setRotation(180);
            Dot dot = new Dot();
            dot.setRotation(getRotation());
            getWorld().addObject(dot, getX(), getY());
        }

        if( Greenfoot.isKeyDown("right") )
        {
            if(getExactX() < 101 || getExactX() > 664 ||getExactY() < 104 ||getExactY() > 512){
                move(0);
            }else{
                move(moveSpeed); 
            }
            setRotation(0);
            //setLocation(getExactX() + moveSpeed, getExactY());
            Dot dot = new Dot();
            dot.setRotation(getRotation());
            getWorld().addObject(dot, getX(), getY());
        }

        if( Greenfoot.isKeyDown("up") )
        {
            if(getExactX() < 101 || getExactX() > 664 ||getExactY() < 104 ||getExactY() > 512){
                move(0);
            }else{
                move(moveSpeed);
            }
            setRotation(270);
            Dot dot = new Dot();
            dot.setRotation(getRotation());
            getWorld().addObject(dot, getX(), getY());
        }

        if( Greenfoot.isKeyDown("down") )
        {
            if(getExactX() < 101 || getExactX() > 664 ||getExactY() < 104 ||getExactY() > 512){
                move(0);
            }else {
                move(moveSpeed);
            }
            setRotation(90);
            Dot dot = new Dot();
            dot.setRotation(getRotation());
            getWorld().addObject(dot, getX(), getY());
        }
    }    
}
