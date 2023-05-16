import greenfoot.*;

public class Tree extends World
{

    public Tree()
    {    
        super(1000, 750, 1);
        Leaf.reset();
    }

    public void addLeaves( int amount )
    {
        for(int i = 0; i < amount; i++){
            addRandomLeaf();
        }
    }

    public void increaseLeavesTo( int amount )
    {
        while (Leaf.getNumLeaves()  < amount){
            addRandomLeaf();
        }
    }
    
    private void addRandomLeaf() {
        Leaf leaf = new Leaf();
            int x = (int)(Math.random() *801)+100;
            int y = (int)(Math.random() * 401);
            addObject(leaf, x, y);
    }
}
