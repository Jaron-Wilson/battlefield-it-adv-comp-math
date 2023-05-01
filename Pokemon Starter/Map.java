
import greenfoot.*;

public class Map extends World
{
    public Map()
    {    
        super(1024, 768, 1); 
        Pokemon.reset();
        setUpBuilding();
        addWildPokemon(Pokemon.numPokemon);
        addPlayers();
    }

    public void setUpBuilding() {
        addObject(new Gym(1), 746,483);
        addObject(new Gym(2), 280,468);
        addObject(new Gym(3), 532,130);
        addObject(new Gym(4), 150,100);
        addObject(new Building(), 545,427);
    }

    public void addWildPokemon(int numPokemon) {
        for(int i = 0; i <= numPokemon; i++) {
            WildPokemon wp = new WildPokemon();
            addObject(wp, 150, 130);
        } 
    }

    public void addPlayers() {
        Pokemon p1 = new Pokemon("W", "S", "A","D");
        addObject(p1,290,100);
        Pokemon p2 = new Pokemon("I", "K", "J","L");
        addObject(p2,500,100);
        Pokemon p3 = new Pokemon("up", "down", "left","right");
        addObject(p3,800,100);
        Pokemon p4 = new Pokemon("8", "5", "4","6");
        addObject(p4,390,100);
    }

    public void act() {
        // 0.5%
        if( Math.random() <  0.0005 ){
            addWildPokemon(1);
        }
        
    }
}
