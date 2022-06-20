package visitor.ejercicio;

public class Librecambista implements ILibrecambista{

    @Override
    public Double cambiarADolares(IPais pais, int cantidad) {

        Double cambio = cantidad/pais.getValorEnDolar();
        System.out.println("Se cambiaron " +cantidad+ " "+pais.getNombreMoneda()+" "+"a un valor de  ");
        System.out.printf("Valor: %.2f"+ " Dolares", cambio );


    return cambio;
    }

    @Override
    public Double cambiarDeDolares(IPais pais, int cantidad) {
        Double cambio = cantidad*pais.getValorEnDolar();
        System.out.println("Se cambiaron " +cantidad+ " Dolares"+ " a un valor de  ");
        System.out.printf("Valor: %.2f"+ " "+ pais.getNombreMoneda(), cambio );
        return cambio;
    }
}
