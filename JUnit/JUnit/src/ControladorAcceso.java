import java.util.HashMap;
import java.util.Map;

public class ControladorAcceso {

    private Map<String, String> usuariosYRoles;

    public ControladorAcceso() {
        this.usuariosYRoles = new HashMap<>();
    }

    /**
     * Asigna un rol a un usuario.
     *
     * @param usuario El nombre de usuario.
     * @param rol El rol asignado al usuario.
     */
    public void asignarRolAUsuario(String usuario, String rol) {
        usuariosYRoles.put(usuario, rol);
    }

    /**
     * Verifica si un usuario tiene acceso a una funcionalidad basada en su rol.
     *
     * @param usuario El nombre de usuario.
     * @param funcionalidad La funcionalidad a la que se desea acceder.
     * @return true si el usuario tiene acceso a la funcionalidad; false en caso contrario.
     */
    public boolean verificarAcceso(String usuario, String funcionalidad) {
        String rol = usuariosYRoles.get(usuario);
        if (rol == null) {
            return false;
        }
        switch (rol) {
            case "ADMIN":
                return true; // Los admins tienen acceso a todo.
            case "EDITOR":
                return !funcionalidad.equals("GESTION_USUARIOS"); // Los editores no pueden gestionar usuarios.
            case "VISITANTE":
                return funcionalidad.equals("CONSULTA"); // Los visitantes solo pueden consultar.
            default:
                return false;
        }
    }
}