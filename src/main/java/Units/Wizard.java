public abstract class Wizard extends BasicHero{
    public Wizard(int id, int healthLevel, String name, String type, int attackLevelBase, int initiative, int heal, int x, int y) {
        super(id, healthLevel, name, type, attackLevelBase, initiative, x, y);
        this.heal = heal;
    }
    public int heal;

    public String getInfo(){
        return "Name="+name+" "+"type="+type+" "+"id="+id+" "+"health="+healthLevel+" "+"attack="
                +attackLevelBase+" "+"initiative="+initiative+" "+"heal="+heal+" "+"x="+place.x+" "+"y="+place.y;
    }

    public void step(){

    }
}