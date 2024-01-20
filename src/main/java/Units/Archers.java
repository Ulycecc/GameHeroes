package Units;

import java.util.List;

public abstract class Archers extends Hero {
    int amo;

    int maxAmo = 10;
    public Archers(float hp, int attack) {
        super(hp, attack);
        this.amo = maxAmo;
        super.initiative = 10;
    }
    public void step(List<Hero> team1, List<Hero> team2) {
/*
* Реализовать степ лучника. По действиям.
1.Если жизни 0 вернуть управление
2.Если стрел 0 вернуть управление
3.Найти ближайшего противника
4.Нанести ему среднее повреждение
5.Если среди своих есть крестьянин вернут ь управление
6.уменьшить кол-во стрел на одну и вернуть управление

Вызывать персонажей из обеих комманд в порядке инициативы.*/
        if ((this.hp == 0) || (this.amo == 0)) {
            return;
        }
        Hero enemy = this.nearest(team2);
        enemy.GetDamage(this.attack);
        for (Hero x : team1) {
            if (x.getClass().getSimpleName().equals("Peasant")) {
                if (x.status.equals("stand")) {
                    x.status = "busy";
                    return;
                }

            }
            amo -= 1;
        }
        return;
    }
}
