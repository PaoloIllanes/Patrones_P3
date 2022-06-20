package adapter.ejercicio;

public class Televisor implements IElectrodomesticos{
    private int costo = 5000;
    private int tiempoDeGarantia= 5;


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
        System.out.println("El costo del Televisor es de : " + getCosto() + " Bs");
    }

    @Override
    public void tiempoDeGarantia() {

        System.out.println("La garantia del Televisor es de : "+ getTiempoDeGarantia() +" Año/s");

    }
}
