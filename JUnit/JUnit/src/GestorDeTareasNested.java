import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class GestorDeTareasNested {
    private final Map<String, String> tareas = new HashMap<>();

    /**
     * Agrega una tarea al sistema.
     * @param id Identificador único de la tarea.
     * @param descripcion Descripción de la tarea.
     */
    public void agregarTarea(String id, String descripcion) {
        tareas.put(id, descripcion);
    }

    /**
     * Elimina una tarea del sistema.
     * @param id Identificador único de la tarea a eliminar.
     * @return true si la tarea fue eliminada, false si la tarea no existía.
     */
    public boolean eliminarTarea(String id) {
        return tareas.remove(id) != null;
    }

    /**
     * Busca una tarea por su identificador.
     * @param id Identificador único de la tarea.
     * @return La descripción de la tarea si se encuentra, o un Optional vacío si no se encuentra.
     */
    public Optional<String> buscarTareaPorId(String id) {
        return Optional.ofNullable(tareas.get(id));
    }
}