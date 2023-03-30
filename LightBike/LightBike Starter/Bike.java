import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bike here.
 * 
 * @author Jaron Wilson
 * @version 3/28/23
 */
public class Bike extends Actor
{
    /*
        a. boolean to represent if the bike is blue 
        b. String to represent the bike’s control: up 
        c. String to represent the bike’s control: down 
        d. String to represent the bike’s control: left 
        e. String to represent the bike’s control: right
    */
    private boolean color;
    private String up;
    private String down;
    private String left;
    private String right;

    /*
        Build a constructor that is sent a boolean parameter to represent if the Bike is blue.  
        i. The constructor should store this information in its permanent field variable
    */
    public Bike(boolean colorOfBike) {
        this.color = colorOfBike;

        if(color) {
            /*
               If it is true...  
               1. Set the image to the blue bike (bike1.png)  
               2. Set its controls to...  
               a. “W” = up  
               b. “S” = down  
               c. “A” = left  
               d. “D” = right
            */
            setImage("bike1.png");
            this.up = "w";
            this.down = "s";
            this.left = "a";
            this.right = "d";
        }else {
            /*
                If it is false... 
                1. Set the image to the red bike (bike2.png) 
                2. Set its controls to... 
                a. “up” = up 
                b. “down” = down 
                c. “left” = left 
                d. “right” = right 
            */
            setImage("bike2.png");
            this.up = "up";
            this.down = "down";
            this.left = "left";
            this.right = "right";
        }
    }


    public void act() {
        movement();
        buildTrail();
    }

    /*
     buildTrail()  
        i. Takes in no parameters 
        ii. Build a Trail object with the boolean parameter of the Bike’s current color 
        iii. Ask the world to place the Trail on the screen at the same location of the Bike
    */
    public void buildTrail() {
        Trail trail = new Trail(color);
        getWorld().addObject(trail, getX(), getY());
    }

    public void movement() {
        move(5);
        if(Greenfoot.isKeyDown(left)) {
            setRotation(90*2);
        }
        /*else {
            System.out.println("key: " + up + ", Rotation: " +getRotation());
        }*/
        if(Greenfoot.isKeyDown(down)) {
            setRotation(90);
        }
        if(Greenfoot.isKeyDown(right)) {
            setRotation(0);
        }
        if(Greenfoot.isKeyDown(up)) {
            setRotation(90 *3);
        }
    }
}
