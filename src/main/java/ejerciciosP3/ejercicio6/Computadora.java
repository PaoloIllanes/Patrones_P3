package ejerciciosP3.ejercicio6;

public class Computadora implements IArtefactoElectronico {
    private String trademark;
    private String model;
    private String storage;
    private String ram;
    private String so;

    public Computadora(String trademark, String model, String storage, String ram, String so) {
        this.trademark = trademark;
        this.model = model;
        this.storage = storage;
        this.ram = ram;
        this.so = so;
    }

    @Override
    public void accept(IAplicacion visitante) {
        visitante.obtenerEstado(this);
    }

    public String getTrademark() {
        return trademark;
    }

    public void setTrademark(String trademark) {
        this.trademark = trademark;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getStorage() {
        return storage;
    }

    public void setStorage(String storage) {
        this.storage = storage;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getSo() {
        return so;
    }

    public void setSo(String so) {
        this.so = so;
    }
}