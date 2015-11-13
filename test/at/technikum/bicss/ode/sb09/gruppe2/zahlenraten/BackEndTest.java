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

import at.technikum.bicss.ode.sb09.gruppe2.zahlenraten.GuessNumberIf.GuessNumberResult;

/**
 *
 * @author stinker
 */
public class BackEndTest {
    
    public BackEndTest() {
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
     * Test of getRandomNumber method, of class BackEnd.
     */
    @Test
    public void testGetRandomNumber() {
        System.out.println("getRandomNumber");
        BackEnd instance = new BackEnd();
        int expResult = 0;
        int result = instance.getRandomNumber();
        assertTrue((expResult != result));
        
    }
    @Test
    public void testGetRandomNumber2() {
        System.out.println("getRandomNumber bigger than Zero");
        BackEnd instance = new BackEnd();
        int expResult = 0;
        int result = instance.getRandomNumber();
        assertTrue((result > 0));
        
    }
    @Test
    public void testGetRandomNumber3() {
        System.out.println("getRandomNumber smaller than 100");
        BackEnd instance = new BackEnd();
        int expResult = 0;
        int result = instance.getRandomNumber();
        assertTrue((result <= 100));
        
    }
    /**
     * Test of compare method, of class BackEnd.
     */
    @Test
    public void testCompare() throws Exception {
        System.out.println("compare EQUAL");
        int zahl1 = 17;
        int zahl2 = 17;
                
        BackEnd instance = new BackEnd();
        GuessNumberIf.GuessNumberResult expResult = GuessNumberResult.EQUAL; 
        GuessNumberIf.GuessNumberResult result = instance.compare(zahl1, zahl2);
        assertEquals(expResult, result);
    }
    @Test
    public void testCompare2() throws Exception {
        System.out.println("compare LESS");
        int zahl1 = 17;
        int zahl2 = 5;

        
        BackEnd instance = new BackEnd();
        GuessNumberIf.GuessNumberResult expResult = GuessNumberResult.LESS; 
        GuessNumberIf.GuessNumberResult result = instance.compare(zahl1, zahl2);
        assertEquals(expResult, result);
    }
    @Test
    public void testCompare3() throws Exception {
        System.out.println("compare BIGGER");
        int zahl1 = 17;
        int zahl2 = 25;

        
        BackEnd instance = new BackEnd();
        GuessNumberIf.GuessNumberResult expResult = GuessNumberResult.BIGGER; 
        GuessNumberIf.GuessNumberResult result = instance.compare(zahl1, zahl2);
        assertEquals(expResult, result);
    }  
    @Test
    public void testException() throws Exception {
        System.out.println("compare Exception");
        int zahl1 = 17;
        int zahl2 = 0;

        
        BackEnd instance = new BackEnd();
        try {
            instance.compare(zahl1, zahl2);
            fail("exception should has been thrown.");
        }
        catch (GuessNumberException e) {
            
        }
        
    }
    
}
