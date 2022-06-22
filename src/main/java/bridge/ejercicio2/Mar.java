package bridge.ejercicio2;

public class Mar implements IMedioDeEnvio{
    private String name="Mar";
    private int tarifa=50;
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