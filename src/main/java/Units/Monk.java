package Units;

import java.util.List;

public class Monk extends Magicians{
    public Monk(Coordinates xy){
        super(15,-5);
        this.xy = xy;
    }
    private void manaCast(){}
    private void manaAdd(){}


    @Override
    public void step(List<Hero> team1, List<Hero> team2) {
        return;
    }




}
