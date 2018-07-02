package ThemeParks.Stalls.StallTypes;

import ThemeParks.Stalls.IceCreamStall;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IceCreamStallTest {

    IceCreamStall iceCreamStall;

    @Before
    public void setUp() {
        iceCreamStall = new IceCreamStall("Poky Hats", "Billy", 25);
    }

    @Test
    public void hasName() {
        assertEquals("Poky Hats", iceCreamStall.getName());
    }

    @Test
    public void hasOwnerName() {
        assertEquals("Billy", iceCreamStall.getOwnerName());
    }

    @Test
    public void hasParkingSpot() {
        assertEquals(25, iceCreamStall.getParkingSpot());
    }

}
