package Units;

import Units.BasicHero;

import java.util.ArrayList;

public class Peasant extends BasicHero {
    public Peasant(String name,int x, int y) {
        super(6, 100, name, "Units.Peasant", 1, 3, x, y);

    }

    @Override
    public void step(ArrayList<BasicHero> enemies,ArrayList<BasicHero> ours) {
//        int[] temp = findNearestEnemy(enemies);
//        System.out.println("Distance="+temp[0]+" enemy's name="+enemies.get(temp[1]).name);
    }

    public String getInfo(){
        return "Name="+name+" "+"type="+type+" "+"id="+id+" "+"health="+healthLevel+" "+"attack="
                +attackLevelBase+" "+"initiative="+initiative+" "+"x="+place.x+" "+"y="+place.y;
    }
}
