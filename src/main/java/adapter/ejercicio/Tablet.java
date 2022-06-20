package adapter.ejercicio;

public class Tablet implements IArtefactos{
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
        System.out.println("El precio de la Tablet es de : "+ getPrecio()+" Bs");
    }

    @Override
    public void tiempDeVida() {

        System.out.println("La vida util de la Tablet es de : "+getVidaUtil()+ "Año/s");
    }
}
