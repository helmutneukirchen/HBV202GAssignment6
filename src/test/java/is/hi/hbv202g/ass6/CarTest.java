package is.hi.hbv202g.ass6;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class CarTest {
    @Test
    public void testGetNameOfCar() {
        Car car = new Car("Beetle");
        CarOwner carOwner = new CarOwner("John Doe", car);
        assertEquals("Beetle", carOwner.getNameOfCar());
    }

}
