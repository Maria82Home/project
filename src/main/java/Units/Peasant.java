package Units;

import Units.BasicHero;

import java.util.ArrayList;

public class Peasant extends BasicHero {
    public Peasant(String name,int x, int y) {
        super(6, 100, name, "Peasant", 1, 3, x, y);

    }
    public boolean busy = false;
    @Override
    public void step(ArrayList<BasicHero> enemies, ArrayList<BasicHero> ours) {
        if (this.healthLevel == 0 ) this.busy = true;
    }
//    @Override
//    public void step(ArrayList<BasicHero> enemies,ArrayList<BasicHero> ours) {
////        int[] temp = findNearestEnemy(enemies);
////        System.out.println("Distance="+temp[0]+" enemy's name="+enemies.get(temp[1]).name);
//    }

    public String getInfo(){
        return name+" "+type+" "+"\u2661 "+healthLevel+" "+"\u2694 "
                +attackLevelBase+" "+"initiative="+initiative;
    }
}
