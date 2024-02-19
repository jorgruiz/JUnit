import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;


public class ProcesadorTareasTest {

    private final ProcesadorTareas procesador = new ProcesadorTareas();

    @Test
    @Timeout(500) // Timeout de 500 milisegundos
    public void testEjecutarTareaLarga() throws InterruptedException {
        procesador.ejecutarTareaLarga(400);
    }
}
