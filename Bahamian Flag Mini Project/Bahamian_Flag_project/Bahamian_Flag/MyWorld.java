import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author Jaron Wilson
 * @version 3/8/23
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
        super(600, 400, 1); 
        createFlag();
    }

    public void createFlag() {
        int width = 350;
        int height = getHeight()/3;
        int flagTri = getHeight()/2;
        Color color1 = Color.CYAN;
        Color color2 = Color.YELLOW;
        Color triColor = Color.BLACK;

        //Could use an array list to make this quicker to loop through all of the colors.
        createLines(0, height, color1);
        createLines(height, height*2, color2);
        createLines(height*2, getHeight(), color1);
        createTriangles(width, triColor);

    }

    private void createLines(int start, int height, Color color) {
        for(int x = 0; x <= getWidth()-1; x++) {
            for(int y = start; y < height; y++) {
                getBackground().setColorAt(x, y, color);
            }
        }
    }

    private void createTriangles(int width, Color color) {
        // TOP TRIANGLE
        /* 
        starts at (0,0)
        and goes southeast to
        (width/3,getHeight()/2)
        hits (0, getHeight()/2)
         */
        for(int x = 0; x <= width; x++) {
           for(int y = x; y < 200; y++ ){
               getBackground().setColorAt(x, y, color);
           }
        }
        // BOTTOM TRIANGLE
        /*
        starts at (0, getHeight()/2)
        and goes right to
        (width/3,getHeight()/2)
        hits (0, getHeight()) 
         */
        for(int x = 0; x <= width; x++) {
           for(int y = getHeight()/2; y < 400-x; y++){
               getBackground().setColorAt(x, y,color);
          }
        }

    }
}
