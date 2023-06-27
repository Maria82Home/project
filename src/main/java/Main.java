//Проанализировать и описать персонажей: Маг, монах, разбойник, копейщик, снайпер, арбалетчик,
// крестьянин. На базе описания персонажей описать простейшую иерархию классов. В основной
// программе создать по одному экземпляру каждого класса.
public class Main {
    public static void main(String[] args) {
    Monk monk1 = new Monk("Warlock");
    Magician mag1 = new Magician("Merlin");
    Robber rob1 = new Robber("Razor");
    Spearman spear1 = new Spearman("Nick");
    Sniper snip1 = new Sniper("Annette");
    Bowman bowman1 = new Bowman("Bob");
    Peasant peasant1 = new Peasant("Tom");
    }
}
