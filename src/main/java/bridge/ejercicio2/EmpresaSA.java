package bridge.ejercicio2;

public class EmpresaSA implements IEmpresa{
    @Override
    public void enviarPaquete(IMedioDeEnvio medioDeEnvio, Paquete paquete) {
        System.out.println("Enviando paquete empresa SA...");
        System.out.println("Nombre: "+paquete.getName());
        System.out.println("Precio: "+paquete.getPrecio());
        System.out.println("Medio de envio : "+medioDeEnvio.getName());
        int costo =medioDeEnvio.cobrarTarifaDeEnvio(paquete);
        System.out.println("Costo de envio: "+costo);
        System.out.println("******************************");

    }
}
