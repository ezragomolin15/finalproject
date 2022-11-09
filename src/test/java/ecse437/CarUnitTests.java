package ecse437;

import static org.junit.Assert.assertEquals;


import org.junit.Test;

/**
 * Unit test for Cars.
 */
public class CarUnitTests 
{
   
    @Test
    public void TestCarGetPrice()
    {
        Car car = new Car(20, "x7", "bmw", "montreal");
        assertEquals(20, car.getPrice());
    }

    @Test
    public void TestCarGetModel(){
        Car car = new Car(20, "x7", "bmw", "montreal");
        assertEquals("x7", car.getModel());
    }

    @Test
    public void TestCarGetBrand(){
        Car car = new Car(20, "x7", "bmw", "montreal");
        assertEquals("bmw", car.getBrand());
    }

    @Test
    public void TestCarGetLocation(){
        Car car = new Car(20, "x7", "bmw", "montreal");
        assertEquals("montreal", car.getLocation());
    }
}

