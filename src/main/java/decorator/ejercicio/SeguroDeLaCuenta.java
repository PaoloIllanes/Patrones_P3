package decorator.ejercicio;

public class SeguroDeLaCuenta extends Funcionalidad{
    private double insurance_price;

    public SeguroDeLaCuenta(ICuentaDeBanco account, double insurance_price) {
        super(account);
        this.insurance_price = insurance_price;
    }

    @Override
    public void operation() {
        super.operation();
        System.out.println("\n\tSEGURO DE LA CUENTA --> Agregando Funcionalidad ....");
        System.out.println("\tEl servicio fue agregado.");
        System.out.println("\tSe descontará de manera mensual: " + insurance_price);
        getAccount().setAmount(super.getAccount().getAmount() - insurance_price);
        System.out.println("\tMonto Actual: " + super.getAccount().getAmount());
        }
}

