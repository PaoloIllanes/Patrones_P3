package visitor.ejercicio;

public abstract class IPais {
    private String nombreMoneda;
    private Double valorEnDolar;
    private String nombre;

    public String getNombreMoneda() {
        return nombreMoneda;
    }



    public Double getValorEnDolar() {
        return valorEnDolar;
    }



    public String getNombre() {
        return nombre;
    }



    void accept(ILibrecambista libreCambista, int cantidad){};

}
