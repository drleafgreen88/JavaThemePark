package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    RollerCoaster rollerCoaster;

    @Before
    public void setUp() {
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
    }

    @Test
    public void hasName() {
        assertEquals("Blue Ridge", rollerCoaster.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(10, rollerCoaster.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, rollerCoaster.getVisitCount());
    }

    @Test
    public void canRide(){
        Visitor visitor = new Visitor (12, 145, 25);
        assertEquals(true, rollerCoaster.isAllowedTo(visitor));
    }

    @Test
    public void hasDefaultPrice(){
        assertEquals(8.40, rollerCoaster.defaultPrice(), 0.00);
    }

    @Test
    public void chargesShortVisitorNormalPrice(){
        Visitor visitor = new Visitor(21, 1.4, 65.0);
        assertEquals(8.40, rollerCoaster.priceFor(visitor), 0.00);
    }
}
