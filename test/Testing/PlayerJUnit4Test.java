package Testing;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import dod.Object;
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
public class PlayerJUnit4Test {
    
    public PlayerJUnit4Test() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of setObject method, of class Player.
     */
    @Test
    public void testSetObject() {
        System.out.println("PlayerJUnit4Test: setObject() method"); 
        World world = new World();
        Player player = new Player(world.locations.get(0));   
        Object s = new Object("sword", "Shiny sword");
        player.setObject(s);
        assertEquals("sword", player.invent.get(0).name);
    }

    /**
     * Test of isHolding method, of class Player.
     */
    @Test
    public void testIsHolding() {
        System.out.println("PlayerJUnit4Test: isHolding() method");
        World world = new World();
        Player player = new Player(world.locations.get(0));     
        player.setObject(new Object ("dragon", null));
        assertEquals(0, player.isHolding("dragon"));  
        assertEquals(-1, player.isHolding("sword"));  
        player.setObject(new Object ("sword",null)); 
        assertEquals(1, player.isHolding("sword")); 
    }
    
}