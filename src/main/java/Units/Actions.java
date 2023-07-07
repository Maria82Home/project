package Units;

import java.util.ArrayList;

public interface Actions {
    void step(ArrayList<BasicHero> enemies, ArrayList<BasicHero> ours);                //public по умолчанию

    String getInfo();

}
