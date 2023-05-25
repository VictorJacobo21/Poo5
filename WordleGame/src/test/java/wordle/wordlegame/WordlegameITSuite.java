/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4Suite.java to edit this template
 */
package wordle.wordlegame;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author PC
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({wordle.wordlegame.WordleIT.class, wordle.wordlegame.RectanguloIT.class, wordle.wordlegame.WordleGameIT.class, wordle.wordlegame.TecladoIT.class, wordle.wordlegame.CanvasIT.class, wordle.wordlegame.TableroIT.class, wordle.wordlegame.GraphicStringIT.class})
public class WordlegameITSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
}
