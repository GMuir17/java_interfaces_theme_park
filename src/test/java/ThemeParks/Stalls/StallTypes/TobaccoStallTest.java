package ThemeParks.Stalls.StallTypes;

import ThemeParks.Stalls.TobaccoStall;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TobaccoStallTest {

    TobaccoStall tobaccoStall;

    @Before
    public void setUp() {
        tobaccoStall = new TobaccoStall("Poky Hats", "Billy", 25);
    }

    @Test
    public void hasName() {
        assertEquals("Poky Hats", tobaccoStall.getName());
    }

    @Test
    public void hasOwnerName() {
        assertEquals("Billy", tobaccoStall.getOwnerName());
    }

    @Test
    public void hasParkingSpot() {
        assertEquals(25, tobaccoStall.getParkingSpot());
    }

    @Test
    public void hasMinAge() {
        assertEquals(18, tobaccoStall.getMinAge());
    }
}
