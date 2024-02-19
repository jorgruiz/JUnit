public class CalculadoraFinanciera {

    /**
     * Calcula el interés compuesto dado un capital principal, la tasa de interés anual,
     * el número de veces que el interés se compone por año, y el número de años.
     *
     * @param principal El capital principal.
     * @param tasaInteres La tasa de interés anual en forma decimal (ejemplo: 0.05 para 5%).
     * @param numeroCompuestos El número de veces que el interés se compone por año.
     * @param años El número de años.
     * @return El monto acumulado con interés compuesto.
     */
    public double calcularInteresCompuesto(double principal, double tasaInteres, int numeroCompuestos, int años) {
        return principal * Math.pow(1 + (tasaInteres / numeroCompuestos), numeroCompuestos * años);
    }

    /**
     * Calcula el Valor Presente Neto (VPN) de una serie de flujos de caja futuros, dados
     * la tasa de descuento y los flujos de caja esperados (incluyendo la inversión inicial
     * como el primer flujo de caja negativo).
     *
     * @param tasaDescuento La tasa de descuento en forma decimal.
     * @param flujosCaja Un arreglo que contiene los flujos de caja, donde el primer elemento es la inversión inicial.
     * @return El Valor Presente Neto (VPN) de los flujos de caja dados.
     */
    public double calcularVPN(double tasaDescuento, double[] flujosCaja) {
        double vpn = 0;
        for (int i = 0; i < flujosCaja.length; i++) {
            vpn += flujosCaja[i] / Math.pow(1 + tasaDescuento, i);
        }
        return vpn;
    }
}