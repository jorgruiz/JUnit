import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

public class SistemaOperativoUtilsTest {

    @Test
    @EnabledOnOs(OS.WINDOWS)
    public void testNombreSO() {
        // Si es Windows se ejecuta.
        String nombreSO = SistemaOperativoUtils.obtenerNombreSO();
        assertEquals("Windows", nombreSO);
    }

    @Test
    public void testEsWindows() {
        // Esta prueba se ejecutará en todos los sistemas operativos,
        // pero asumirá que es Windows y solo realizará la verificación en ese caso
        assumeTrue(SistemaOperativoUtils.esWindows());
        assertEquals("Windows", SistemaOperativoUtils.obtenerNombreSO());
    }
}
