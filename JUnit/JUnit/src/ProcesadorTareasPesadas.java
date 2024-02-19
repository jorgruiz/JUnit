public class ProcesadorTareasPesadas {

    /**
     * Realiza una operación de procesamiento intensivo que simula cálculos complejos o
     * procesamiento de grandes volúmenes de datos.
     *
     * @return El resultado de la operación de procesamiento.
     */
    public long realizarOperacionIntensiva() {
        // Simulación de una tarea intensiva, como un algoritmo de ordenamiento en una gran colección,
        // cálculo de operaciones matemáticas complejas, etc.
        long resultado = 0;
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            resultado += i;
        }
        return resultado;
    }
}