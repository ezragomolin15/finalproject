package ecse437;

import static org.junit.Assert.assertEquals;


import org.junit.Test;


/**
 * Unit test for Cars.
 */
public class RoomUnitTests 
{
    
   
    @Test
    public void TestRoomGetPrice()
    {
        Room room = new Room(23,"mtl");
        assertEquals(23, room.getPrice());
    }

    @Test
    public void TestRoomGetLocaton(){
        Room room = new Room(23,"mtl");
        assertEquals("mtl", room.getLocation());
    }

    
}