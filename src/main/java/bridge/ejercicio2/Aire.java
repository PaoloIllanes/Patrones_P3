package bridge.ejercicio2;

public class Aire implements IMedioDeEnvio{
    private String name="Tierra";
    private int tarifa=5;
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
