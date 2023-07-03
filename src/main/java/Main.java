import java.util.ArrayList;
import java.util.Random;

//Проанализировать и описать персонажей: Маг, монах, разбойник, копейщик, снайпер, арбалетчик,
// крестьянин. На базе описания персонажей описать простейшую иерархию классов. В основной
// программе создать по одному экземпляру каждого класса.
public class Main {
    public static void main(String[] args) {
    BasicHero monk1 = new Monk("Warlock");
    BasicHero mag1 = new Magician("Merlin");
    BasicHero rob1 = new Robber("Razor");
    BasicHero spear1 = new Spearman("Nick");
    BasicHero snip1 = new Sniper("Annette");
    BasicHero bowman1 = new Bowman("Bob");
    BasicHero peasant1 = new Peasant("Tom");

        ArrayList<BasicHero> allheroes = new ArrayList<>();
        allheroes.add(monk1);
        allheroes.add(mag1);
        allheroes.add(rob1);
        allheroes.add(spear1);
        allheroes.add(snip1);
        allheroes.add(bowman1);
        allheroes.add(peasant1);

        ArrayList<BasicHero> team1 = new ArrayList<>();
        ArrayList<BasicHero> team2 = new ArrayList<>();

        for (int i = 0; i<10; i++){
            int ran = new Random().nextInt(0,allheroes.size());
            switch (ran){
                case 0: team1.add(new Magician(Names.values()[new Random().nextInt(0, 20)].toString()));
                    team2.add(new Magician(Names.values()[new Random().nextInt(0, 20)].toString()));
                    break;
                case 1: team1.add(new Monk(Names.values()[new Random().nextInt(0, 20)].toString()));
                    team2.add(new Monk(Names.values()[new Random().nextInt(0, 20)].toString()));
                    break;
                case 2: team1.add(new Robber(Names.values()[new Random().nextInt(0, 20)].toString()));
                    team2.add(new Robber(Names.values()[new Random().nextInt(0, 20)].toString()));
                    break;
                case 3: team1.add(new Spearman(Names.values()[new Random().nextInt(0, 20)].toString()));
                team2.add(new Spearman(Names.values()[new Random().nextInt(0, 20)].toString()));
                    break;
                case 4: team1.add(new Sniper(Names.values()[new Random().nextInt(0, 20)].toString()));
                    team2.add(new Sniper(Names.values()[new Random().nextInt(0, 20)].toString()));
                    break;
                case 5: team1.add(new Bowman(Names.values()[new Random().nextInt(0, 20)].toString()));
                    team2.add(new Bowman(Names.values()[new Random().nextInt(0, 20)].toString()));
                    break;
                default: team1.add(new Peasant(Names.values()[new Random().nextInt(0, 20)].toString()));
                    team2.add(new Peasant(Names.values()[new Random().nextInt(0, 20)].toString()));
                    break;
            }
        }
        System.out.println("Team1");
        team1.forEach(i -> System.out.println(i.getInfo()));
        System.out.println("Team2");
        team2.forEach((i -> System.out.println(i.getInfo())));
    }
}