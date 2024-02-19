import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTest {

    @Test
    public void testSumar() {
        Calculadora calc = new Calculadora();
        assertEquals(5, calc.sumar(2, 3));
        assertEquals(-1, calc.sumar(-3, 2));
    }

    @Test
    public void testRestar() {
        Calculadora calc = new Calculadora();
        assertEquals(1, calc.restar(3, 2));
        assertEquals(-5, calc.restar(2, 7));
    }

    @Test
    public void testMultiplicar() {
        Calculadora calc = new Calculadora();
        assertEquals(6, calc.multiplicar(2, 3));
        assertEquals(-14, calc.multiplicar(-2, 7));
    }

    @Test
    public void testDividir() {
        Calculadora calc = new Calculadora();
        assertEquals(2.5, calc.dividir(5, 2));
        assertEquals(-3.0, calc.dividir(-6, 2));

        // Verificar excepción de división por cero
        assertThrows(ArithmeticException.class, () -> {
            calc.dividir(5, 0);
        });
    }
}
