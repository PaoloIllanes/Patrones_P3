package adapter.ejercicio;

public class TelevisorAdaptado implements IArtefactos{

    private Televisor televisor;
    public TelevisorAdaptado(Televisor televisor){
        System.out.println("Adaptando Televisor a la familia de Artefactos Electronicos");
        this.televisor= televisor;
    }


    @Override
    public void precio() {
        this.televisor.costo();
    }

    @Override
    public void tiempDeVida() {
        this.televisor.setTiempoDeGarantia(televisor.getTiempoDeGarantia()+1);
        this.televisor.tiempoDeGarantia();

    }
}
