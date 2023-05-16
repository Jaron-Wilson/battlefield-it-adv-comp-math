import greenfoot.*;

public class Flower extends Actor
{
    /**
     *  a. SHARED final literal String array: names 
     * i. This array stores the names of possible Flowers
     * ii. Store: “Daisy”, “Orchid”, “SunFlower”, “Tulip”
     * iii. Note: Be careful of the spelling!
     */
    public static final String[] names = new String[] {"Daisy", "Orchid", "SunFlower", "Tulip"};

    /**
     * b. SHARED final literal int array: fadingAge 
     * i. This array stores the age when a Flower starts to fade.  
     * ii. Store: 500, 100, 2000, 600 
     * iii. This array is associated with the names[] in that a Daisy takes 500 before it starts to 
     * fade, the Orchid takes 100 before it starts to fade, etc. 
     */
    public static final int[] fadingAge = new int[] {500,100,2000,600};

    /**
     * c. SHARED final literal double array: spreadChance 
     * i. This array stores the decimal percentage of a Flower spreading 
     * its seeds in the Garden.  
     * ii. Store: 0.002, 0.0015, 0.001, 0.0022 
     * iii. This array is associated with the names[] in that a Daisy has a 0.2% chance of 
     * spreading, an Orchid has a 0.15% chance of spreading, etc.
     */

    public static final double[] spreadChance = new double[] {0.002, 0.0015, 0.001, 0.0022};

    /**
     * d. SHARED final int: spreadDistance 
    i. Set equal to 101;
     */
    public static final int spreadDistance = 101;

    /**
     * e. int: age, transparency, type
     */
    private int age, transparency, type;

    public Flower(int type) {
        this.type = type;
        age = 0;
        transparency = 255;
        String imageString = names[type] + ".png";
        setImage(imageString);
    }

    public void age() {
        age++;
        if(age > fadingAge[type]) {
            getImage().setTransparency(transparency);
            transparency--;

        }
        if(transparency <= 0) {
            getWorld().removeObject(this);
        }
    }

    public void spread() {
        if(age > fadingAge[type]/2 && Math.random() < spreadChance[type]) {
            Flower flower = new Flower(type);

            int x = getX() + (int)( Math.random() * spreadDistance ) - spreadDistance / 2; 
            int y = getY() + (int)( Math.random() * spreadDistance ) - spreadDistance / 2;

            getWorld().addObject(flower, x, y);
        }
    }

    public void act() {
        spread();
        age();
    }
}
