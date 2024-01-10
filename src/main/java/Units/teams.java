package Units;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class teams {
    protected int teamCount;
    public teams(int teamCount) {
        this.teamCount = teamCount;
    }
    public List<Unit> createArray() {
        Random rand = new Random();

        List<Unit> team = new ArrayList<>();
        for (int i = 0; i < this.teamCount; i++) {
            int val = rand.nextInt(7);
            switch (val) {
                case 0:
                    team.add(new Archer());
                    break;
                case 1:
                    team.add(new Monk());
                    break;
                case 2:
                    team.add(new Peasant());
                    break;
                case 3:
                    team.add(new Robber());
                    break;
                case 4:
                    team.add(new Sniper());
                    break;
                case 5:
                    team.add(new Spearman());
                    break;
                case 6:
                    team.add(new Wizard());
                    break;
            }

        }
        return team;
    }
}
