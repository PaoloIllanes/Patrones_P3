package decorator.ejercicio;

public class Client {
    public static void main(String [] args){
        ICuentaDeBanco account = new CuentaDeBancoBasica();
        ((CuentaDeBancoBasica)account).setAccount_id("222662672");
        ((CuentaDeBancoBasica)account).setAmount(200000);
        ((CuentaDeBancoBasica)account).setOwner_name("Pedro");

        account = new BancaPorInternet(account,true);
        account = new SeguroDeLaCuenta(account, 15.45);
        account = new Promocion(account);
        account = new Promocion(account);
        account = new Promocion(account);
        account = new Promocion(account);
        account = new Promocion(account);
        account = new Promocion(account);
        account = new Promocion(account);
        account.operation();
    }
}
