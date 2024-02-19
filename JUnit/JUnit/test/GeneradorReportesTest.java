import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneradorReportesTest {

    private final GeneradorReportes generador = new GeneradorReportes();

    @TestFactory
    Stream<DynamicTest> testGenerarReporte() {
        List<String> datos1 = Arrays.asList("Dato 1", "Dato 2", "Dato 3");
        List<String> datos2 = Arrays.asList("Información A", "Información B", "Información C");

        return Stream.of(
                DynamicTest.dynamicTest("Prueba con datos 1", () -> {
                    String resultado = generador.generarReporte(datos1);
                    String esperado = "Reporte:\n- Dato 1\n- Dato 2\n- Dato 3\n";
                    assertEquals(esperado, resultado);
                }),
                DynamicTest.dynamicTest("Prueba con datos 2", () -> {
                    String resultado = generador.generarReporte(datos2);
                    String esperado = "Reporte:\n- Información A\n- Información B\n- Información C\n";
                    assertEquals(esperado, resultado);
                })
        );
    }
}
