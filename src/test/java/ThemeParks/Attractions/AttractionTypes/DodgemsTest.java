package ThemeParks.Attractions.AttractionTypes;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DodgemsTest {

    Dodgems dodgem;

    @Before
    public void setUp() {
        dodgem = new Dodgems("Meteor Cloud");
    }

    @Test
    public void hasName() {
        assertEquals("Meteor Cloud", dodgem.getName());
    }

}
