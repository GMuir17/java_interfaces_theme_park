package ThemeParks.Stalls;

public class TobaccoStall extends Stall {

    private int minAge;

    public TobaccoStall(String name, String ownerName, int parkingSpot) {
        super(name, ownerName, parkingSpot);
        this.minAge = 18;
    }

    public int getMinAge() {
        return this.minAge;
    }

}
