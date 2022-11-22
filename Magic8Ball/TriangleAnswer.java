import greenfoot.*;


public class TriangleAnswer extends Actor
{
    public void randomize()
    {
        /*
         * In this randomize method you will practice a bit of 
         * variables, random numbers, and if/else if statements.
         * The below steps are <not> the best way to do this task,
         * but utilize your current knowledge.
         * 
         * Create a variable and store a random int from {1,2,3...20}
         * Ask if your variable is 1, if so set its image to 1.png
         * Otherwise, ask if it is 2, if so set its image to 2.png
         * Otherwise, ask if it is 3, if so set its image to 3.png
         * ...repeat up until the 20th, which should be 20.png
         * The last one should be an else, not an else if.
         */
        
        int randomInt = (int) (Math.random() * 20) +1;
        
        setImage(randomInt +".png");
    }
    
    
}
