package ThemeParks.Attractions.AttractionTypes;

import Behaviours.ISecurity;
import ThemeParks.Attractions.Attraction;
import Visitors.Visitor;

public class Playground extends Attraction implements ISecurity {

    private int maxAge;

    public Playground(String name) {
        super(name);
        this.maxAge = 16;
    }

    public int hasMaxAge() {
        return this.maxAge;
    }

    public boolean isAllowedTo(Visitor visitor) {
        return true;
    }

}
