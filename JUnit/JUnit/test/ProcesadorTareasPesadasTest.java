import org.junit.jupiter.api.Test;
import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

public class ProcesadorTareasPesadasTest {

    private final ProcesadorTareasPesadas procesador = new ProcesadorTareasPesadas();

    @Test
    public void testRendimientoOperacionIntensiva() {
        // Establecer un límite de tiempo de ejecución de 5 segundos
        Duration timeout = Duration.ofSeconds(5);

        // Verificar que la operación se completa dentro del límite de tiempo
        assertTimeout(timeout, () -> {
            long resultado = procesador.realizarOperacionIntensiva();
            assertNotNull(resultado); // Asegurar que el resultado no sea nulo
        });
    }
}
