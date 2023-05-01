import greenfoot.*;

public class Gym extends Actor
{
    private int gymNumber = 1;

    public Gym(int gymNumber){
        this.gymNumber = gymNumber;
    }

    // METHODS
    public int getNumber() {
        return gymNumber;
    }

}
