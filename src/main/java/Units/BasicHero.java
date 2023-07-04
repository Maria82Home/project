import Units.Actions;
import Units.Coordinates;

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
}
