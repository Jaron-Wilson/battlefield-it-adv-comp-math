import greenfoot.*;

/**
 * This class defines a crab. Crabs live on the beach.
 */
public class Plane extends Actor
{
    public void act()
    {
        if(isAtEdge()){
            turn(10);
        }
        if (Greenfoot.isKeyDown("left") || Greenfoot.isKeyDown("a")) {
            turn(-5);
        }
        if (Greenfoot.isKeyDown("right")|| Greenfoot.isKeyDown("d")) {
            turn(5);
        }
        if (Greenfoot.isKeyDown("up")|| Greenfoot.isKeyDown("w")) {
            move(5);
        }
        if (Greenfoot.isKeyDown("down")|| Greenfoot.isKeyDown("s")) {
            move(-5);
        } 

        if (Greenfoot.isKeyDown("space")) 
        {
            Worm myWormmy = new Worm();
            getWorld().addObject(myWormmy, getX() - 150, getY());
        }
        if(isTouching(Worm.class)) {
            //Greenfoot.playSound("au.wav");
            Greenfoot.playSound("beep.mp3");
            removeTouching(Worm.class);
        }
    }

}
