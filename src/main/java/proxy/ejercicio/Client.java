package proxy.ejercicio;

public class Client {
    public static void main(String[]args){

        Usuario Juan = new Usuario("Juan");
        Usuario Pedro = new Usuario("Pedro");
        Usuario Diego = new Usuario("Diego");

        CuentaBancaria cuentaJuan =  new CuentaBancaria(Juan,2000);
        CuentaBancaria cuentaPedro =  new CuentaBancaria(Pedro,5000);
        CuentaBancaria cuentaJDiego =  new CuentaBancaria(Diego,4000);

        IIntermediario tarjetaJuan = new TarjetaDebito(cuentaJuan,12345);
        IIntermediario tarjetaPedro = new TarjetaDebito(cuentaPedro,56789);
        IIntermediario tarjetaDiego = new TarjetaDebito(cuentaJDiego,45678);

        tarjetaDiego.pagar(100,"Dolares");
        tarjetaJuan.pagar(200,"Euros");
        tarjetaPedro.pagar(2000,"");
        tarjetaDiego.pagar(700,"Dolares");
    }
}
