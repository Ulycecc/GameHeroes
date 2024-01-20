package Units;

import java.util.List;

// Крестьянин
public class Peasant extends Hero{


    public Peasant (Coordinates xy){
        super(15,5);
        this.xy = xy;
        super.initiative = 1;
    }

    @Override
    public void step(List<Hero> team1, List<Hero> team2) {
        if(die) this.status = "busy";

    }





}
