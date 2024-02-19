import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ControladorAccesoTest {

    private ControladorAcceso controlador;

    @BeforeEach
    void setUp() {
        controlador = new ControladorAcceso();
    }

    @Test
    void testAccesoAdmin() {
        controlador.asignarRolAUsuario("adminUser", "ADMIN");
        assertTrue(controlador.verificarAcceso("adminUser", "CUALQUIER_FUNCIONALIDAD"));
    }

    @Test
    void testAccesoEditor() {
        controlador.asignarRolAUsuario("editorUser", "EDITOR");
        assertTrue(controlador.verificarAcceso("editorUser", "ALGUNA_FUNCIONALIDAD"));
        assertFalse(controlador.verificarAcceso("editorUser", "GESTION_USUARIOS"));
    }

    @Test
    void testAccesoVisitante() {
        controlador.asignarRolAUsuario("visitorUser", "VISITANTE");
        assertTrue(controlador.verificarAcceso("visitorUser", "CONSULTA"));
        assertFalse(controlador.verificarAcceso("visitorUser", "ALGUNA_FUNCIONALIDAD"));
    }

    @Test
    void testUsuarioSinRol() {
        assertFalse(controlador.verificarAcceso("unknownUser", "CUALQUIER_FUNCIONALIDAD"));
    }

    @Test
    void testRolNoReconocido() {
        controlador.asignarRolAUsuario("userWithUnknownRole", "UNKNOWN_ROLE");
        assertFalse(controlador.verificarAcceso("userWithUnknownRole", "CUALQUIER_FUNCIONALIDAD"));
    }
}
