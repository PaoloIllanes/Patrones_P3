package bridge.ejercicio2;

public class Client {
    public static void main(String[]args){
        IMedioDeEnvio aire =new Aire();
        IMedioDeEnvio tierra= new Tierra();
        IEmpresa empresaSRL = new EmpresaSRL();
        IEmpresa empresaSA = new EmpresaSA();

        Paquete paquete1 = new Paquete("Raqueta",500);
        Paquete paquete2 = new Paquete("Camara",2000);
        Paquete paquete3 = new Paquete("Tarjeta grafica",5000);

        empresaSA.enviarPaquete(tierra,paquete1);
        empresaSRL.enviarPaquete(aire,paquete2);
        //Nuevo metodo de envio mar

        IMedioDeEnvio mar = new Mar();

        empresaSA.enviarPaquete(mar,paquete3);

    }
}
