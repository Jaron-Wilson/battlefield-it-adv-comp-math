import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Count up the score and time played.
 * 
 * @author Jaron Wilson 
 * @version 10-1-22
 */
public class ScoreBoard extends Actor
{
    // Count up score variable.
    private int scoreTeam1;
    private int scoreTeam2;
    // Count up the time variable.
    private int millisElapsed = 0;
    private long lastTime = 0;

    public void act() {
        // get time in milliseconds
        long time = System.currentTimeMillis();
        // check if lastTime not equal to 0
        if(lastTime != 0) {
            long diff = time - lastTime;
            millisElapsed += diff;
        }
        lastTime = time;

        update();
    }

    public void update() {
        // Calculate minutes & seconds elapsed
        int secs = (millisElapsed / 1000) % 60;
        int mins = millisElapsed / 60000;
        // Convert these into text
        //%02d adds 2 -> 0 -> 00 to the end of the number
        String secsText = String.format("%02d", secs);
        // Minutes can stay as a whole number
        String minsText = "" + mins;
        String text = minsText + ":" + secsText;
        //Add the image to the world.
        getWorld().showText(text, getX(), getY());

        // add the score to the screen.
        getWorld().showText(getScore2() + "", getX() + 50, getY());
        getWorld().showText(getScore1() + "", getX() - 50, getY());
    }

    // Getter ScoreTeam1
    public int getScore1() {
        return scoreTeam1;
    }
    // add and increase score for ScoreTeam1
    public int getAndIncrementScore1(int score1) {
        scoreTeam1+=score1;
        return scoreTeam1;
    }
    // Getter ScoreTeam2
    public int getScore2() {
        return scoreTeam2;
    }
    // add and increase score for ScoreTeam2
    public int getAndIncrementScore2(int score) {
        scoreTeam2+=score;
        return scoreTeam2;
    }
}
