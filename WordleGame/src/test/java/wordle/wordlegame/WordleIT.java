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
public class WordleIT {
    
    public WordleIT() {
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
     * Test of getSecreto method, of class Wordle.
     */
    @Test
    public void testGetSecreto() {
        System.out.println("getSecreto");
        Wordle instance = new Wordle();
        String expResult = "";
        String result = instance.getSecreto();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of intento method, of class Wordle.
     */
    @Test
    public void testIntento() {
        System.out.println("intento");
        String intento = "";
        Teclado teclado = null;
        Tablero tablero = null;
        int rondas = 0;
        Wordle instance = new Wordle();
        instance.intento(intento, teclado, tablero, rondas);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
