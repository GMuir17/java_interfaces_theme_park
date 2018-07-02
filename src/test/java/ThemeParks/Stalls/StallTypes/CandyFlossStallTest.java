package ThemeParks.Stalls.StallTypes;

import ThemeParks.Stalls.CandyFlossStall;
import ThemeParks.Stalls.Stall;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CandyFlossStallTest{

    CandyFlossStall candyFlossStall;

    @Before
    public void setUp() {
        candyFlossStall = new CandyFlossStall("Poky Hats", "Billy", 25, 8);
    }

    @Test
    public void hasName() {
        assertEquals("Poky Hats", candyFlossStall.getName());
    }

    @Test
    public void hasOwnerName() {
        assertEquals("Billy", candyFlossStall.getOwnerName());
    }

    @Test
    public void hasParkingSpot() {
        assertEquals(25, candyFlossStall.getParkingSpot());
    }

    @Test
    public void hasRating() {
        assertEquals(8, candyFlossStall.getRating());
    }

}
