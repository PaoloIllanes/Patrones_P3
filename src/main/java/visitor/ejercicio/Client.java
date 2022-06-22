package visitor.ejercicio;

public class Client {

    public static void main(String []sss){

        Bolivia bolivia =  new Bolivia();
        Argentina argentina = new Argentina();
        Italia italia = new Italia();
        Brasil brasil = new Brasil();

      Librecambista libreCambista= new Librecambista();

      bolivia.accept(libreCambista,1000);
      italia.accept(libreCambista,10);
      brasil.accept(libreCambista,200);
      argentina.accept(libreCambista,2000);


    }

}
