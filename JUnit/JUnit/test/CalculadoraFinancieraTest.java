import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraFinancieraTest {

    private final CalculadoraFinanciera calculadora = new CalculadoraFinanciera();

    // Pruebas para el método calcularInteresCompuesto

    @Test
    void testCalcularInteresCompuesto() {
        // Caso de prueba 1: Valores positivos
        double resultado1 = calculadora.calcularInteresCompuesto(1000, 0.05, 12, 5);
        assertEquals(1276.281, resultado1, 0.001);

        // Caso de prueba 2: Capital principal negativo
        assertThrows(IllegalArgumentException.class, () -> {
            calculadora.calcularInteresCompuesto(-1000, 0.05, 12, 5);
        });

        // Caso de prueba 3: Tasa de interés negativa
        assertThrows(IllegalArgumentException.class, () -> {
            calculadora.calcularInteresCompuesto(1000, -0.05, 12, 5);
        });


    }

    // Pruebas para el método calcularVPN

    @Test
    void testCalcularVPN() {
        // Caso de prueba 1: Flujos de caja variados
        double[] flujosCaja1 = {-1000, 200, 300, 400, 500};
        double resultado1 = calculadora.calcularVPN(0.05, flujosCaja1);
        assertEquals(849.775, resultado1, 0.001);

        // Caso de prueba 2: Tasa de descuento negativa
        assertThrows(IllegalArgumentException.class, () -> {
            double[] flujosCaja2 = {-1000, 200, 300, 400, 500};
            calculadora.calcularVPN(-0.05, flujosCaja2);
        });

        // Otros casos de prueba: Flujos de caja vacíos, valores negativos, etc.
    }
}

