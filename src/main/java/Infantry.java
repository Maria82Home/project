public abstract class Infantry extends BasicHero{
    public Infantry(int id, int healthLevel, String name, String type, int attackLevelBase, int initiative,int speed) {
        super(id, healthLevel, name, type, attackLevelBase, initiative);
        this.speed=speed;
    }
    public int speed;
}
