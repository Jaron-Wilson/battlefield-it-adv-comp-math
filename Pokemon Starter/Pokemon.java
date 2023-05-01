import greenfoot.*;

public class Pokemon extends Actor
{
    private GifImage img;
    // FIELD VARIABLES
    private String up, down, left, right;
    private boolean gym1,gym2,gym3,gym4;
    private int hitPoints, pokeNum;
    public static int numPokemon;

    // CONSTRUCTORS
    public Pokemon () {
        numPokemon++;
        pokeNum = numPokemon;
        hitPoints = 100;
        this.up = "up";
        this.down = "down";
        this.left = "left";
        this.right = "right";

        //GIVE US A RANDOM NUMBER FOR EACH SLOT
        int rand100 = (int) (Math.random() * 2);// * 100;
        int rand10 = (int) (Math.random() * 6);// * 10;
        // COULD DO +1 AND NOT CHECK THE 000
        int rand1 = (int) (Math.random() * 10);

        // put them together so that we can check if the int is smaller or greater then the desired number
        int num = (rand100 *100) + (rand10 * 10) + (rand1);

        // we have images less than 151 and greater than 0
        if( num <= 151 && num >000) {
            img = new GifImage(rand100+ "" + rand10 + "" + rand1 +".gif");
            setImage(img.getCurrentImage());
        }
    }
    // ALT CONSTRUCTOR
    public Pokemon(String upControl, String downControl, String leftControl, String rightControl) {
        numPokemon++;
        pokeNum = numPokemon;

        //GIVE US A RANDOM NUMBER FOR EACH SLOT
        int rand100 = (int) (Math.random() * 2);// * 100;
        int rand10 = (int) (Math.random() * 6);// * 10;
        // COULD DO +1 AND NOT CHECK THE 000
        int rand1 = (int) (Math.random() * 10);

        // put them together so that we can check if the int is smaller or greater then the desired number
        int num = (rand100 *100) + (rand10 * 10) + (rand1);

        // we have images less than 151 and greater than 0
        if( num <= 151 && num >000) {
            img = new GifImage(rand100+ "" + rand10 + "" + rand1 +".gif");
            setImage(img.getCurrentImage());
        }
        hitPoints = 100;
        this.up = upControl;
        this.down = downControl;
        this.left = leftControl;
        this.right = rightControl;
    }

    public void act() {

        setImage(img.getCurrentImage());
        displayHP();
        movement();
        checkGym();
        checkVictory();
        checkHitWild();
        reset();
    }

    
    public void displayHP() {
        // X NEEDS TO BE: Displays the text of the Player’s HP at the coordinate (200∙𝑋,50),
        //for(int i = 1; i <= numPokemon; i++){
            getWorld().showText("Player " + pokeNum + ": " + hitPoints, 200 * pokeNum , 50);
        //}
    }

    public void movement() {
        if(Greenfoot.isKeyDown(up)){
            move(5);
        }if(Greenfoot.isKeyDown(down)){
            move(-2);
        }if(Greenfoot.isKeyDown(left)){
            turn(-3);
        }if(Greenfoot.isKeyDown(right)){
            turn(3);
        }
    }

    public void checkGym() {
        if(isTouching(Gym.class)) {
            Gym g = (Gym)getOneIntersectingObject( Gym.class ); 
            int num = g.getNumber();
            if(num == 1) {
                gym1 = true;
            }else if (num == 2) {
                gym2 = true;
            }else if (num == 3) {
                gym3 = true;
            }else if(num == 4){
                gym4 = true;
            }else {
                System.out.println("No gym recorded! Number: " + num);
            }
        }

    }

    public void checkVictory() {
        if(gym1 && gym2 && gym3 && gym4 && isTouching(Building.class)) {
            // We have to loop because it resets if we just scale it, so we have to scale all images,
            // so that we can see it big!
            for (GreenfootImage image : img.getImages())
            {
                image.scale(image.getWidth() *2,image.getHeight() *2);
                Greenfoot.stop();
            }
        }
    }

    public void checkHitWild() {
        if(isTouching(WildPokemon.class)) {
            hitPoints--;
            if(hitPoints <=0 ) {
                getWorld().removeObject(this);
            }
        }
    }

    public static void reset(){ 
        numPokemon = 0;  
    }
}
