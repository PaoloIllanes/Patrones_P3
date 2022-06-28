package ejerciciosP3.ejercicio2;

public class PagoAplicacion implements ITipoPago {
    @Override
    public void pagar(double precio) {
        System.out.println("INFORMACION DE PAGO");
        System.out.println("-- Tipo de Pago: Aplicación");
        System.out.println("-- Descuento   : 10%");
        double d =  Math.round(precio * 0.9 * 100.0)/100.0;
        System.out.println("-- Total Pagado: " + d + " Bs.");
    }
}
