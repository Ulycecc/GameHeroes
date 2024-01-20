package Units;

import java.util.List;

public abstract class Magicians extends Hero{
    public Magicians(float hp, int attack) {
        super(hp, attack);
        super.initiative = 3;
    }
    @Override
    public void step(List<Hero> team1, List<Hero> team2) {
        for (Hero x : team2) {
            if (x.hp < x.curHP) {
                x.GetDamage(this.attack);
                return;
            }

        }
    }
}
