public abstract class Infantry extends BasicHero{
    public Infantry(int id, int healthLevel, String name, String type, int attackLevelBase, int initiative,int speed) {
        super(id, healthLevel, name, type, attackLevelBase, initiative);
        this.speed=speed;
    }
    public int speed;

    public String getInfo(){
        return "Name="+name+" "+"type="+type+" "+"id="+id+" "+"health="+healthLevel+" "+"attack="
                +attackLevelBase+" "+"initiative="+initiative+" "+"speed="+speed;
    }

    @Override
    public void step() {

    }
}
