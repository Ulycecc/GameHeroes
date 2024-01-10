package Units;
import java.util.*;

public abstract class Unit implements inGameInterface{
    protected float hp;
    protected float curHP;
    protected String name;
    protected int attack;
    protected int defense;
    protected int[] damage;
    public String getName() {

        String s = String.valueOf(Names.values()[new Random().nextInt(Names.values().length)]);
        return s;
    }

    public Unit(float hp, int attack, int defense, int[] damage) {
        this.hp = this.curHP = hp;
        this.name = getName();
        this.attack = attack;
        this.defense = defense;
        this.damage = damage;
    }

    @Override
    public String toString() {
        return name;
    }
    public String getInfo1() {
        String s = this.getClass().getSimpleName() + ": " + this.name;
        return s;
    }


}
