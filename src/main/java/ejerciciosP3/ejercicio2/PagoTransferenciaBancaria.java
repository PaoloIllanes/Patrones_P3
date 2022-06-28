package ejerciciosP3.ejercicio2;

public class PagoTransferenciaBancaria implements ITipoPago {
    @Override
    public void pagar(double precio) {
        System.out.println("INFORMACION DE PAGO");
        System.out.println("-- Tipo de Pago: Transferencia Bancaria");
        System.out.println("-- Descuento   : 5%");
        double d =  Math.round(precio * 0.95 * 100.0)/100.0;
        System.out.println("-- Total Pagado: " + d + " Bs.");
    }
}
