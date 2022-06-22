package bridge.ejercicio2;

public interface IMedioDeEnvio {
    int cobrarTarifaDeEnvio(Paquete paquete);
    String getName();
}
