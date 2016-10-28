package Testing;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import dod.Location;
import dod.Player;
import dod.World;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author hannah
 */
public class DoDJUnit4Test {
    
    public DoDJUnit4Test() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Testing navigation of map and location exits.
     */
    @Test
    public void testExitsFromBabblingBrook() {
        System.out.println("DoDJUnit4Test: Test Exits From Babbling Brook");
        World world = new World();
        Player player = new Player(world.locations.get(0));
        player.location = player.location.north;
        assertEquals("field", player.location.name);
        player.location = player.location.south;   
        assertEquals("forest", player.location.name);
        player.location = player.location.east;
        assertEquals("mountains", player.location.name);
        player.location = player.location.west;
        assertEquals("forest", player.location.name);           
        player.location = player.location.south;
        assertNull(player.location); 
        player.location = world.locations.get(0);
        assertEquals("forest", player.location.name);
        player.location = player.location.west;
        assertNull(player.location);
        player.location = world.locations.get(0);
        assertEquals("forest", player.location.name);        
    }

    /**
     * Testing navigation of map and location exits.
     */    
    @Test
    public void testExitsFromMistyMountains() {
        System.out.println("DoDJUnit4Test: Test Exits From Misty Moutains");
        World world = new World();
        Player player = new Player(world.locations.get(1));
        player.location = player.location.north;
        assertEquals("wood", player.location.name);
        player.location = player.location.south;   
        assertEquals("mountains", player.location.name);
        player.location = player.location.east;
        assertEquals("cave", player.location.name);
        player.location = player.location.west;
        assertEquals("mountains", player.location.name);           
        player.location = player.location.south;
        assertNull(player.location);  
        player.location = world.locations.get(1);
        assertEquals("mountains", player.location.name);        
        player.location = player.location.west;
        assertEquals("forest", player.location.name); 
        player.location = player.location.east;
        assertEquals("mountains", player.location.name);    
    }

    /**
     * Testing navigation of map and location exits.
     */    
    @Test
    public void testExitsFromDragonsCave() {
        System.out.println("DoDJUnit4Test: Test Exits From Dragons Cave");
        World world = new World();
        Player player = new Player(world.locations.get(2));
        player.location = player.location.north;
        assertNull(player.location);
        player.location = world.locations.get(2);
        assertEquals("cave", player.location.name);        
        player.location = player.location.east;
        assertNull(player.location); 
        player.location = world.locations.get(2);
        assertEquals("cave", player.location.name);          
        player.location = player.location.south;
        assertNull(player.location);   
        player.location = world.locations.get(2);
        assertEquals("cave", player.location.name);          
        player.location = player.location.west;
        assertEquals("mountains", player.location.name); 
        player.location = player.location.east;
        assertEquals("cave", player.location.name);  
    }

    /**
     * Testing navigation of map and location exits.
     */    
    @Test
    public void testExitsFromSunnyField() {
        System.out.println("DoDJUnit4Test: Test Exits From Sunny Field");
        World world = new World();
        Player player = new Player(world.locations.get(3));
        player.location = player.location.north;
        assertEquals("ruins", player.location.name);
        player.location = player.location.south;   
        assertEquals("field", player.location.name);
        player.location = player.location.east;
        assertEquals("wood", player.location.name);
        player.location = player.location.west;
        assertEquals("field", player.location.name);           
        player.location = player.location.south;
        assertEquals("forest", player.location.name); 
        player.location = player.location.north;
        assertEquals("field", player.location.name);     
        player.location = player.location.west;
        assertNull(player.location);         
        player.location = world.locations.get(3);
        assertEquals("field", player.location.name);     
    }
    
