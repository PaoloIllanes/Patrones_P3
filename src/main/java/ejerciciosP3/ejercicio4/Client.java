package ejerciciosP3.ejercicio4;

public class Client {
    public static void main (String[]args){
        ProxyDeAlmacenamiento proxy = new ProxyDeAlmacenamiento();

        proxy.guardar(new UsuarioRegistrado("Paolo123", "4082415", true));
        proxy.guardar(new UsuarioRegistrado("StvABC", "Steven123", false));
        proxy.guardar(new UsuarioRegistrado("StvnABC", "Steven123", true));
        proxy.guardar(new UsuarioRegistrado("TTGoodGuy", "QWERTY", true));
        proxy.guardar(new UsuarioRegistrado("TFGemini", "10062000", true));
        proxy.guardar(new UsuarioRegistrado("Happy", "IMHAPPY", false));
        proxy.guardar(new UsuarioRegistrado("Happy", "IAMHAPPY", true));
        proxy.guardar(new UsuarioRegistrado("TheLord82313", "TheLord82313", true));
        proxy.guardar(new UsuarioRegistrado("Dorea123", "9876543210", true));
        proxy.guardar(new UsuarioRegistrado("AleS_900", "Alejandro123", true));


    }
}
