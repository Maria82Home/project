package Units;

import java.util.ArrayList;

public abstract class Infantry extends BasicHero {
    public Infantry(int id, int healthLevel, String name, String type, int attackLevelBase, int initiative,int speed, int x, int y) {
        super(id, healthLevel, name, type, attackLevelBase, initiative, x, y);
        this.speed=speed;
    }
    public int speed;

    public String getInfo(){
        return "Name="+name+" "+"type="+type+" "+"id="+id+" "+"health="+healthLevel+" "+"attack="
                +attackLevelBase+" "+"initiative="+initiative+" "+"speed="+speed+" "+"x="+place.x+" "+"y="+place.y;
    }

    @Override
    public void step(ArrayList<BasicHero> enemies,ArrayList<BasicHero> ours) {
//        int[] temp = findNearestEnemy(enemies);
//        System.out.println("Distance="+temp[0]+" enemy's name="+enemies.get(temp[1]).name);
    }

}
