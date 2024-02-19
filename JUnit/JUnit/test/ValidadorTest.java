import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ValidadorTest {

    @Test
    public void testValidarTexto() {
        Validador validador = new Validador();

        // Verificar que no lance ninguna excepción cuando el texto es válido
        assertDoesNotThrow(() -> validador.validarTexto("Texto válido"));

        // Verificar que lance una excepción cuando el texto es nulo
        assertThrows(TextoInvalidoException.class, () -> validador.validarTexto(null));

        // Verificar que lance una excepción cuando el texto está vacío
        assertThrows(TextoInvalidoException.class, () -> validador.validarTexto(""));

        // Verificar el mensaje de la excepción cuando el texto está vacío
        TextoInvalidoException exception = assertThrows(TextoInvalidoException.class, () -> validador.validarTexto(""));
        assertEquals("El texto no puede ser nulo ni vacío", exception.getMessage());
    }
}
