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
        if (this.healthLevel<=0) return;
        BasicHero nearestEnemy = findNearestEnemy(enemies);
        if(this.place.calcDistance(nearestEnemy.place)<2){
//            nearestEnemy.healthLevel=nearestEnemy.healthLevel-this.attackLevelBase;
            nearestEnemy.getDamage(this.attackLevelBase);
            return;
        }

        Coordinates tmpc = new Coordinates(place.x, place.y);
        if(Math.abs(this.place.x-nearestEnemy.place.x)>Math.abs(this.place.y - nearestEnemy.place.y)) {
            if (this.place.x < nearestEnemy.place.x) {
                tmpc.x += 1;

            } else {
                tmpc.x -= 1;
            }
        }
        else{
            if (this.place.y < nearestEnemy.place.y) {
                this.place.y = this.place.y + 1;

            } else {
                this.place.y = this.place.y - 1;
            }
        }
        boolean flag = false;
        for (BasicHero item:ours){
            if(item.place.x == tmpc.x & item.place.y == tmpc.y & item.healthLevel>0) flag = true;
        }
        if (flag) return;
        this.place.x = tmpc.x;
        this.place.y = tmpc.y;
    }

}
