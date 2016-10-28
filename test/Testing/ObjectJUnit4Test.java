package Testing;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import dod.Object;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author hannah
 */
public class ObjectJUnit4Test {
    
    public ObjectJUnit4Test() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of takeable method, of class Object.
     */
    @Test
    public void testTakeable() {
        System.out.println("ObjectJUnit4Test: takeable() method");
        Object o = new Object(null, null);
        assertEquals(1, o.takeable());       
        o.takeable = -1;
        assertEquals(-1, o.takeable());
    }  
}