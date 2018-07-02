package ThemeParks.Attractions.AttractionTypes;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RollerCoasterTest {

    RollerCoaster rollerCoaster;

    @Before
    public void setUp() {
        rollerCoaster = new RollerCoaster("The Barrel Roll");
    }

    @Test
    public void hasName() {
        assertEquals("The Barrel Roll", rollerCoaster.getName());
    }

}
