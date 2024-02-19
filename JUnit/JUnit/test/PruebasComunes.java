import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public interface PruebasComunes {

    // Método predeterminado con una prueba común que puede ser compartida
    @Test
    default void pruebaEjecucionBasica() {
        assertTrue(ejecucionBasica(), "La ejecución básica debe retornar verdadero");
    }

    // Método que las clases concretas deben implementar
    boolean ejecucionBasica();
}