    /**
     * Testing navigation of map and location exits.
     */    
    @Test
    public void testExitsFromGreatOak() {
        System.out.println("DoDJUnit4Test: Test Exits From Great Oak");
        World world = new World();
        Player player = new Player(world.locations.get(4));
        player.location = player.location.north;
        assertEquals("lighthouse", player.location.name);
        player.location = player.location.south;   
        assertEquals("wood", player.location.name);
        player.location = player.location.east;
        assertEquals("marshes", player.location.name);
        player.location = player.location.west;
        assertEquals("wood", player.location.name);           
        player.location = player.location.south;
        assertEquals("mountains", player.location.name); 
        player.location = player.location.north;
        assertEquals("wood", player.location.name);     
        player.location = player.location.west;
        assertEquals("field", player.location.name);          
        player.location = player.location.east;
        assertEquals("wood", player.location.name);    
    }    

    /**
     * Testing navigation of map and location exits.
     */    
    @Test
    public void testExitsFromMurkyMarshes() {
        System.out.println("DoDJUnit4Test: Test Exits From Murky Marshes");
        World world = new World();
        Player player = new Player(world.locations.get(5));
        player.location = player.location.north;
        assertEquals("hut", player.location.name);
        player.location = player.location.south;   
        assertEquals("marshes", player.location.name);
        player.location = player.location.east;
        assertNull(player.location);
        player.location = world.locations.get(5);
        assertEquals("marshes", player.location.name);                    
        player.location = player.location.south;
        assertNull(player.location); 
        player.location = world.locations.get(5);
        assertEquals("marshes", player.location.name);              
        player.location = player.location.west;
        assertEquals("wood", player.location.name);          
        player.location = player.location.east;
        assertEquals("marshes", player.location.name);       
    }        
    
    /**
     * Testing navigation of map and location exits.
     */    
    @Test
    public void testExitsFromTowerRuins() {
        System.out.println("DoDJUnit4Test: Test Exits From Tower Ruins");
        World world = new World();
        Player player = new Player(world.locations.get(6));
        player.location = player.location.north;
        assertNull(player.location); 
        player.location = world.locations.get(6);
        assertEquals("ruins", player.location.name);   
        player.location = player.location.east;
        assertNull(player.location);
        player.location = world.locations.get(6);
        assertEquals("ruins", player.location.name);                    
        player.location = player.location.south;
        assertEquals("field", player.location.name); 
        player.location = player.location.north;        
        assertEquals("ruins", player.location.name);         
        player.location = player.location.west;
        assertNull(player.location);   
        player.location = world.locations.get(6);
        assertEquals("ruins", player.location.name);            
    }  
    
    /**
     * Testing navigation of map and location exits.
     */    
    @Test
    public void testExitsFromHighCliff() {
        System.out.println("DoDJUnit4Test: Test Exits From High Cliff");
        World world = new World();
        Player player = new Player(world.locations.get(7));
        player.location = player.location.north;
        assertNull(player.location); 
        player.location = world.locations.get(7);
        assertEquals("lighthouse", player.location.name);   
        player.location = player.location.east;
        assertEquals("hut", player.location.name); 
        player.location = player.location.west;
        assertEquals("lighthouse", player.location.name);         
        player.location = player.location.south;
        assertEquals("wood", player.location.name); 
        player.location = player.location.north;        
        assertEquals("lighthouse", player.location.name);         
        player.location = player.location.west;
        assertNull(player.location);   
        player.location = world.locations.get(7);
        assertEquals("lighthouse", player.location.name);           
    
    }  
    
    /**
     * Testing navigation of map and location exits.
     */
    @Test
    public void testExitsFromLonelyBeach() {
        System.out.println("DoDJUnit4Test: Test Exits From Lonely Beach");
        World world = new World();
        Player player = new Player(world.locations.get(8));
        player.location = player.location.north;
        assertNull(player.location);          
        player.location = world.locations.get(8);
        assertEquals("hut", player.location.name);
        player.location = player.location.east;
        assertNull(player.location); 
        player.location = world.locations.get(8);
        assertEquals("hut", player.location.name);           
        player.location = player.location.south;
        assertEquals("marshes", player.location.name); 
        player.location = player.location.north;        
        assertEquals("hut", player.location.name);         
        player.location = player.location.west;
        assertEquals("lighthouse", player.location.name);
        player.location = player.location.east;        
        assertEquals("hut", player.location.name);              
    }   
    
