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
public class TecladoIT {
    
    public TecladoIT() {
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
     * Test of dibujarTeclado method, of class Teclado.
     */
    @Test
    public void testDibujarTeclado() {
        System.out.println("dibujarTeclado");
        Teclado instance = null;
        instance.dibujarTeclado();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cambiarColorTecla method, of class Teclado.
     */
    @Test
    public void testCambiarColorTecla() {
        System.out.println("cambiarColorTecla");
        char letra = ' ';
        String color = "";
        Teclado instance = null;
        instance.cambiarColorTecla(letra, color);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTeclas method, of class Teclado.
     */
    @Test
    public void testGetTeclas() {
        System.out.println("getTeclas");
        Teclado instance = null;
        ArrayList<Rectangulo> expResult = null;
        ArrayList<Rectangulo> result = instance.getTeclas();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLetras method, of class Teclado.
     */
    @Test
    public void testGetLetras() {
        System.out.println("getLetras");
        Teclado instance = null;
        char[] expResult = null;
        char[] result = instance.getLetras();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of contieneElemento method, of class Teclado.
     */
    @Test
    public void testContieneElemento() {
        System.out.println("contieneElemento");
        char[] arreglo = null;
        char elemento = ' ';
        Teclado instance = null;
        boolean expResult = false;
        boolean result = instance.contieneElemento(arreglo, elemento);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
