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








}
