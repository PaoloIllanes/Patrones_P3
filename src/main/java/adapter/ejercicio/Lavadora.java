package adapter.ejercicio;

public class Lavadora implements IElectrodomesticos{

    private int costo = 2000;
    private int tiempoDeGarantia= 1;


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
        System.out.println("El costo de la Lavadora es de : " + getCosto() + " Bs");
    }

    @Override
    public void tiempoDeGarantia() {

        System.out.println("La garantia de la Lavadora es de : "+ getTiempoDeGarantia() +" Año/s");

    }
}
