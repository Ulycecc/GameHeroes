import Units.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static Units.TypeUnit.*;

public class Game {
    public static void main(String[] args){
        Unit monk = new Monk();
        Unit archer = new Archer();
        System.out.println(monk.getInfo());
        System.out.println(archer.getInfo());
        monk.step();
        archer.step();



        teams team = new teams(10);
        List<Unit> team1 = team.createArray();
        List<Unit> team2 = team.createArray();
        System.out.println(team1);
        System.out.println(team2);
        for (int i = 0; i < 10; i++) {
            System.out.println(team1.get(i).getInfo() + "   " + team2.get(i).getInfo());
        }
    }
}

