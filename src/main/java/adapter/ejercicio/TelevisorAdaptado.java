package adapter.ejercicio;

public class TelevisorAdaptado implements IArtefactos{

    private Televisor televisor;
    public TelevisorAdaptado(Televisor televisor){
        System.out.println("Adaptando Televisor a la familia de Artefactos Electronicos");
        this.televisor= televisor;
    }


    @Override
    public void precio() {
        System.out.println("Adaptando Televisor a la familia de Artefactos Electronicos");
        this.televisor.costo();
    }

    @Override
    public void tiempDeVida() {
        System.out.println("Adaptando Televisor a la familia de Artefactos Electronicos");
        this.televisor.tiempoDeGarantia();

    }
}
