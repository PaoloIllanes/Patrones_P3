package visitor.ejercicio;

public class Italia extends IPais {

    private String nombreMoneda;
    private Double valorEnDolar;
    private String nombre;

    public Italia(){
        this.nombreMoneda= "Euros";
        this.valorEnDolar= 0.84;
        this.nombre= "Italia";
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
