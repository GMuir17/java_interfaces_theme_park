package ThemeParks.Attractions.AttractionTypes;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ParkTest {

    Park park;

    @Before
    public void setUp() {
        park = new Park("The Meadows", 9);
    }

    @Test
    public void hasName() {
        assertEquals("The Meadows", park.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(9, park.getRating());
    }

}
