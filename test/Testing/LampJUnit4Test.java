package Testing;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import dod.Lamp;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author hannah
 */
public class LampJUnit4Test {
    
    public LampJUnit4Test() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

  /**
     * Test of isOn() and lampOn method, of class Lamp.
     */
    @Test
    public void testLampOn() {
        System.out.println("LampJUnit4Test: lampOn() method");
        Lamp instance = new Lamp(null, null);
        assertFalse(instance.isOn());
        instance.lampOn();
        assertTrue(instance.isOn());
    }

    /**
     * Test of lampOff method, of class Lamp.
     */
    @Test
    public void testLampOff() {
        System.out.println("LampJUnit4Test: lampOff() method");
        Lamp instance = new Lamp(null, null);  
        instance.lampOn(); // turn on first as new instances of Lamp are automatically set to false (turned off).
        instance.lampOff();
        assertFalse(instance.isOn());
    }

    @Test
    public void testOilLevel() {
        System.out.println("LampJUnit4Test: oilLevel() method");
        Lamp instance = new Lamp(null, null);
        assertFalse(instance.isOn());
        instance.isEmpty = true;
        assertFalse(instance.isOn());       
    }
}