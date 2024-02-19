import java.util.List;

public class GeneradorReportes {

    /**
     * Genera un reporte basado en una lista de datos.
     * @param datos Lista de datos para incluir en el reporte.
     * @return El reporte generado como una cadena de texto.
     */
    public String generarReporte(List<String> datos) {
        if (datos == null || datos.isEmpty()) {
            return "Reporte vacío";
        }

        StringBuilder reporte = new StringBuilder("Reporte:\n");
        for (String dato : datos) {
            reporte.append("- ").append(dato).append("\n");
        }
        return reporte.toString();
    }
}