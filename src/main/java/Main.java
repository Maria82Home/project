import Units.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

//Проанализировать и описать персонажей: Маг, монах, разбойник, копейщик, снайпер, арбалетчик,
// крестьянин. На базе описания персонажей описать простейшую иерархию классов. В основной
// программе создать по одному экземпляру каждого класса.
public class Main {
    static ArrayList<BasicHero> unitedTeam = new ArrayList<>();
    static ArrayList<BasicHero> team1 = new ArrayList<>();
    static ArrayList<BasicHero> team2 = new ArrayList<>();
    public static void main(String[] args) {




        for (int i = 1; i<11; i++){
            int ran = new Random().nextInt(0,4);
            switch (ran){
                case 0: team1.add(new Magician(Names.values()[new Random().nextInt(0, 20)].toString(), 1, i));
                    team2.add(new Monk(Names.values()[new Random().nextInt(0, 20)].toString(),10, i));
                    break;
                case 1: team1.add(new Robber(Names.values()[new Random().nextInt(0, 20)].toString(), 1, i));
                    team2.add(new Spearman(Names.values()[new Random().nextInt(0, 20)].toString(),10, i));
                    break;
                case 2: team1.add(new Sniper(Names.values()[new Random().nextInt(0, 20)].toString(), 1, i));
                    team2.add(new Bowman(Names.values()[new Random().nextInt(0, 20)].toString(),10, i));
                    break;
                default: team1.add(new Peasant(Names.values()[new Random().nextInt(0, 20)].toString(), 1, i));
                    team2.add(new Peasant(Names.values()[new Random().nextInt(0, 20)].toString(),10, i));
                    break;
            }
        }

        unitedTeam.addAll(team1);
        unitedTeam.addAll(team2);
        unitedTeam.sort((o1, o2) -> o2.getInitiative()-o1.getInitiative());

//        System.out.println("Team1");
//        team1.forEach(i -> System.out.println(i.getInfo()));
//        System.out.println("Team2");
//        team2.forEach((i -> System.out.println(i.getInfo())));

        View.view();
        for (BasicHero item:unitedTeam){
            if(team1.contains(item)) item.step(team2,team1);
            else item.step(team1,team2);
//            System.out.println(item.getInitiative());
        }

        View.view();

//        System.out.println("Team1");
//        team1.forEach(i -> System.out.println(i.getInfo()));
//        System.out.println("Team2");
//        team2.forEach((i -> System.out.println(i.getInfo())));
    }
}