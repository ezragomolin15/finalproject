package ecse437;

import static org.junit.Assert.assertEquals;


import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class IntegrationTests 
{
    @Test
    public void TestBookingOneReservation()
    {
        Car car = new Car(20, "x7", "bmw", "montreal");
        Flight flight = new Flight("totronto", "montreal", "123", 100);
        Room room = new Room(60, "montreal");
        Restaurant resto = new Restaurant("today", "mcdonalds", 2);

        User user = new User("123");
        user.addReservation(car, flight, room, resto);
        assertEquals( 1, user.getReservations().size());
    }
    @Test
    public void TestGetTotalPriceOneReservation()
    {
        Car car = new Car(20, "x7", "bmw", "montreal");
        Flight flight = new Flight("totronto", "montreal", "123", 100);
        Room room = new Room(60, "montreal");
        Restaurant resto = new Restaurant("today", "mcdonalds", 2);

        User user = new User("123");
        user.addReservation(car, flight, room, resto);
        assertEquals( 180, user.getBill());
    }

    @Test
    public void TestGetTotalPriceTwoReservation()
    {
        Car car = new Car(20, "x7", "bmw", "montreal");
        Flight flight = new Flight("totronto", "montreal", "123", 100);
        Room room = new Room(60, "montreal");
        Restaurant resto = new Restaurant("today", "mcdonalds", 2);

        User user = new User("123");
        user.addReservation(car, flight, room, resto);
        user.addReservation(car, flight, room, resto);
        assertEquals( 360, user.getBill());
    }


}
