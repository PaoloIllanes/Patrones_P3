package adapter.ejercicio;

public class Client {

    public static void main(String[]args){

        Televisor tele= new Televisor();
        tele.setCosto(2000);
        tele.setTiempoDeGarantia(6);



        Celular cel= new Celular();
      cel.setPrecio(1000);
      cel.setVidaUtil(3);


        Tablet tab= new Tablet();
       tab.setPrecio(300);
       tab.setVidaUtil(1);

        Computadora pc= new Computadora();

       pc.setPrecio(30000);
       pc.setVidaUtil(7);


       pc.precio();
       pc.tiempDeVida();

        TelevisorAdaptado smarTV = new TelevisorAdaptado(tele);
        smarTV.precio();
        smarTV.tiempDeVida();



    }

}
