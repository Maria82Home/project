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

    public int getInitiative() {
        return initiative;
    }

    protected Coordinates place;

    public Coordinates getPlace(){
        return place;
    }

    public int getHealthLevel() {
        return healthLevel;
    }

    public BasicHero(int id, int healthLevel, String name, String type, int attackLevelBase, int initiative, int x, int y) {
        this.id = id;
        this.healthLevel = healthLevel;
        this.name = name;
        this.type = type;
        this.attackLevelBase = attackLevelBase;
        this.initiative = initiative;
        place = new Coordinates(x, y);
    }

    @Override
    public String toString() {
        return super.getClass().getSimpleName();
    }

    protected BasicHero findNearestEnemy(ArrayList<BasicHero> enemies) {
        double min = 100000;
        int count = 0;
        for (int i = 0 ; i<enemies.size(); i++){
            if (place.calcDistance(enemies.get(i).place) < min){
                min = place.calcDistance(enemies.get(i).place);
                count = i;
            }
        }
        return enemies.get(count);
    }

}
