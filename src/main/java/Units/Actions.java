package Units;

import java.util.ArrayList;

public interface Actions {
    void step(ArrayList<BasicHero> enemies);                //public по умолчанию

    String getInfo();

}
