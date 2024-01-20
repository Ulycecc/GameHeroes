package Units;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Teams{
    private final boolean side;
    protected int teamCount;


    public Teams(int teamCount, boolean side) {
        this.teamCount = teamCount;
        this.side = side;
    }
    public List<Hero> createArray() {
        Random rand = new Random();
        List<Hero> team = new ArrayList<>();
        int y = Coordinates.y_min;
        int x;
        if (side) x = Coordinates.x_min;
        else x = Coordinates.x_max;

        for (int i = 0; i < this.teamCount; i++) {
            int val = rand.nextInt(7);
            switch (val) {
                case 0:
                    team.add(new Archer(new Coordinates(x, y)));
                    break;
                case 1:
                    team.add(new Monk(new Coordinates(x, y)));
                    break;
                case 2:
                    team.add(new Peasant(new Coordinates(x, y)));
                    break;
                case 3:
                    team.add(new Robber(new Coordinates(x, y)));
                    break;
                case 4:
                    team.add(new Sniper(new Coordinates(x, y)));
                    break;
                case 5:
                    team.add(new Spearman(new Coordinates(x, y)));
                    break;
                case 6:
                    team.add(new Wizard(new Coordinates(x, y)));
                    break;
            }
            y += 1;


        }
        return team;
    }
    public static boolean isTeamDie(List<Hero> team){
        boolean die = true;
        for (Hero hero : team){
            die = die && hero.die;
        }
        return die;
    }

}
