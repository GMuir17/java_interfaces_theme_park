package Stalls.StallTypes;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TobaccoStallTest {

    TobaccoStall TobaccoStall;

    @Before
    public void setUp() {
        TobaccoStall = new TobaccoStall("Poky Hats", "Billy", 25);
    }

    @Test
    public void hasName() {
        assertEquals("Poky Hats", TobaccoStall.getName());
    }

    @Test
    public void hasOwnerName() {
        assertEquals("Billy", TobaccoStall.getOwnerName());
    }

    @Test
    public void hasParkingSpot() {
        assertEquals(25, TobaccoStall.getParkingSpot());
    }

}
