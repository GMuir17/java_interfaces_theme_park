package ThemeParks;

import ThemeParks.Attractions.Attraction;
import ThemeParks.Stalls.Stall;

import java.util.ArrayList;

public class ThemePark {

    private ArrayList<Attraction> attractions;
    private ArrayList<Stall> stalls;

    public ThemePark() {
        attractions = new ArrayList<>();
        stalls = new ArrayList<>();
    }

    public int numberOfAttractions() {
        return this.attractions.size();
    }
}
