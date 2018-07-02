package Visitors;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VisitorTest {

    Visitor visitor;

    @Before
    public void setUp() {
        visitor = new Visitor(27, 181, 20.00);
    }

    @Test
    public void hasAge() {
        assertEquals(27, visitor.getAge());
    }





}
