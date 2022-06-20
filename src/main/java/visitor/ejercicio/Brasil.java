package visitor.ejercicio;

public class Brasil extends IPais {

    private String nombreMoneda;
    private Double valorEnDolar;
    private String nombre;

    public Brasil(){
        this.nombreMoneda= "Reales";
        this.valorEnDolar= 5.01;
        this.nombre= "Brasil";
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
