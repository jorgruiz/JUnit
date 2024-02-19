import java.util.HashMap;
import java.util.Map;

public class GestorProductos {

    private final Map<String, Double> productos = new HashMap<>();

    public boolean agregarProducto(String nombre, double precio) {
        if (nombre == null || nombre.isEmpty() || precio <= 0) {
            return false;
        }
        productos.put(nombre, precio);
        return true;
    }

    public double obtenerPrecio(String nombre) {
        return productos.getOrDefault(nombre, 0.0);
    }

    public boolean eliminarProducto(String nombre) {
        if (!productos.containsKey(nombre)) {
            return false;
        }
        productos.remove(nombre);
        return true;
    }
}