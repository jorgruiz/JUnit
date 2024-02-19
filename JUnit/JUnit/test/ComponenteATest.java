import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Tag("ComponenteA")
public class ComponenteATest {

    private final ComponenteA componenteA = new ComponenteA();

    @Test
    public void testOperacionA() {
        String resultado = componenteA.operacionA();
        assertEquals("Resultado de operación A", resultado);
    }
}
