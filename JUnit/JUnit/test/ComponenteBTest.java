import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Tag("ComponenteB")
public class ComponenteBTest {

    private final ComponenteB componenteB = new ComponenteB();

    @Test
    public void testOperacionB() {
        int resultado = componenteB.operacionB();
        assertEquals(42, resultado);
    }
}
