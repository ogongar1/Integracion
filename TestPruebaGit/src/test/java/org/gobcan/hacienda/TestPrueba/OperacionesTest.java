package org.gobcan.hacienda.TestPrueba;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class OperacionesTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);
    }

    @Test
    public void pruebaDeResta1Test() {
        assertEquals("La resta ha dejado de ser correcta", 0, Operaciones.resta(10, 10));
    }

    @Test
    public void pruebaDeResta2Test() {
        assertNotEquals("La resta ha dejado de ser correcta", 8, Operaciones.resta(100, 100));
        assertEquals("La resta ha dejado de ser correcta", -900, Operaciones.resta(100, 1000));
    }

    @Test
    public void pruebaDePor1Test() {
        assertEquals("La multiplicación ha dejado de ser correcta", 4, Operaciones.por(2, 2));
        assertEquals("La multiplicación ha dejado de ser correcta", 100, Operaciones.por(10, 10));
        assertSame(null, getClass(), getClass());
    }

    @Test
    public void pruebaDeDiv1Test() {
        try {
            assertEquals("La division ha dejado de ser correcta", 10, Operaciones.div(100, 10));
        } catch (ArithmeticException a) {
            assertTrue(true);
        }
    }

    @Test
    public void pruebaDeSumaTest2() {
        assertEquals("La suma ha dejado de ser correcta", 17, Operaciones.suma(15, 2));
    }

}
