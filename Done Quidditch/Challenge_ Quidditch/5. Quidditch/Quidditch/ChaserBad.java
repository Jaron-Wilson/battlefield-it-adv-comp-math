import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ChaserBad here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ChaserBad extends Actor
{
    /* this is the time delay for the shots */
    private int shotTime = 0;
    /**
     * Act - do whatever the ChaserBad wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        // Turn Character
        turn((int) (Math.random() * 31)-15);
        if(Greenfoot.isKeyDown("W")){
            setLocation(getX(), getY() -5);
        }
        if(Greenfoot.isKeyDown("S")){
            setLocation(getX(), getY() +5);
        }
        if(Greenfoot.isKeyDown("x")){
            // check the shot time
            if(shotTime <= 0) {
                /*if its less than or equal to 0 do this:
                Create new object */
                Quaffle quaffle = new Quaffle();
                // set object to the rotation of player
                quaffle.setRotation(getRotation());
                //add it to the world
                getWorld().addObject(quaffle,
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
        if(isTouching(Bludger.class)){
            removeTouching(Bludger.class);
            Greenfoot.playSound("thud.wav");
            // Size of board:
            // super(1000, 530, 1);
            setLocation(
                (int) (Math.random() * 471) + 530,
                (int) (Math.random() * 471) + 530
            );
        }
    }    
}
