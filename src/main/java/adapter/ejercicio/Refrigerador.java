package adapter.ejercicio;

public class Refrigerador implements IElectrodomesticos{
    private int costo = 7000;
    private int tiempoDeGarantia= 3;


    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public int getTiempoDeGarantia() {
        return tiempoDeGarantia;
    }

    public void setTiempoDeGarantia(int tiempoDeGarantia) {
        this.tiempoDeGarantia = tiempoDeGarantia;
    }

    @Override
    public void costo() {
        System.out.println("El costo del Refrigerador es de : " + getCosto() + " Bs");
    }

    @Override
    public void tiempoDeGarantia() {

        System.out.println("La garantia del Refrigerador es de : "+ getTiempoDeGarantia() +" Año/s");

    }
}
