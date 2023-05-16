import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Dropper here.
 * 
 * @author Jaron Wilson 
 * @version 2/3/23
 */
public class Dropper extends Actor
{
    /**
     * Act - do whatever the Dropper wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        movement(5,90);
        buildObject((int)(Math.random() * 10));
    }    
    
    public void movement(int number, int turn) {
        move(number);
        move(-number);
        turn(turn);
        turn(-turn);
    }
    
    public void buildObject(int randomNumber) {
        for(int i = 0; i <= randomNumber; i++){
        if(Greenfoot.isKeyDown("space")){
            getWorld().addObject(new Mover(), getX(), getY());
        }
        //Change buildObject((int)(Math.random() * 10)) and alter the code so it
//compiles correctly and that is generates a random number of objects each time
//you press the space bar. 
    
    }
}
}
