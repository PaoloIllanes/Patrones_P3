package bridge.ejercicio2;

public class Paquete {
    private String name;
    private int precio;

    public Paquete(String name,int precio){
        this.name=name;
        this.precio=precio;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
