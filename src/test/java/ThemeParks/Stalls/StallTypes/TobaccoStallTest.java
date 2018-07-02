package ThemeParks.Stalls.StallTypes;

import ThemeParks.Stalls.TobaccoStall;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TobaccoStallTest {

    ThemeParks.Stalls.TobaccoStall TobaccoStall;

    @Before
    public void setUp() {
        TobaccoStall = new TobaccoStall("Poky Hats", "Billy", 25);
    }

    @Test
    public void hasName() {
        Assert.assertEquals("Poky Hats", TobaccoStall.getName());
    }

    @Test
    public void hasOwnerName() {
        Assert.assertEquals("Billy", TobaccoStall.getOwnerName());
    }

    @Test
    public void hasParkingSpot() {
        Assert.assertEquals(25, TobaccoStall.getParkingSpot());
    }

}
