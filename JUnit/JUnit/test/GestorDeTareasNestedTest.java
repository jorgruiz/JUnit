import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

public class GestorDeTareasNestedTest {

    @Nested
    class AgregarTareaTests {

        private GestorDeTareasNested gestorDeTareas;

        @BeforeEach
        void setUp() {
            gestorDeTareas = new GestorDeTareasNested();
        }

        @Test
        void agregarTarea_DeberiaAgregarCorrectamente() {
            gestorDeTareas.agregarTarea("1", "Tarea de prueba");
            Optional<String> descripcion = gestorDeTareas.buscarTareaPorId("1");
            assertTrue(descripcion.isPresent());
            assertEquals("Tarea de prueba", descripcion.get());
        }
    }

    @Nested
    class EliminarTareaTests {

        private GestorDeTareasNested gestorDeTareas;

        @BeforeEach
        void setUp() {
            gestorDeTareas = new GestorDeTareasNested();
            gestorDeTareas.agregarTarea("1", "Tarea de prueba");
        }

        @Test
        void eliminarTarea_DeberiaEliminarCorrectamente() {
            assertTrue(gestorDeTareas.eliminarTarea("1"));
            assertFalse(gestorDeTareas.buscarTareaPorId("1").isPresent());
        }

        @Test
        void eliminarTarea_DeberiaRetornarFalseSiNoExisteLaTarea() {
            assertFalse(gestorDeTareas.eliminarTarea("2"));
        }
    }
}
