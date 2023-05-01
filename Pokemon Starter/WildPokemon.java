import greenfoot.*;

public class WildPokemon extends Actor
{
    private GifImage img;
    private int speed;

    public WildPokemon() {
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
        speed = (int) (Math.random() * 4) + 1;
        // System.out.println(speed);
        // Random rotation from 0->359
        int rotation = (int)(Math.random() * 360);

        setRotation(rotation);
    }

    public void act() {
        setImage(img.getCurrentImage());
        movement();

    }

    public void movement() {
        move(speed);

        if( Math.random() <  0.001 ){
            setRotation((int) (Math.random() * 360));
        }
        if(isAtEdge()){
            turn(180);
        }
    }
}
