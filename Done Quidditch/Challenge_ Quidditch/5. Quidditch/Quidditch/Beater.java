import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Beater here.
 * 
 * @author Jaron Wilson 
 * @version (a version number or a date)
 */
public class Beater extends Actor
{
    /* this is the time delay for the shots */
    private int shotTime = 0;
    /**
     * Act - do whatever the Beater wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        /* The Beaters turn randomly every act a small
        amount randomly from 0 to 10 degrees.  */
        turn((int) (Math.random() * 11)+0);
        if(Greenfoot.isKeyDown("u")){
            setLocation(getX(), getY() -5);
        }
        if(Greenfoot.isKeyDown("j")){
            setLocation(getX(), getY() +5);
        }
        // Is X Key down?
        if(Greenfoot.isKeyDown("m")){
            // check the shot time
            if(shotTime <= 0) {
                /*if its less than or equal to 0 do this:
                Create new object */
                Bludger bludger = new Bludger();
                // set object to the rotation of player
                bludger.setRotation(getRotation());
                //add it to the world
                getWorld().addObject(bludger,
                    /* to this location
                    get the players X cordate and add 15
                    get the players Y cordate and add 10 */
                    getX() + 15, getY() + 10);
                // then set the shotTime to 15 second cool down
                shotTime = 15;
            }else {
                /* else if its bigger than or not equal to 0
                subtract 1 everytime */
                shotTime--;
            }

        }
        /*When a Beater hits a Quaffle,
        it removes the Quaffle from the screen (think defense).*/ 
        if (isTouching(Quaffle.class)) {
            removeTouching(Quaffle.class);
        }
    }    
}
