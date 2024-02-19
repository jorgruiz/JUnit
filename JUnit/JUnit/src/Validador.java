public class Validador {

    /**
     * Valida si el texto proporcionado es nulo o está vacío.
     *
     * @param texto El texto a validar.
     * @throws TextoInvalidoException Si el texto es nulo o vacío.
     */
    public void validarTexto(String texto) throws TextoInvalidoException {
        if (texto == null || texto.isEmpty()) {
            throw new TextoInvalidoException("El texto no puede ser nulo ni vacío");
        }
        // Lógica adicional de validación si es necesaria
    }
}

/**
 * Excepción personalizada para indicar que un texto no cumple con los criterios de validación.
 */
class TextoInvalidoException extends Exception {
    public TextoInvalidoException(String mensaje) {
        super(mensaje);
    }
}
