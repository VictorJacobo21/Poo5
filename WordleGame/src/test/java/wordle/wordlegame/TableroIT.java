/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package wordle.wordlegame;

import java.util.ArrayList;
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
public class TableroIT {
    
    public TableroIT() {
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
     * Test of crearTablero method, of class Tablero.
     */
    @Test
    public void testCrearTablero() {
        System.out.println("crearTablero");
        Tablero instance = new Tablero();
        instance.crearTablero();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCuadros method, of class Tablero.
     */
    @Test
    public void testGetCuadros() {
        System.out.println("getCuadros");
        Tablero instance = new Tablero();
        ArrayList<Rectangulo> expResult = null;
        ArrayList<Rectangulo> result = instance.getCuadros();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of escribirPalabra method, of class Tablero.
     */
    @Test
    public void testEscribirPalabra() {
        System.out.println("escribirPalabra");
        String palabra = "";
        int rondas = 0;
        Tablero instance = new Tablero();
        instance.escribirPalabra(palabra, rondas);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCanvas method, of class Tablero.
     */
    @Test
    public void testGetCanvas() {
        System.out.println("getCanvas");
        Tablero instance = new Tablero();
        Canvas expResult = null;
        Canvas result = instance.getCanvas();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
