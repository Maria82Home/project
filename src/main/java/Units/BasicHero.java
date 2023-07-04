package Units;

import Units.Actions;
import Units.Coordinates;

import java.util.ArrayList;

public abstract class BasicHero implements Actions {
    int id;
    int healthLevel;
    String name;
    String type;
    int attackLevelBase;
    int initiative;
    protected Coordinates place;

    public BasicHero(int id, int healthLevel, String name, String type, int attackLevelBase, int initiative, int x, int y) {
        this.id = id;
        this.healthLevel = healthLevel;
        this.name = name;
        this.type = type;
        this.attackLevelBase = attackLevelBase;
        this.initiative = initiative;
        place = new Coordinates(x, y);
    }

    protected int[] findNearestEnemy(ArrayList<BasicHero> enemies) {
        double min = 100000;
        int count = 0;
        for (int i = 0 ; i<enemies.size(); i++){
            if (place.calcDistance(enemies.get(i).place) < min){
                min = place.calcDistance(enemies.get(i).place);
                count = i;
            }
        }
//        System.out.println("distance="+Math.round(min)+" enemy name="+enemyName);
        return new int[]{(int)Math.round(min), count};
    }

}
