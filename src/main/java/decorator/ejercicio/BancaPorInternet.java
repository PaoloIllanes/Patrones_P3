package decorator.ejercicio;

public class BancaPorInternet extends Funcionalidad{
    private boolean enable;

    public BancaPorInternet(ICuentaDeBanco account, boolean enable) {
        super(account);
        this.enable = enable;
    }

    @Override
    public void operation() {
        super.operation();
        System.out.println("\n\tBANCA POR INTERNET --> Agregando Funcionalidad ....");
        if(enable){
            System.out.println("\tEl servicio fue agregado y esta ACTIVO.");
        }else{
            System.out.println("\tEl servicio fue agregado y NO esta ACTIVO.");
        }
    }
}
