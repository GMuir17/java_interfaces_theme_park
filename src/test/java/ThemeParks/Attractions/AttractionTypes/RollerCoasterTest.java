package ThemeParks.Attractions.AttractionTypes;

import Visitors.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RollerCoasterTest {

    RollerCoaster rollerCoaster;
    Visitor visitor1;
    Visitor visitor2;
    Visitor visitor3;

    @Before
    public void setUp() {
        rollerCoaster = new RollerCoaster("The Barrel Roll");
        visitor1 = new Visitor(15, 150, 12.00);
        visitor2 = new Visitor(10, 180, 12.00);
        visitor3 = new Visitor(20, 100, 12.00);
    }

    @Test
    public void hasName() {
        assertEquals("The Barrel Roll", rollerCoaster.getName());
    }

    @Test
    public void hasMinAge() {
        assertEquals(12, rollerCoaster.getMinAge());
    }

    @Test
    public void hasMinHeight() {
        assertEquals(145, rollerCoaster.getMinHeight());
    }

    @Test
    public void isAllowedOn() {
        assertEquals(true, rollerCoaster.isAllowedTo(visitor1));
    }

    @Test
    public void isNotAllowedOnTooYoung() {
        assertEquals(false, rollerCoaster.isAllowedTo(visitor2));
    }

    @Test
    public void isNotAllowedOnTooShort() {
        assertEquals(false, rollerCoaster.isAllowedTo(visitor3));
    }









}
