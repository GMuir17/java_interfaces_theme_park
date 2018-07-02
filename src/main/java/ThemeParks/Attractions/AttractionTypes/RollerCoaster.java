package ThemeParks.Attractions.AttractionTypes;

import Behaviours.ISecurity;
import ThemeParks.Attractions.Attraction;

public class RollerCoaster extends Attraction {

    private int minAge;
    private int minHeight;

    public RollerCoaster(String name) {
        super(name);
        this.minAge = 12;
        this.minHeight = 145;
    }

    public int getMinAge() {
        return this.minAge;
    }

    public int getMinHeight() {
        return this.minHeight;
    }


}
