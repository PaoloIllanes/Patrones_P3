package visitor.ejercicio;

public class Argentina extends IPais {

    private String nombreMoneda;
    private Double valorEnDolar;
    private String nombre;

    public Argentina(){
        this.nombreMoneda= "Pesos Argentinos";
        this.valorEnDolar= 95.37;
        this.nombre= "Argentina";
    }

    @Override
    public String getNombreMoneda() {
        return nombreMoneda;
    }



    @Override
    public Double getValorEnDolar() {
        return valorEnDolar;
    }



    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void accept(ILibrecambista libreCambista,int cantidad) {
        libreCambista.cambiarADolares(this,cantidad);
        System.out.println("");
        libreCambista.cambiarDeDolares(this,cantidad);
        System.out.println("");

    }

}
