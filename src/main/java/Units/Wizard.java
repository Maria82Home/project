package Units;

import java.util.ArrayList;

public abstract class Wizard extends BasicHero {
    public Wizard(int id, int healthLevel, String name, String type, int attackLevelBase, int initiative, int heal, int x, int y) {
        super(id, healthLevel, name, type, attackLevelBase, initiative, x, y);
        this.heal = heal;
    }
    public int heal;

    public String getInfo(){
        return name+" "+type+" "+"\u2661 "+healthLevel+" "+"\u2694 "
                +attackLevelBase+" "+"initiative="+initiative+" "+"heal="+heal;
    }
    @Override
    public void step(ArrayList<BasicHero> enemies, ArrayList<BasicHero> ours) {

        if (this.healthLevel > 0 ) {

            for (BasicHero item : ours) {
                if (item.healthLevel < 90 & item.healthLevel >0) {
                    item.healthLevel += this.heal;
                    System.out.println(this.name+" healed "+item.name);
                    return;
                }
            }
            BasicHero temp = findNearestEnemy(enemies);
            temp.getDamage(this.heal);
//            temp.healthLevel = temp.healthLevel - this.heal;
            System.out.println(this.name+" attacked "+temp.name);
        }
    }
//    @Override
//    public void step(ArrayList<BasicHero> enemies, ArrayList<BasicHero> ours) {
//        int[] temp = findNearestEnemy(enemies);
//        System.out.println("Distance="+temp[0]+" enemy's name="+enemies.get(temp[1]).name);
    }

