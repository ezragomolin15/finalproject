package ecse437;

import static org.junit.Assert.assertEquals;


import org.junit.Test;


/**
 * Unit test for Cars.
 */
public class RestaurantUnitTests 
{
    
   
    @Test
    public void TestRestoGetName()
    {
        Restaurant restaurant = new Restaurant("monday", "mcdonalds", 2);
        assertEquals("mcdonalds", restaurant.getName());
    }

    @Test
    public void TestRestoGetDate(){
        Restaurant restaurant = new Restaurant("monday", "mcdonalds", 2);
        assertEquals("monday", restaurant.getDate());
    }

    @Test
    public void TestRestoGetNumPeople(){
        Restaurant restaurant = new Restaurant("monday", "mcdonalds", 2);
        assertEquals(2, restaurant.getNumberOfPeople());
    }

    
}

