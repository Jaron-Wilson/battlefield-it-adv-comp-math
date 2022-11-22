import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Background extends World
{

    public Background()
    {    

        // Leave the next four lines alone
        super(1000, 800, 1, false); 
        getBackground().setColor( new Color (79, 13, 150));
        getBackground().fill();
        setPaintOrder( Magic8Ball.class, TriangleAnswer.class );

        
        
        //1) Use the showText method to display "Ask a Question Out Loud"
        //   at the center of the screen near the top.
        showText("Ask a Question Out Loud", getWidth()/2, getHeight()-750);
        
        //2) Use the showText method to display "Then shake the Magic 8 Ball!"
        //   at the center of the screen near the top.
        showText("Then shake the Magic 8 Ball!", getWidth()/2, getHeight()-725);
        
        //3) Build a Magic8Ball and place it in the center of the screen
        Magic8Ball ball = new Magic8Ball();
        addObject(ball, getWidth()/2, getHeight()/2);
        
    }

}
