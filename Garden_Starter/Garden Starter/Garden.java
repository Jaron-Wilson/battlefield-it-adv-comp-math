import greenfoot.*;

public class Garden extends World
{
    public Garden()
    {    
        super(1000, 800, 1); 
        buildWildFlowers(20);
    }
   
    public int getRandomX() {
        return (int)(Math.random() * getWidth()+1);
    }

    public int getRandomY() {
        return (int) (Math.random() * getHeight()+1);
    }

    public void buildWildFlowers(int ammountOfFlowers) {
        for (int i = 0; i < ammountOfFlowers; i++) {
            int flowerType = (int) (Math.random() * 4);
            Flower flower = new Flower(flowerType);
            addObject(flower, getRandomX(), getRandomY());
        }
    }
}
