import greenfoot.*;
/**@autor: Jaron Wilson*/
public class Magic8Ball extends Actor
{
    //Leave this field alone, this will be the Triangle on the screen
    private TriangleAnswer triangle = new TriangleAnswer();

    public void act() 
    {
        // Ask if the mouse has been dragged on the current object
        // If so, build a MouseInfo variable and get the mouse from Greenfoot
        // Teleport to the location of the Mouse
        // Ask if you are touching a TriangleAnswer.class
        // If so, remove the TriangleAnswer.class

        // Ask if the mouse has stopped being dragged on the current object
        // If so, call triangle's randomize method
        // Create two variables, xMove and yMove, set them to 
        //        a random value from {-100, -99, -98, ... 99, 100 }
        // add the triangle to the world at (yourX + xMove, yourY + yMove)

        if(Greenfoot.mouseDragged(this)){
            MouseInfo m = Greenfoot.getMouseInfo();
            setLocation(m.getX(), m.getY());
            if(isTouching(TriangleAnswer.class)){
                removeTouching(TriangleAnswer.class);
            }
        }
        if(Greenfoot.mouseDragEnded(this)){
            triangle.randomize();
            int xMove = (int) (Math.random() * 201) - 100;
            int yMove = (int) (Math.random() * 201) - 100;
            getWorld().addObject(triangle, getX() + xMove,getY() + yMove);
        }
    }    
}
