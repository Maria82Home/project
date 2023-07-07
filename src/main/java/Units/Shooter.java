package Units;

import java.util.ArrayList;

public abstract class Shooter extends BasicHero {
    public Shooter(int id, int healthLevel, String name, String type, int attackLevelBase, int initiative, int distance, int shoots, int x, int y) {
        super(id, healthLevel, name, type, attackLevelBase, initiative, x, y);
        this.distance=distance;
        this.shoots = shoots;
    }
    public int distance;
    public int shoots;

    public String getInfo(){
        return "Name="+name+" "+"type="+type+" "+"id="+id+" "+"health="+healthLevel+" "+"attack="
                +attackLevelBase+" "+"initiative="+initiative+" "+"distance="+distance+" "+"shoots="+shoots+" "+"x="+place.x+" "+"y="+place.y;
    }

    @Override
    public void step(ArrayList<BasicHero> enemies, ArrayList<BasicHero> ours) {

        if (this.healthLevel == 0 ) return;

        if (this.shoots == 0) return;

        BasicHero temp = findNearestEnemy(enemies);
        temp.healthLevel = temp.healthLevel - this.attackLevelBase;

        for (BasicHero item: ours){
            if (item.type.contains("Peasant")) return;
        }

        this.shoots--;

    }
}
