/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package wordle.wordlegame;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Shape;
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
public class CanvasIT {
    
    public CanvasIT() {
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
     * Test of setVisible method, of class Canvas.
     */
    @Test
    public void testSetVisible() {
        System.out.println("setVisible");
        boolean visible = false;
        Canvas instance = null;
        instance.setVisible(visible);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isVisible method, of class Canvas.
     */
    @Test
    public void testIsVisible() {
        System.out.println("isVisible");
        Canvas instance = null;
        boolean expResult = false;
        boolean result = instance.isVisible();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of draw method, of class Canvas.
     */
    @Test
    public void testDraw() {
        System.out.println("draw");
        Shape shape = null;
        Canvas instance = null;
        instance.draw(shape);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of fill method, of class Canvas.
     */
    @Test
    public void testFill() {
        System.out.println("fill");
        Shape shape = null;
        Canvas instance = null;
        instance.fill(shape);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of fillCircle method, of class Canvas.
     */
    @Test
    public void testFillCircle() {
        System.out.println("fillCircle");
        int xPos = 0;
        int yPos = 0;
        int diameter = 0;
        Canvas instance = null;
        instance.fillCircle(xPos, yPos, diameter);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of fillRectangle method, of class Canvas.
     */
    @Test
    public void testFillRectangle() {
        System.out.println("fillRectangle");
        int xPos = 0;
        int yPos = 0;
        int width = 0;
        int height = 0;
        Canvas instance = null;
        instance.fillRectangle(xPos, yPos, width, height);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of erase method, of class Canvas.
     */
    @Test
    public void testErase_0args() {
        System.out.println("erase");
        Canvas instance = null;
        instance.erase();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of eraseCircle method, of class Canvas.
     */
    @Test
    public void testEraseCircle() {
        System.out.println("eraseCircle");
        int xPos = 0;
        int yPos = 0;
        int diameter = 0;
        Canvas instance = null;
        instance.eraseCircle(xPos, yPos, diameter);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of eraseRectangle method, of class Canvas.
     */
    @Test
    public void testEraseRectangle() {
        System.out.println("eraseRectangle");
        int xPos = 0;
        int yPos = 0;
        int width = 0;
        int height = 0;
        Canvas instance = null;
        instance.eraseRectangle(xPos, yPos, width, height);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of erase method, of class Canvas.
     */
    @Test
    public void testErase_Shape() {
        System.out.println("erase");
        Shape shape = null;
        Canvas instance = null;
        instance.erase(shape);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of eraseOutline method, of class Canvas.
     */
    @Test
    public void testEraseOutline() {
        System.out.println("eraseOutline");
        Shape shape = null;
        Canvas instance = null;
        instance.eraseOutline(shape);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of drawImage method, of class Canvas.
     */
    @Test
    public void testDrawImage() {
        System.out.println("drawImage");
        Image image = null;
        int x = 0;
        int y = 0;
        Canvas instance = null;
        boolean expResult = false;
        boolean result = instance.drawImage(image, x, y);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of drawString method, of class Canvas.
     */
    @Test
    public void testDrawString() {
        System.out.println("drawString");
        String text = "";
        int x = 0;
        int y = 0;
        Canvas instance = null;
        instance.drawString(text, x, y);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of eraseString method, of class Canvas.
     */
    @Test
    public void testEraseString() {
        System.out.println("eraseString");
        String text = "";
        int x = 0;
        int y = 0;
        Canvas instance = null;
        instance.eraseString(text, x, y);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of drawLine method, of class Canvas.
     */
    @Test
    public void testDrawLine() {
        System.out.println("drawLine");
        int x1 = 0;
        int y1 = 0;
        int x2 = 0;
        int y2 = 0;
        Canvas instance = null;
        instance.drawLine(x1, y1, x2, y2);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setForegroundColor method, of class Canvas.
     */
    @Test
    public void testSetForegroundColor() {
        System.out.println("setForegroundColor");
        Color newColor = null;
        Canvas instance = null;
        instance.setForegroundColor(newColor);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getForegroundColor method, of class Canvas.
     */
    @Test
    public void testGetForegroundColor() {
        System.out.println("getForegroundColor");
        Canvas instance = null;
        Color expResult = null;
        Color result = instance.getForegroundColor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setBackgroundColor method, of class Canvas.
     */
    @Test
    public void testSetBackgroundColor() {
        System.out.println("setBackgroundColor");
        Color newColor = null;
        Canvas instance = null;
        instance.setBackgroundColor(newColor);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBackgroundColor method, of class Canvas.
     */
    @Test
    public void testGetBackgroundColor() {
        System.out.println("getBackgroundColor");
        Canvas instance = null;
        Color expResult = null;
        Color result = instance.getBackgroundColor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFont method, of class Canvas.
     */
    @Test
    public void testSetFont() {
        System.out.println("setFont");
        Font newFont = null;
        Canvas instance = null;
        instance.setFont(newFont);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFont method, of class Canvas.
     */
    @Test
    public void testGetFont() {
        System.out.println("getFont");
        Canvas instance = null;
        Font expResult = null;
        Font result = instance.getFont();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSize method, of class Canvas.
     */
    @Test
    public void testSetSize() {
        System.out.println("setSize");
        int width = 0;
        int height = 0;
        Canvas instance = null;
        instance.setSize(width, height);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSize method, of class Canvas.
     */
    @Test
    public void testGetSize() {
        System.out.println("getSize");
        Canvas instance = null;
        Dimension expResult = null;
        Dimension result = instance.getSize();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getGraphic method, of class Canvas.
     */
    @Test
    public void testGetGraphic() {
        System.out.println("getGraphic");
        Canvas instance = null;
        Graphics2D expResult = null;
        Graphics2D result = instance.getGraphic();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of wait method, of class Canvas.
     */
    @Test
    public void testWait() {
        System.out.println("wait");
        int milliseconds = 0;
        Canvas instance = null;
        instance.wait(milliseconds);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
