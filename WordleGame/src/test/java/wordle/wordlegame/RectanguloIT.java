/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package wordle.wordlegame;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author PC
 */
public class RectanguloIT {
    
    public RectanguloIT() {
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
     * Test of makeVisible method, of class Rectangulo.
     */
    @Test
    public void testMakeVisible() {
        System.out.println("makeVisible");
        Rectangulo instance = new Rectangulo();
        instance.makeVisible();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of makeInvisible method, of class Rectangulo.
     */
    @Test
    public void testMakeInvisible() {
        System.out.println("makeInvisible");
        Rectangulo instance = new Rectangulo();
        instance.makeInvisible();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of changeColor method, of class Rectangulo.
     */
    @Test
    public void testChangeColor() {
        System.out.println("changeColor");
        String colorString = "";
        Rectangulo instance = new Rectangulo();
        instance.changeColor(colorString);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of fill method, of class Rectangulo.
     */
    @Test
    public void testFill() {
        System.out.println("fill");
        Rectangulo instance = new Rectangulo();
        instance.fill();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of position method, of class Rectangulo.
     */
    @Test
    public void testPosition() {
        System.out.println("position");
        int newXPosition = 0;
        int newYPosition = 0;
        Rectangulo instance = new Rectangulo();
        instance.position(newXPosition, newYPosition);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getxPosition method, of class Rectangulo.
     */
    @Test
    public void testGetxPosition() {
        System.out.println("getxPosition");
        Rectangulo instance = new Rectangulo();
        int expResult = 0;
        int result = instance.getxPosition();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getyPosition method, of class Rectangulo.
     */
    @Test
    public void testGetyPosition() {
        System.out.println("getyPosition");
        Rectangulo instance = new Rectangulo();
        int expResult = 0;
        int result = instance.getyPosition();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
