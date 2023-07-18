package Units;

import java.util.ArrayList;

public abstract class Shooter extends BasicHero {
    public Shooter(int id, int healthLevel, String name, String type, int attackLevelBase, int initiative, int shoots, int x, int y) {
        super(id, healthLevel, name, type, attackLevelBase, initiative, x, y);
        this.shoots = shoots;
    }
    public int distance;
    public int shoots;

    public String getInfo(){
        return name+" "+type+" "+"\u2661 "+healthLevel+" "+"\u2694 "
                +attackLevelBase+" "+"initiative="+initiative+" "+"shoots="+shoots;
    }

    @Override
    public void step(ArrayList<BasicHero> enemies, ArrayList<BasicHero> ours) {

        if (this.healthLevel == 0 ) return;

        if (this.shoots == 0) return;

        BasicHero temp = findNearestEnemy(enemies);
        temp.getDamage(this.attackLevelBase);

        for (BasicHero item: ours){
            if (item.type.contains("Peasant") && !((Peasant)(item)).busy && item.healthLevel>0) {
                ((Peasant)(item)).busy = true;
                return;
            }
        }

        this.shoots--;

    }
}
