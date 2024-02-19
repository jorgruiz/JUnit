import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class GeneradorNumerosTest {

    private final GeneradorNumeros generador = new GeneradorNumeros();

    @Test
    void testGenerarNumeroAleatorioEnRango() {
        // Generamos 100 números aleatorios en diferentes rangos y verificamos que estén dentro del rango especificado
        for (int i = 0; i < 100; i++) {
            int min = generador.generarNumeroAleatorioEnRango(-1000, 1000);
            int max = generador.generarNumeroAleatorioEnRango(min, 2000);
            assertTrue(min >= -1000 && min <= 1000);
            assertTrue(max >= min && max <= 2000);
        }
    }

    @Test
    void testEsPar() {
        // Verificamos que esPar funcione correctamente para un conjunto de números aleatorios
        for (int i = 0; i < 100; i++) {
            int numero = generador.generarNumeroAleatorioEnRango(Integer.MIN_VALUE, Integer.MAX_VALUE);
            assertEquals(numero % 2 == 0, generador.esPar(numero));
        }
    }
}
