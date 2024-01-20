import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import Units.*;



public class Main {
    public static List<Hero> team1;
    public static List<Hero> team2;
    public static List<Hero> allTeam = new ArrayList<>();
    public static void main(String[] args){


        team1 = new Teams(10, true).createArray();
        team2 = new Teams(10, false).createArray();
        allTeam.addAll(team1);
        allTeam.addAll(team2);
        Collections.sort(allTeam, (o1, o2) -> o1.initiative - o2.initiative);
        System.out.println(team1);
        System.out.println(team2);
        Scanner in = new Scanner(System.in);
        while (true){


            View.view();
            in.nextLine();

            for(int i = allTeam.size() - 1; i >= 0; --i)
            {
                if(allTeam.get(i).die)
                {
                    allTeam.remove(i);
                }
            }
            for (Hero hero: allTeam){
                if(team2.contains(hero)){
                    hero.step(team1,team2);
                }else hero.step(team2,team1);
            }



            if(Teams.isTeamDie(team1)){
                System.out.println("Team 2 (Blue) win");
                break;
            }
            if(Teams.isTeamDie(team2)){
                System.out.println("Team 1 (Green) win");
                break;
            }
            }
        }


}
