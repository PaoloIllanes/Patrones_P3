package adapter.ejercicio;

public class Celular implements IArtefactos{
    private int precio=1400;
    private int vidaUtil= 5;

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getVidaUtil() {
        return vidaUtil;
    }

    public void setVidaUtil(int vidaUtil) {
        this.vidaUtil = vidaUtil;
    }

    @Override
    public void precio() {
        System.out.println("El precio del Celular es de : "+ getPrecio()+" Bs");
    }

    @Override
    public void tiempDeVida() {

        System.out.println("La vida util del Celular es de : "+getVidaUtil()+ "Año/s");
    }
}
