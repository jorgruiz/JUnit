import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;
import java.util.Map;

public class GestorProductosTest {

    private GestorProductos gestorProductos;

    @BeforeEach
    void setUp() {
        gestorProductos = new GestorProductos();
    }

    @Test
    void agregarProducto_ProductoValido_DeberiaAgregarProducto() {
        assertTrue(gestorProductos.agregarProducto("Producto1", 10.0));
    }

    @Test
    void agregarProducto_ProductoConNombreNulo_NoDeberiaAgregarProducto() {
        assertFalse(gestorProductos.agregarProducto(null, 10.0));
    }

    @Test
    void agregarProducto_ProductoConNombreVacio_NoDeberiaAgregarProducto() {
        assertFalse(gestorProductos.agregarProducto("", 10.0));
    }

    @Test
    void agregarProducto_ProductoConPrecioCero_NoDeberiaAgregarProducto() {
        assertFalse(gestorProductos.agregarProducto("Producto1", 0.0));
    }

    @Test
    void agregarProducto_ProductoConPrecioNegativo_NoDeberiaAgregarProducto() {
        assertFalse(gestorProductos.agregarProducto("Producto1", -10.0));
    }

    @Test
    void obtenerPrecio_ProductoExistente_DeberiaDevolverPrecioCorrecto() {
        gestorProductos.agregarProducto("Producto1", 10.0);
        assertEquals(10.0, gestorProductos.obtenerPrecio("Producto1"));
    }

    @Test
    void obtenerPrecio_ProductoNoExistente_DeberiaDevolverPrecioCero() {
        assertEquals(0.0, gestorProductos.obtenerPrecio("Producto1"));
    }

    @Test
    void eliminarProducto_ProductoExistente_DeberiaEliminarProducto() {
        gestorProductos.agregarProducto("Producto1", 10.0);
        assertTrue(gestorProductos.eliminarProducto("Producto1"));
    }

    @Test
    void eliminarProducto_ProductoNoExistente_NoDeberiaEliminarProducto() {
        assertFalse(gestorProductos.eliminarProducto("Producto1"));
    }
}
