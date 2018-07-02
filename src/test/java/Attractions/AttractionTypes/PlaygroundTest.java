package Attractions.AttractionTypes;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaygroundTest {

    Playground playground;

    @Before
    public void setUp() {
        playground = new Playground("District 9");
    }

    @Test
    public void hasName() {
        assertEquals("District 9", playground.getName());
    }

}
