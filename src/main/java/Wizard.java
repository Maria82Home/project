public abstract class Wizard extends BasicHero{
    public Wizard(int id, int healthLevel, String name, String type, int attackLevelBase, int initiative, int heal) {
        super(id, healthLevel, name, type, attackLevelBase, initiative);
        this.heal = heal;
    }
    public int heal;

    public String getInfo(){
        return "Name="+name+" "+"type="+type+" "+"id="+id+" "+"health="+healthLevel+" "+"attack="
                +attackLevelBase+" "+"initiative="+initiative+" "+"heal="+heal;
    }

    public void step(){

    }
}
