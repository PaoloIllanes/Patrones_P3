package ejerciciosP3.ejercicio6;

public class Televisor implements IArtefactoElectronico{
    private String trademark;
    private String model;
    private String size;

    public Televisor(String trademark, String model, String size) {
        this.trademark = trademark;
        this.model = model;
        this.size = size;
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

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
