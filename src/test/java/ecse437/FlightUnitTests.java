package ecse437;

import static org.junit.Assert.assertEquals;


import org.junit.Test;


/**
 * Unit test for Cars.
 */
public class FlightUnitTests 
{
    
   
    @Test
    public void TestFlightGetPrice()
    {
        Flight flight = new Flight("to", "mtl", "123", 23);
        assertEquals(23, flight.getPrice());
    }

    @Test
    public void TestFlightGetModel(){
        Flight flight = new Flight("to", "mtl", "123", 23);
        assertEquals("123", flight.getFlightNum());
    }

    @Test
    public void TestFlightGetLocationFrom(){
        Flight flight = new Flight("to", "mtl", "123", 23);
        assertEquals("to", flight.getLocationFrom());
    }

    @Test
    public void TestFlightGetLocationTo(){
        Flight flight = new Flight("to", "mtl", "123", 23);
        assertEquals("mtl", flight.getLocationTo());
    }
}