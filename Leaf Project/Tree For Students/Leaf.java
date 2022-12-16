import greenfoot.*;

public class Leaf extends Actor
{
    /*  Fields Go Here */
    public static int numLeaves;
    private int timer, dx;
    private boolean fallingRight;

    /*  This is a Constructor */
    public Leaf()
    {
        int i = (int)(Math.random() *3) + 1;
        setImage("Leaf" + i + ".png");
        //Set rotation 0-360 = 361
        setRotation((int)(Math.random() * 361));
        // 100-1000 = 901
        timer = (int)(Math.random() * 901)+ 100;
        // 50% = 0.50
        if(Math.random() < 0.50)
            fallingRight = true;
        else fallingRight = false;
        numLeaves++;

    }

    public void act() 
    {
        timer--;
        if(timer <= 0) {
            setLocation(getX() + dx/2, getY() + 5 -Math.abs(dx)/4);
            if(fallingRight == true){
                dx++;
                if(dx > 20)
                    fallingRight = false;
            }else {
                dx--;
                if(dx < -20)
                    fallingRight = true;
            }
            
            if(getY() > 600){
                numLeaves--;
                getWorld().removeObject(this);
            }
            
        }

    }    

    
    public static int getNumLeaves()
    {
    return numLeaves;
    }

    public static void reset()
    {
    numLeaves = 0;
    }
}
