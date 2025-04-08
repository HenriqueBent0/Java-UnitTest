package test;

import model.Retangulo;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class TestRetangulo {

    @Test
    public void testgetArea() {
        double altura = 3;
        double base = 2;

        double retornoEsperado = 6;

        Retangulo retangulo = new Retangulo(base, altura);

        double retornoFeito = retangulo.getArea();

        assertEquals(retornoEsperado, retornoFeito, 0);
    }
}
