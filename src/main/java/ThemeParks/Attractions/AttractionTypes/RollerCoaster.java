package ThemeParks.Attractions.AttractionTypes;

import Behaviours.ISecurity;
import ThemeParks.Attractions.Attraction;
import Visitors.Visitor;

public class RollerCoaster extends Attraction implements ISecurity {

    private int minAge;
    private int minHeight;

    public RollerCoaster(String name) {
        super(name, 5);
        this.minAge = 12;
        this.minHeight = 145;
    }

    public int getMinAge() {
        return this.minAge;
    }

    public int getMinHeight() {
        return this.minHeight;
    }

    public boolean checkAge(Visitor visitor) {
        if (this.minAge <= visitor.getAge()) {
            return true;
        }
        else {
            return false;
        }
    }

    public boolean checkHeight(Visitor visitor) {
        if (this.minHeight <= visitor.getHeight()) {
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public boolean isAllowedTo(Visitor visitor) {
        if (checkAge(visitor) && checkHeight(visitor)) {
            return true;
        }
        else {
            return false;
        }
    }
}
