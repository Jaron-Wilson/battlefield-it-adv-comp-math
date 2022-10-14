
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ShowControls here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ShowControls extends Actor
{
    private Boolean enabled = true;
    /**
     * Act - do whatever the ShowControls wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        showControls(!enabled);
        if(Greenfoot.isKeyDown("=")){
            showControls(enabled);
        }
    }    

    public boolean showControls(Boolean shown){
        Boolean isTrue = false;
        if(shown == true){
            getWorld().showText(
                "Controls Player 1", 120, 15);
            getWorld().showText(
                "(Left & Right) Seeker", 120, 35);
            getWorld().showText(
                "(U,J,M) Beater", 120, 45);
            getWorld().showText(
                "(I,K,<) Chaser", 120, 75);

            getWorld().showText(
                "Controls Player 2", 300, 15);
            getWorld().showText(
                "(1 & 2) Seeker", 300, 35);
            getWorld().showText(
                "(Q,A,Z) Beater", 300, 45);
            getWorld().showText(
                "(W,S,X) Chaser", 300, 75);
            isTrue = true;
        }else if (shown == false){
            getWorld().showText(
                "Hold = to see controls",
                120, 15);
            getWorld().showText(
                " ", 120, 35);
            getWorld().showText(
                " ", 120, 45);
            getWorld().showText(
                " ", 120, 75);
            getWorld().showText(
                " ", 120, 95);

            getWorld().showText(
                " ",
                300, 15);
            getWorld().showText(
                " ", 300, 35);
            getWorld().showText(
                " ", 300, 55);
            getWorld().showText(
                " ", 300, 75);
            getWorld().showText(
                " ", 300, 95);
            isTrue = false;
        }
        return isTrue;
    }
}
