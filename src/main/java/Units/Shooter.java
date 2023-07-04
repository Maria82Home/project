public abstract class Shooter extends BasicHero{
    public Shooter(int id, int healthLevel, String name, String type, int attackLevelBase, int initiative, int distance, int x, int y) {
        super(id, healthLevel, name, type, attackLevelBase, initiative, x, y);
        this.distance=distance;
    }
    public int distance;

    public String getInfo(){
        return "Name="+name+" "+"type="+type+" "+"id="+id+" "+"health="+healthLevel+" "+"attack="
                +attackLevelBase+" "+"initiative="+initiative+" "+"distance="+distance+" "+"x="+place.x+" "+"y="+place.y;
    }

    @Override
    public void step() {

    }
}
