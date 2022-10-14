import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Spawns Objects onto screen and adds a Snitch at a random spot and
 * and only works .001 amount of the time act() is called.
 * 
 * @author Jaron Wilson 
 * @version 10-1-22
 */
public class Field extends World
{
    public Field()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 530, 1);
        prepare();
        act();
    }
    public void act() {
        if( Math.random() <  0.001 )
        {
            Snitch snitch = new Snitch(); 
            addObject(snitch, (int)(Math.random() * getWidth()),
                (int)(Math.random() * getHeight()));
        }
    }
    private void prepare()
    {
        ScoreBoard scoreB = new ScoreBoard();
        addObject(scoreB, 506,31);
        ShowControls showC = new ShowControls();
        addObject(showC, 38,26);
        Seeker seeker = new Seeker(scoreB);
        addObject(seeker,461,277);
        Beater beater = new Beater();
        addObject(beater,680,247);
        Beater beater2 = new Beater();
        addObject(beater2,679,322);
        Chaser chase = new Chaser();
        addObject(chase,594,253);
        Chaser chasery = new Chaser();
        addObject(chasery,590,320);
        GoalHoop good = new GoalHoop(scoreB);
        addObject(good,936,131);
        GoalHoop2 bad = new GoalHoop2(scoreB);
        addObject(bad,60,114);
        SeekerGood seekerGood = new SeekerGood(scoreB);
        addObject(seekerGood,542,286);

        BeaterBad beaterBad = new BeaterBad();
        addObject(beaterBad,343,262);
        BeaterBad beaterBad2 = new BeaterBad();
        addObject(beaterBad2,339,321);
        ChaserBad chaserBad = new ChaserBad();
        addObject(chaserBad,409,260);
        ChaserBad chaserBad2 = new ChaserBad();
        addObject(chaserBad2,405,312);
    }

}
