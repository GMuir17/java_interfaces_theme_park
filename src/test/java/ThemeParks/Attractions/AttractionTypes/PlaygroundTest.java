package ThemeParks.Attractions.AttractionTypes;

import Visitors.Visitor;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaygroundTest {

    Playground playground;
    Visitor visitor1;
    Visitor visitor2;

    @Before
    public void setUp() {
        playground = new Playground("District 9");
        visitor1 = new Visitor(15, 150, 12.00);
        visitor2 = new Visitor(18, 180, 12.00);
    }

    @Test
    public void hasName() {
        assertEquals("District 9", playground.getName());
    }

    @Test
    public void hasMaxAge() {
        assertEquals(16, playground.hasMaxAge());
    }

    @Test
    public void canCheckAgeUnderAge() {
        assertEquals(true, playground.isAllowedTo(visitor1));
    }

    @Test
    public void canCheckAgeOverAge() {
        assertEquals(false, playground.isAllowedTo(visitor2));
    }
}
