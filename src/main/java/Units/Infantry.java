package Units;

import java.util.ArrayList;

public abstract class Infantry extends BasicHero {
    public Infantry(int id, int healthLevel, String name, String type, int attackLevelBase, int initiative, int x, int y) {
        super(id, healthLevel, name, type, attackLevelBase, initiative, x, y);
    }
    public int speed;

    public String getInfo(){
        return name+" "+type+" "+"\u2661 "+healthLevel+" "+"\u2694 "
                +attackLevelBase+" "+"initiative="+initiative;
    }

    @Override
    public void step(ArrayList<BasicHero> enemies,ArrayList<BasicHero> ours) {
//        int[] temp = findNearestEnemy(enemies);
//        System.out.println("Distance="+temp[0]+" enemy's name="+enemies.get(temp[1]).name);
    }

}
