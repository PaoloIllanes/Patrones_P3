package ejerciciosP3.ejercicio2;

public class PagoTigoMoney implements ITipoPago {
    @Override
    public void pagar(double precio) {
        System.out.println("INFORMACION DE PAGO");
        System.out.println("-- Tipo de Pago: Tigo Money");
        System.out.println("-- Descuento   : 2%");
        double d =  Math.round(precio * 0.98 * 100.0)/100.0;
        System.out.println("-- Total Pagado: " + d + " Bs.");
    }
}
