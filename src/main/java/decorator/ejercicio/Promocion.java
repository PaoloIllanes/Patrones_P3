package decorator.ejercicio;

public class Promocion extends Funcionalidad{

    public Promocion(ICuentaDeBanco account) {
        super(account);
    }

    @Override
    public void operation() {
        super.operation();
        System.out.println("\n\tPROMOCION --> Agregando Funcionalidad ....");
        System.out.println("\tEl servicio fue agregado.");
        double amount = super.getAccount().getAmount();
        int numeroAleatorio = (int) (Math.random()*25+1);
        if(numeroAleatorio % 2 ==0){
            System.out.println("\tFELICIADADEES");
            System.out.println("\tMonto Actual: " + amount*2);
            super.getAccount().setAmount(amount*2);
        }else{
            System.out.println("\tVuelve a intentarlo");
            System.out.println("\tMonto Actual: " + amount);
        }

    }
}
