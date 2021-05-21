package org.gobcan.hacienda.TestPrueba;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }


    @Test
    public void pruebaDeSumaTest1() {
        assertNotEquals("La suma ha dejado de ser correcta", 100, App.suma(10, 10));
        assertEquals("La suma ha dejado de ser correcta", 20, App.suma(10, 10));
    }

    @Test
    public void pruebaDeSumaTest2() {
        assertEquals("La suma ha dejado de ser correcta", 17, App.suma(15, 2));
    }

    @Test
    public void pruebaDeSumaTest3() {
        assertEquals("La suma ha dejado de ser correcta", 4, App.suma(2, 2));
    }

    @Test
    public void pruebaDeSumaTest4() {
        assertEquals("La suma ha dejado de ser correcta", 3, App.suma(2, 1));
    }

}
