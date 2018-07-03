package ThemeParks;

import ThemeParks.Attractions.AttractionTypes.Dodgems;
import ThemeParks.Stalls.TobaccoStall;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ThemeParkTest {

    ThemePark themePark;
    Dodgems dodgems;
    TobaccoStall tobaccoStall;

    @Before
    public void setUp() {
        themePark = new ThemePark();
        dodgems = new Dodgems("Bulldozers", 5);
        tobaccoStall = new TobaccoStall("Smoke On The Water", "Jimi", 27, 9);
    }

    @Test
    public void attractionsArrayListStartsEmpty() {
        assertEquals(0, themePark.numberOfAttractions());
    }

    @Test
    public void stallsArrayListStartsEmpty() {
        assertEquals(0, themePark.numberOfStalls());
    }

    @Test
    public void canAddAttraction() {
        themePark.addAttraction(dodgems);
        assertEquals(1, themePark.numberOfAttractions());
    }

    @Test
    public void canAddStall() {
        themePark.addStall(tobaccoStall);
        assertEquals(1, themePark.numberOfStalls());
    }

    @Test
    public void hasAllReviewed() {
        themePark.addAttraction(dodgems);
        themePark.addStall(tobaccoStall);
        ArrayList reviewedList = themePark.getAllReviewed();
        assertEquals(2, reviewedList.size());
    }



}
