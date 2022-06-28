package ejerciciosP3.ejercicio3;

public class Archivo extends Almacenamiento{


    public Archivo(String stge_id, String extension, String txt_body, String type) {
        super(stge_id, extension, txt_body, type);
    }

    public Archivo(String stge_id, String extension, int words_number, String type) {
        super(stge_id, extension, words_number, type);
    }



    @Override
    public void countWords() {
        this.getWordsNumber();
    }

    @Override
    public void add(Almacenamiento storge) {
        System.out.println("No applicable");
    }

    @Override
    public void remove(Almacenamiento storge) {
        System.out.println("No applicable");
    }

    @Override
    public void getChild(int position) {
        System.out.println("No applicable");
    }
}