    /**
     * Testing descriptions are correct for each location.
     */    
    @Test
    public void testLocationDescriptions() {   
        System.out.println("DoDJUnit4Test: Test Location Descriptions");
        World world = new World();
        Player player = new Player(world.locations.get(0));
        assertEquals("You are standing by a babbling brook. From the east you can see misty mountains and there is sunny field in the north direction", player.location.desc);        
        player.location = world.locations.get(1);
        assertEquals("You are up in some misty mountains. Visibility is poor so you will need to trust your intuition in navigation", player.location.desc);       
        player.location = world.locations.get(2);
        assertEquals("You are in the cave of Gwent the dragon, you can hear dripping water and can smell damp. There is a breathing sound coming from the abyss of the cave.", player.location.desc);
        player.location = world.locations.get(3);
        assertEquals("You are in a sunny field full of flowers. From the north you can see tower ruins and to the east there is a little wood with a big oak tree. When you look to the south you can see the forest where you have been.", player.location.desc);        
        player.location = world.locations.get(4);
        assertEquals("You are standing by a great oak on the edge of the small wood. From the south you can see misty mountains and from the north you can see the sea. When you look east there is an area covered by the marshes", player.location.desc);
        player.location = world.locations.get(5);
        assertEquals("You are in some murky marshes. From the north you can see the sea side with an empty, sandy beach and from the west you can see a small wood with a big oak tree.", player.location.desc);  
        player.location = world.locations.get(6);
        assertEquals("You are in some deserted tower ruins. There is nobody around and it looks like it was damaged by the war and has never been rebuilt afterwards. From the south you can see fields", player.location.desc);
        player.location = world.locations.get(7);
        assertEquals("You are in the abandoned lighthouse on top of some high cliffs. There are far reaching views from the window. There is some furniture and pictures on the walls. From the east you can see a long golden beach and from the south there is a little wood.", player.location.desc);
        player.location = world.locations.get(8);
        assertEquals("You are in a hut on a lonely beach. There are a few empty rooms. From the window you can see marshes to the south and the lighthouse on the high cliffs to the west.", player.location.desc);             
    }   
    
    
    /**
     * Testing names are correct for each location.
     */    
    @Test
    public void testLocationNames() {   
        System.out.println("DoDJUnit4Test: Test Location Names");
        World world = new World();
        Player player = new Player(world.locations.get(0));
        assertEquals("forest", player.location.name);        
        player.location = world.locations.get(1);
        assertEquals("mountains", player.location.name);       
        player.location = world.locations.get(2);
        assertEquals("cave", player.location.name);
        player.location = world.locations.get(3);
        assertEquals("field", player.location.name);        
        player.location = world.locations.get(4);
        assertEquals("wood", player.location.name);
        player.location = world.locations.get(5);
        assertEquals("marshes", player.location.name);  
        player.location = world.locations.get(6);
        assertEquals("ruins", player.location.name);
        player.location = world.locations.get(7);
        assertEquals("lighthouse", player.location.name);
        player.location = world.locations.get(8);
        assertEquals("hut", player.location.name);       
    }   
    
    /**
     * Testing the Object Descriptions.
     */ 
    @Test
    public void testObjectDescriptions() { 
        System.out.println("DoDJUnit4Test: Test Object Descriptions");
        //Incorrect but not sure how to test with the objects created in World.java
        World world = new World();
        Player player = new Player(world.locations.get(0));
        player.location.objects.add(new dod.Object("Sword", "It's a rusty sword."));
        player.location.objects.add(new dod.Object("Lamp", "It's a shiny brass oil lamp."));
        player.location.objects.add(new dod.Object("Dragon", "It's an angry, fire-breathing dragon!"));
        assertEquals("It's a rusty sword.", player.location.objects.get(0).desc);
        assertEquals("It's a shiny brass oil lamp.", player.location.objects.get(1).desc);
        assertEquals("It's an angry, fire-breathing dragon!", player.location.objects.get(2).desc);
    }  
   
