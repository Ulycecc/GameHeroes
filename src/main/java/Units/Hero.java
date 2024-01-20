package Units;

import java.util.*;

public abstract class Hero implements inGameInterface{
    protected float hp;
    public float curHP;
    protected String name;
    protected int attack;

    public Coordinates xy;
    protected boolean side = true;
    public boolean die = false;
    public int initiative;
    String status = "stand";

    public String getName() {
        String s = String.valueOf(Names.values()[new Random().nextInt(Names.values().length)]);
        return s;
    }

    public Hero(float hp, int attack) {
        this.hp = this.curHP = hp;
        this.name = getName();
        this.attack = attack;

    }

    @Override
    public String toString() {
        return name;
    }
    public String getInfo() {
        String s = this.getClass().getSimpleName() + ": " + this.name + "hp"+ ": " + this.hp;
        return s;
    }
//    Поиск ближайшего юнита
    public Hero nearest(List<Hero> team){
        team.sort((Comparator<Hero>) (o1, o2) -> xy.length(o1.xy).compareTo(xy.length(o2.xy)));
        for (Hero hero : team) {
            if (hero.die == false) return hero;
        }
        return team.getFirst();
    }

// Смерть юнита
    public void die() {
        this.die = true;
        this.hp = 0;
    }
// Нанесение урона
    public void GetDamage(int damage) {
        if (this.hp - damage > 0) {
            this.hp -= damage;
        }
        else { this.die(); }
    }

//    Набор ближайших клеток к герою
    public HashSet<Coordinates> nearestCells(){
        HashSet<Coordinates> nearestCells = new HashSet<Coordinates>();
        nearestCells.add(this.xy.creatingCoordinates(1,0));
        nearestCells.add(this.xy.creatingCoordinates(-1,0));
        nearestCells.add(this.xy.creatingCoordinates(0,1));
        nearestCells.add(this.xy.creatingCoordinates(0,-1));
        nearestCells.add(this.xy);
        return nearestCells;

    }
//    Набор координат четырех ближайших юнитов
public HashSet<Coordinates> nearestFour(List<Hero> team){
    HashSet<Coordinates> nearestFour = new HashSet<Coordinates>();
    team.sort((Comparator<Hero>) (o1, o2) -> xy.length(o1.xy).compareTo(xy.length(o2.xy)));
    for(int i = 0; i < 4; i++){
        nearestFour.add(team.get(i).xy);
    }
    return nearestFour;
}





}
