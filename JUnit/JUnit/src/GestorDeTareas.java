import java.util.ArrayList;
import java.util.List;

public class GestorDeTareas {
    private List<String> tareas;

    public GestorDeTareas() {
        tareas = new ArrayList<>();
    }

    public void agregarTarea(String tarea) {
        tareas.add(tarea);
    }

    public boolean eliminarTarea(String tarea) {
        return tareas.remove(tarea);
    }

    public List<String> obtenerTareas() {
        return new ArrayList<>(tareas);
    }

    public void limpiarTareas() {
        tareas.clear();
    }
}