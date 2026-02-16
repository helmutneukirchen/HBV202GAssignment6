package is.hi.hbv202g.ass6;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class CarOwnerTest {

    @Test
    public void testGetName() {
        Car car=new Car("Beetle");
        CarOwner carOwner = new CarOwner("John Doe", car);
        assertEquals("John Doe", carOwner.getName());
    }

}