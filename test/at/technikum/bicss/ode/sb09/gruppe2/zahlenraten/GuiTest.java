/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package at.technikum.bicss.ode.sb09.gruppe2.zahlenraten;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class GuiTest {
    
    public GuiTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getInput method, of class Gui.
     */
    @Test
    public void testGetInput() {
        System.out.println("getInput");
        Gui instance = new Gui();
        int expResult = 5;
        int result = instance.getInput();
        assertEquals(expResult, result);

    }
    @Test
    public void testGetInput2() {
        System.out.println("getInput negativ");
        Gui instance = new Gui();
        int expResult = -5;
        instance.setInput("-5");
        int result = instance.getInput();
        assertEquals(expResult, result);

    }
        @Test
    public void testGetInput3() {
        System.out.println("getInput too big");
        Gui instance = new Gui();
        int expResult = 500;
        instance.setInput("500");
        int result = instance.getInput();
        assertEquals(expResult, result);

    }
    @Test
    public void testGetInput4() {
        System.out.println("getInput Text");
        Gui instance = new Gui();
        int expResult = 0;
        instance.setInput("ABC");
        int result = instance.getInput();
        assertEquals(expResult, result);

    }
    /**
     * Test of main method, of class Gui.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Gui.main(args);

    }
    
}
