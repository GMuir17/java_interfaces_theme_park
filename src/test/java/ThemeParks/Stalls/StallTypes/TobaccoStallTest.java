package ThemeParks.Stalls.StallTypes;

import ThemeParks.Stalls.TobaccoStall;
import Visitors.Visitor;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TobaccoStallTest {

    TobaccoStall tobaccoStall;
    Visitor visitor1;
    Visitor visitor2;

    @Before
    public void setUp() {
        tobaccoStall = new TobaccoStall("Poky Hats", "Billy", 25, 6);
        visitor1 = new Visitor(20, 180, 30.00);
        visitor2 = new Visitor(10, 180, 30.00);
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

    @Test
    public void isAllowedToAgeOk() {
        assertEquals(true, tobaccoStall.isAllowedTo(visitor1));
    }

    @Test
    public void isNotAllowedToTooYoung() {
        assertEquals(false, tobaccoStall.isAllowedTo(visitor2));
    }







}
