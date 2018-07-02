package ThemeParks;

import ThemeParks.Attractions.AttractionTypes.Dodgems;
import ThemeParks.Stalls.TobaccoStall;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ThemeParkTest {

    ThemePark themePark;
    Dodgems dodgems;
    TobaccoStall tobaccoStall;

    @Before
    public void setUp() {
        themePark = new ThemePark();
        dodgems = new Dodgems("Bulldozers");
        tobaccoStall = new TobaccoStall("Smoke One The Water", "Jimi", 27);
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




}
