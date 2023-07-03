public class Peasant extends BasicHero{
    public Peasant(String name) {
        super(6, 100, name, "Peasant", 1, 2);

    }

    @Override
    public void step() {

    }

    public String getInfo(){
        return "Name="+name+" "+"type="+type+" "+"id="+id+" "+"health="+healthLevel+" "+"attack="
                +attackLevelBase+" "+"initiative="+initiative;
    }
}
