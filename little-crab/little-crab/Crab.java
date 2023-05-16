import greenfoot.*;

/**
 * This class defines a crab. Crabs live on the beach.
 */
public class Crab extends Actor
{
    public void act()
    {
               
        if( Greenfoot.isKeyDown("up"))
        {
            move(10);
        }
        
        if( Greenfoot.isKeyDown("left") )
        {
            turn(-10);
        }
        
        if( Greenfoot.isKeyDown("right") )
        {
            turn(10);
        }
        
        //if(isTouching(Worm.class))
//        {   removeTouching(Worm.class);
  //          Greenfoot.playSound("slurp.wav");
    //    }
        
        if( Greenfoot.isKeyDown("space"))
        {
            Worm wanda = new Worm();
            getWorld().addObject(wanda, getX(), getY()); 
            wanda.setRotation(getRotation()); 
        }
        
        
        
        
        

    }
}
