package ejerciciosP3.ejercicio3;

import java.util.StringTokenizer;

public abstract class Almacenamiento {
    private String stge_id;
    private String extension;
    private String txt_body;
    private int words_number;
    private String type;

    public Almacenamiento(String stge_id, String extension, String txt_body, String type) {
        this.stge_id = stge_id;
        this.extension = extension;
        this.txt_body = txt_body;
        this.type = type;
        this.words_number = 0;
        defineA();
    }

    public Almacenamiento(String stge_id, String extension, int words_number, String type) {
        this.stge_id = stge_id;
        this.extension = extension;
        this.words_number = words_number;
        this.type = type;
        this.txt_body = " ";
        defineB();
    }

    public Almacenamiento(String stge_id, String type){
        this.stge_id = stge_id;
        this.type = type;
    }

    public String getStorageID() {
        return stge_id;
    }

    public void setStorageID(String stge_id) {
        this.stge_id = stge_id;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public String getTextBody() {
        return txt_body;
    }

    public void setTextBody(String txt_body) {
        this.txt_body = txt_body;
    }

    public int getWordsNumber() {
        return words_number;
    }

    public void setWordsNumber(int words_number) {
        this.words_number = words_number;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public abstract void countWords();
    public abstract void add(Almacenamiento storage);
    public abstract void remove(Almacenamiento storage);
    public abstract void getChild(int position);

    public void defineA(){
        StringTokenizer st = new StringTokenizer(txt_body);
        if(this.getType().toLowerCase().equals("archivo")){
            setWordsNumber(st.countTokens());
        } else {
            setWordsNumber(0);
        }
    }

    public void defineB(){
        if(!this.getType().toLowerCase().equals("archivo")){
            setWordsNumber(0);
        }
    }
}
