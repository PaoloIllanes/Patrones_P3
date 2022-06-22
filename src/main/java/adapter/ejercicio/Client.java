package adapter.ejercicio;

public class Client {

    public static void main(String[]args){

        Televisor tele= new Televisor();
        tele.setCosto(2000);
        tele.setTiempoDeGarantia(6);
        tele.costo();
        tele.tiempoDeGarantia();
        TelevisorAdaptado smarTV = new TelevisorAdaptado(tele);
        smarTV.precio();
        smarTV.tiempDeVida();



    }

}
