package ejerciciosP3.ejercicio3;

import java.util.ArrayList;
import java.util.List;

public class CompositeAlmacenamiento extends Almacenamiento{
    private List<Almacenamiento> storage_list = new ArrayList<>();

    public CompositeAlmacenamiento(String stge_id, String extension, String txt_body, String type) {
        super(stge_id, extension, txt_body, type);
    }

    public CompositeAlmacenamiento(String stge_id, String extension, int words_number, String type) {
        super(stge_id, extension, words_number, type);
    }

    public CompositeAlmacenamiento(String stge_id, String type) {
        super(stge_id, type);
    }

    @Override
    public void countWords() {
        Global.total_words = Global.total_words + this.getWordsNumber();
        for (Almacenamiento artifact: storage_list) {
            artifact.countWords();
            System.out.println("---- ALMACENAMIENTO EN " + artifact.getType().toUpperCase() + " ----");
            showAmount(artifact);
        }

    }

    public void showAmount(Almacenamiento storage){
        System.out.println("------------------------------");
        System.out.println("| NOMBRE DEL " + storage.getType().toUpperCase() + ": " + storage.getStorageID());
        System.out.println("| NUMERO DE PALABRAS : " + Global.total_words);
        System.out.println("| EXTENSION : " + storage.getExtension());
        System.out.println("------------------------------\n");
    }

    public void showWordTotalNumber(){
        System.out.println("---- DISCO DE ALMACENAMIENTO (TOTAL) ----");
        System.out.println("| TOTAL: " + Global.total_words +" |");
        System.out.println("----------------------------------------\n");
    }

    @Override
    public void add(Almacenamiento storage) {
        storage_list.add(storage);
    }

    @Override
    public void remove(Almacenamiento storage) {
        storage_list.remove(storage);
    }

    @Override
    public void getChild(int position) {

    }
}
