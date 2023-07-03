public abstract class Shooter extends BasicHero{
    public Shooter(int id, int healthLevel, String name, String type, int attackLevelBase, int initiative, int distance) {
        super(id, healthLevel, name, type, attackLevelBase, initiative);
        this.distance=distance;
    }
    public int distance;

    public String getInfo(){
        return "Name="+name+" "+"type="+type+" "+"id="+id+" "+"health="+healthLevel+" "+"attack="
                +attackLevelBase+" "+"initiative="+initiative+" "+"distance="+distance;
    }

    @Override
    public void step() {

    }
}
