package visitor.ejercicio;

public class Bolivia extends IPais {
    private String nombreMoneda;
    private Double valorEnDolar;
    private String nombre;

    public Bolivia(){
        this.nombreMoneda= "Bolivianos";
        this.valorEnDolar= 6.90;
        this.nombre= "Bolivia";
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
