package ThemeParks.Stalls;

import Behaviours.ISecurity;
import Visitors.Visitor;

public class TobaccoStall extends Stall implements ISecurity {

    private int minAge;

    public TobaccoStall(String name, String ownerName, int parkingSpot, int rating) {
        super(name, ownerName, parkingSpot, rating);
        this.minAge = 18;
    }

    public int getMinAge() {
        return this.minAge;
    }

    public boolean isAllowedTo(Visitor visitor) {
        if (this.minAge < visitor.getAge()) {
            return true;
        }
        else {
            return false;
        }
    }

}
