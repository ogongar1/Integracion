package org.gobcan.hacienda.TestPrueba;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Hello world!
 *
 */
public class App 

{

    public static final Logger logger = Logger.getLogger("org.gobcan.hacienda.TestPrueba.App");

    public static int suma(int a, int b) {
        if (a == 0 && b == 0) {
            return -1;
        }
        return (a + b);
    }


    public static void main( String[] args )
    {
        logger.log(Level.INFO, "Hello World!");
        logger.log(Level.INFO, "Suma 10+35: " + suma(10, 35));
    }
}
