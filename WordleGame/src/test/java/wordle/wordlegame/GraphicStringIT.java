/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package wordle.wordlegame;

import java.awt.Color;
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
public class GraphicStringIT {
    
    public GraphicStringIT() {
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
     * Test of dibujarChar method, of class GraphicString.
     */
    @Test
    public void testDibujarChar() {
        System.out.println("dibujarChar");
        char texto = ' ';
        int x = 0;
        int y = 0;
        GraphicString instance = null;
        instance.dibujarChar(texto, x, y);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of dibujarString method, of class GraphicString.
     */
    @Test
    public void testDibujarString() {
        System.out.println("dibujarString");
        String texto = "";
        int x = 0;
        int y = 0;
        GraphicString instance = null;
        instance.dibujarString(texto, x, y);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cambiarColor method, of class GraphicString.
     */
    @Test
    public void testCambiarColor() {
        System.out.println("cambiarColor");
        Color color = null;
        GraphicString instance = null;
        instance.cambiarColor(color);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
