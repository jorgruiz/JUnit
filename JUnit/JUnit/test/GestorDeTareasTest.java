import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class GestorDeTareasTest {
    private GestorDeTareas gestor;

    @BeforeEach
    public void setUp() {
        gestor = new GestorDeTareas();
        gestor.agregarTarea("Tarea 1");
        gestor.agregarTarea("Tarea 2");
    }

    @AfterEach
    public void tearDown() {
        gestor.limpiarTareas();
    }

    @Test
    public void testAgregarTarea() {
        assertEquals(2, gestor.obtenerTareas().size());
        assertTrue(gestor.obtenerTareas().contains("Tarea 1"));
        assertTrue(gestor.obtenerTareas().contains("Tarea 2"));

        gestor.agregarTarea("Tarea 3");
        assertEquals(3, gestor.obtenerTareas().size());
        assertTrue(gestor.obtenerTareas().contains("Tarea 3"));
    }

    @Test
    public void testEliminarTarea() {
        assertTrue(gestor.eliminarTarea("Tarea 1"));
        assertFalse(gestor.obtenerTareas().contains("Tarea 1"));
        assertEquals(1, gestor.obtenerTareas().size());

        assertFalse(gestor.eliminarTarea("Tarea 3"));
        assertEquals(1, gestor.obtenerTareas().size());
    }
}
