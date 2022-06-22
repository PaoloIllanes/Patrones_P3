package proxy.ejercicio;


public class CuentaBancaria implements IIntermediario{
    private Usuario user;
    private int saldo;

    public CuentaBancaria(Usuario user, int saldo){
        this.user= user;
        this.saldo= saldo;
    }

    public Usuario getUser() {
        return user;
    }

    public void setUser(Usuario user) {
        this.user = user;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    @Override
    public void pagar(int monto, String moneda) {
        System.out.println("Saldo: "+saldo);
        System.out.println("Cobrando monto de: "+monto+ " Bs al usuario "+user.getName());
        saldo-=monto;
        System.out.println("Saldo actual: "+saldo);


    }
}