    /**
     * Testing the isLit location status.
     */    
    @Test
    public void testIsLit() { 
        System.out.println("DoDJUnit4Test: Test isLit");
        World world = new World();
        Player player = new Player(world.locations.get(2));

        //players current location (Dragon's Cave)
        assertEquals(false, player.location.isLit);
        player.location.isLit = true;
        assertEquals(true, player.location.isLit);        
    }  
    
    /**
     * Testing adding and then removing an Object from the Inventory ArrayList called 'invent'
     */    
    @Test
    public void testInventArrayList() { 
        System.out.println("DoDJUnit4Test: Test Adding And Removing From Invent ArrayList");
        World world = new World();
        Player player = new Player(world.locations.get(0));
        dod.Object d = new dod.Object("Dragon", null);
        
        //Test add
        player.invent.add(d);
        assertEquals("Dragon", player.invent.get(0).name);
        
        //Test remove
        player.invent.remove(d);
        assertTrue(player.invent.isEmpty());
    } 
    
    /**
     * Testing adding and removing an Object from the Locations ArrayList called 'objects'.
     */    
    @Test
    public void testObjectsArrayList() { 
        System.out.println("DoDJUnit4Test: Test Adding And Removing From Objects Array List");
        World world = new World();
        Player player = new Player(world.locations.get(0));
        dod.Object d = new dod.Object("Dragon", "Description");
        
        //Test add
        player.location.objects.add(d);
        assertEquals("Dragon", player.location.objects.get(0).name);
        
        //Test remove
        player.location.objects.remove(d);
        assertEquals(0, player.location.objects.size());
    }   
        
    /**
     * Testing the drop command. Drop one object.
     */ 
    @Test
        public void testDropOneObject() {
        System.out.println("DoDJUnit4Test: Test Drop- 1 Object");
        World world = new World();
        Player player = new Player(world.locations.get(0));      
        player.invent.add(new dod.Object("sword", "Shiny sword"));
        player.location.objects.add(player.invent.get(0));
        assertEquals("sword", player.location.objects.get(0).name);
                
        player.invent.remove(player.invent.get(0));
        assertTrue(player.invent.isEmpty());
    }  
    
     /**
     * Testing the drop command. Drop all objects.
     */ 
    @Test
    public void testDropAllObjects() { 
        System.out.println("DoDJUnit4Test: Test Drop- All Objects");
        World world = new World();
        Player player = new Player(world.locations.get(0));      
        player.invent.add(new dod.Object("sword", "Shiny sword"));
        player.invent.add(new dod.Object("lamp", "Oil lamp"));
        player.invent.add(new dod.Object("dragon", "Scary dragon"));
        player.location.objects.addAll(player.invent);
        assertTrue(player.location.objects.containsAll(player.invent));
                
        player.invent.removeAll(player.invent);
        assertTrue(player.invent.isEmpty());
    } 
    
    /**
     * Testing the take command. Take one object.
     */ 
    @Test
    public void testTakeOneObject() { 
        System.out.println("DoDJUnit4Test: Test Take- 1 Object");
        World world = new World();
        Player player = new Player(world.locations.get(0));      
        player.location.objects.add(new dod.Object("sword", "Shiny sword"));
        player.invent.add(player.location.objects.get(0));
        assertEquals("sword", player.invent.get(0).name);
                
        player.location.objects.remove(player.location.objects.get(0));
        assertTrue(player.location.objects.isEmpty());
    }  
    
     /**
     * Testing the take command. Take all objects.
     */ 
    @Test
    public void testTakeAllObjects() { 
        System.out.println("DoDJUnit4Test: Test Take- All Objects");
        World world = new World();
        Player player = new Player(world.locations.get(0));      
        player.location.objects.add(new dod.Object("sword", "Shiny sword"));
        player.location.objects.add(new dod.Object("lamp", "Oil lamp"));
        player.location.objects.add(new dod.Object("dragon", "Scary dragon"));        
        player.invent.addAll(player.location.objects);
        assertEquals("dragon", player.invent.get(2).name);
                
        player.location.objects.removeAll(player.location.objects);
        assertTrue(player.location.objects.isEmpty());
    }        
}