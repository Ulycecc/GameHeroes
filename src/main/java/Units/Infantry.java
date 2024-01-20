package Units;


import java.util.HashSet;
import java.util.List;

import static java.lang.Math.abs;

public abstract class Infantry extends Hero{
    public Infantry(float hp, int attack) {
        super(hp, attack);
        super.initiative = 7;
    }
    @Override
    public void step(List<Hero> team1, List<Hero> team2){
        if(this.curHP == 0) return;
        Hero enemy = this.nearest(team1);
        System.out.println(enemy);
        if((abs(this.xy.x - enemy.xy.x)==1 && abs(this.xy.y - enemy.xy.y)==0)||(abs(this.xy.x - enemy.xy.x)==0 && abs(this.xy.y - enemy.xy.y)==1)){
            enemy.GetDamage(this.attack);
            return;
        }
        HashSet<Coordinates> nearestCells = this.nearestCells();
        HashSet<Coordinates> nearestFour = this.nearestFour(team2);
        nearestCells.removeAll(nearestFour);
        Double len = enemy.xy.length(this.xy);
        Coordinates stepCoord = this.xy;
        for (Coordinates Coord : nearestCells){

            if (len > enemy.xy.length(Coord)){
                len = enemy.xy.length(Coord);
                stepCoord = Coord;

            }
        }
        this.xy = stepCoord;
        System.out.print(stepCoord);
    }
}

