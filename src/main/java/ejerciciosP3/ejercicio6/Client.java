package ejerciciosP3.ejercicio6;

public class Client {
    public static void main(String []args){
        Celular cell_phone = new Celular("Samsung", "NU-SG1642", "256 GB.","8 GB.", "Optimo");
        Computadora pc =  new Computadora("Dell", "G3 15", "2 TB.", "16 GB.", "Windows");
        Televisor tv = new Televisor("Samsung","A7", "65 pulgadas");

        Aplicacion app = new Aplicacion();
        cell_phone.accept(app);
        pc.accept(app);
        tv.accept(app);
    }
}
