package Testing;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import dod.Location;
import dod.Object;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author hannah
 */
public class LocationJUnit4Test {
    
    public LocationJUnit4Test() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of setObject method, of class Location. Test will add new object to the locations array list.
     */
    @Test
    public void testSetObject() {
        System.out.println("LocationJUnit4Test: setObject() method");        
        Object d = new Object("dragon", "Scary Dragon");
        Location location = new Location(null, null, null);
        location.setObject(d);
        assertEquals("dragon", location.objects.get(0).name);
    }
    
    /**
     * Test of setExits method, of class Location.
     */
    @Test
    public void testSetExits() {
        System.out.println("LocationJUnit4Test: setExits() method"); 
        Location location1 = new Location("Test location", "Test location", "You can go south"); 
        Location location2 = new Location(null, null, null);         
        location1.setExits(null, null, location2, null);
        assertEquals("You can go south", location1.direct); // Incorrect, but not sure how to test this
    }

    /**
     * Test of isHere method, of class Location. Add object to objects array 
     * list to see if the isHere() method detects it
     */
    @Test
    public void testIsHere() {
        System.out.println("LocationJUnit4Test: isHere() method");
        Location location = new Location (null, null, null);     
        location.setObject(new Object ("dragon", null));
        assertEquals(0, location.isHere("dragon"));  
        assertEquals(-1, location.isHere("sword"));  
        location.setObject(new Object ("sword",null)); 
        assertEquals(1, location.isHere("sword")); 
    }
}