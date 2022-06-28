package ejerciciosP3.ejercicio2;

public class InstalacionDeAgua implements ITipoInstalacion {
    private ITipoPago payment_method;
    private String instl_id;
    private String instl_type;
    private double price;

    public InstalacionDeAgua(ITipoPago payment_method, String instl_id, String instl_type, double price) {
        this.payment_method = payment_method;
        this.instl_id = instl_id;
        this.instl_type = instl_type;
        this.price = price;
    }

    @Override
    public void showInfo() {
        System.out.println("------ INFORMACION DE LA INSTALACION ------\n");
        System.out.println("INSTALACION DE AGUA");
        System.out.println("-- ID: " + instl_id);
        System.out.println("-- Tipo de");
        System.out.println("   instalación: " + instl_type);
        System.out.println("-- Precio     : " + price + " Bs.\n");
        payment_method.pagar(price);
        System.out.println("\n------------------------------------------\n");
    }

    public ITipoPago getPayment_method() {
        return payment_method;
    }

    public void setPayment_method(ITipoPago payment_method) {
        this.payment_method = payment_method;
    }

    public String getInstl_id() {
        return instl_id;
    }

    public void setInstl_id(String instl_id) {
        this.instl_id = instl_id;
    }

    public String getInstl_type() {
        return instl_type;
    }

    public void setInstl_type(String instl_type) {
        this.instl_type = instl_type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
