import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class GestorDeConexionTest {

    private static Connection connection;

    @BeforeAll
    public static void setUp() throws SQLException {
        String url = "jdbc:mysql://localhost/examenjdbc";
        String usuario = "root";
        String contraseña = "";

        try {
            connection = DriverManager.getConnection(url, usuario, contraseña);
            System.out.println("Conexión establecida con phpMyAdmin.");
            // Aquí puedes realizar cualquier inicialización adicional que necesites con la conexión
        } catch (SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("No se pudo establecer la conexión con phpMyAdmin.");
        }
    }

    @AfterAll
    public static void tearDown() {
        if (connection != null) {
            try {
                connection.close();
                System.out.println("Conexión cerrada con phpMyAdmin.");
            } catch (SQLException e) {
                e.printStackTrace();
                throw new RuntimeException("Error al cerrar la conexión con phpMyAdmin.");
            }
        }
    }

    @Test
    public void testOperacion1() {
        // Aquí puedes realizar tus pruebas que requieren la conexión a la base de datos
        System.out.println("Realizando la prueba de la operación 1...");
        // Ejemplo de verificación
        assertTrue(true);
    }

    @Test
    public void testOperacion2() {
        // Otras pruebas...
        System.out.println("Realizando la prueba de la operación 2...");
        // Ejemplo de verificación
        assertTrue(true);
    }
}
