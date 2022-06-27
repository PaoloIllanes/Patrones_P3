package decorator.ejercicio;

public class CuentaDeBancoBasica implements ICuentaDeBanco{
    public String owner_name;
    public String account_id;
    public double amount_of_money;

    public CuentaDeBancoBasica() {
    }

    public String getOwner_name() {
        return owner_name;
    }

    public void setOwner_name(String owner_name) {
        this.owner_name = owner_name;
    }

    public String getAccount_id() {
        return account_id;
    }

    public void setAccount_id(String account_id) {
        this.account_id = account_id;
    }

    @Override
    public void operation() {
        System.out.println("-- CUENTA      : " + account_id);
        System.out.println("-- PROPIETARIO : " + owner_name);
        System.out.println("-- MONTO ACTUAL: " + amount_of_money);
    }

    @Override
    public double getAmount() {
        return amount_of_money;
    }

    @Override
    public void setAmount(double amount_of_money) {
        this.amount_of_money =  amount_of_money;
    }
}
