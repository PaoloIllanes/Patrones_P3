package bridge.ejercicio2;

public class EmpresaSRL implements IEmpresa{

    @Override
    public void enviarPaquete(IMedioDeEnvio medioDeEnvio, Paquete paquete) {
        System.out.println("Enviando paquete empresa SRL...");
        System.out.println("Nombre: "+paquete.getName());
        System.out.println("Precio: "+paquete.getPrecio());
        System.out.println("Medio de envio : "+medioDeEnvio.getName());
        int costo =medioDeEnvio.cobrarTarifaDeEnvio(paquete);
        System.out.println("Costo de envio: "+costo);
        System.out.println("******************************");

    }
}
