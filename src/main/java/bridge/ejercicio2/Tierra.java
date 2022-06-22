package bridge.ejercicio2;

public class Tierra implements IMedioDeEnvio{
    private String name="Tierra";
    private int tarifa=0;
    public Tierra(){

    }
    @Override
    public int cobrarTarifaDeEnvio(Paquete paquete) {
        tarifa= (paquete.getPrecio()/100)*tarifa;
        return tarifa;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
