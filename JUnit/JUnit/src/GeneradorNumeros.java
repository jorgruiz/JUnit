public class GeneradorNumeros {

    /**
     * Genera un número aleatorio dentro de un rango especificado.
     *
     * @param min El límite inferior del rango (inclusive).
     * @param max El límite superior del rango (inclusive).
     * @return Un número aleatorio dentro del rango [min, max].
     */
    public int generarNumeroAleatorioEnRango(int min, int max) {
        if (min >= max) {
            throw new IllegalArgumentException("El máximo debe ser mayor que el mínimo");
        }
        return (int) (Math.random() * ((max - min) + 1)) + min;
    }

    /**
     * Verifica si un número es par.
     *
     * @param numero El número a verificar.
     * @return true si el número es par, false si es impar.
     */
    public boolean esPar(int numero) {
        return numero % 2 == 0;
    }
}