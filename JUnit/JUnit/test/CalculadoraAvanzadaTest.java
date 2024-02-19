import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraAvanzadaTest {

    @Test
    void testRaizCuadrada() {
        CalculadoraAvanzada calculadora = new CalculadoraAvanzada();
        double resultado = calculadora.raizCuadrada(25);
        assertEquals(5, resultado);
    }

    @Test
    void testLogaritmoNatural() {
        CalculadoraAvanzada calculadora = new CalculadoraAvanzada();
        double resultado = calculadora.logaritmoNatural(10);
        assertEquals(2.302585092994046, resultado);
    }

    @Disabled("La implementación de factorial no esta completa, tocaría revisarla :D")
    @Test
    void testFactorial() {
        CalculadoraAvanzada calculadora = new CalculadoraAvanzada();
        long resultado = calculadora.factorial(5);
        assertEquals(120, resultado);
    }
}
