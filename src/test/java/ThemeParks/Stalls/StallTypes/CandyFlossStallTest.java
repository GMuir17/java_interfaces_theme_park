package ThemeParks.Stalls.StallTypes;

import ThemeParks.Stalls.CandyFlossStall;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CandyFlossStallTest {

    CandyFlossStall candyFlossStall;

    @Before
    public void setUp() {
        candyFlossStall = new CandyFlossStall("Poky Hats", "Billy", 25);
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

}
