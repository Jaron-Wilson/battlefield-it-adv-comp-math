import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 600, 1); 
        checkerboard();
    }

    public void checkerboard() {
        int xSize=getWidth()/8;
        int ySize=getHeight()/8;
        for(int i = 0; i < getWidth(); i += xSize){
            for (int y = 0; y < getHeight(); y+=ySize){
                int x = i;
                int num = x+y;
                if(num % 2 != 0){
                    Color white = Color.WHITE;
                    getBackground().setColor(white);
                }else {
                    Color black = Color.BLACK;
                    getBackground().setColor(black);
                }
                getBackground().fillRect(x, y, xSize, ySize);
            }
        }
    }
}
