package org.gobcan.hacienda.TestPrueba;

public class Operaciones {
    public static int resta(int a, int b) {
        if (a == 0 && b == 0) {
            return -1;
        }
        return (a - b);
    }

    public static int suma(int a, int b) {
        if (a == 0 && b == 0) {
            return -1;
        }
        return (a + b);
    }

    public static int por(int a, int b) {
        if (a == 0 && b == 0) {
            return -1;
        }
        return (a * b);
    }

    public static int div(int a, int b) {
        if (b == 0) {
            return -1;
        }
        return (a / b);
    }
}
