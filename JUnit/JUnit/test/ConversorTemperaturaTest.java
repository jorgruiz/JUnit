import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

public class ConversorTemperaturaTest {

    private final ConversorTemperatura conversor = new ConversorTemperatura();

    @ParameterizedTest
    @CsvSource({"0, 32.0", "100, 212.0", "-40, -40.0", "37, 98.6"})
    public void testCelsiusAFahrenheit(double celsius, double expectedFahrenheit) {
        double resultado = conversor.celsiusAFahrenheit(celsius);
        System.out.println("Temperatura en Celsius: " + celsius + " | Temperatura esperada en Fahrenheit: " + expectedFahrenheit + " | Resultado obtenido: " + resultado);
        assertEquals(expectedFahrenheit, resultado, 0.001); // Tolerancia de margen de error
    }
}
