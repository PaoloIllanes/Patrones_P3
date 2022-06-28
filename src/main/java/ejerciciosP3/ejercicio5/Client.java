package ejerciciosP3.ejercicio5;

public class Client {
    public static void main(String[] args) {
        IAplicacionEmpresa2 android = new AplicacionMovilAdaptada(new AplicacionAndroid("Whats App", "2.0.1", "2020-12-14", "40.5 MB.", "Android 4.0", new Usuario("Paolo123", "4082415")));
        IAplicacionEmpresa2 ios = new AplicacionMovilAdaptada(new AplicacionIOS("ITunes", "1.5.23", "2019-09-05", "15 MB.", 40.5, new Usuario("StvABC", "Steven123")));
        IAplicacionEmpresa2 windowsPhone = new AplicacionMovilAdaptada(new AplicacionWindowsPhone("Chrome", "3.5.4", "2021-04-04", "78.15 MB", true, new Usuario("TTGoodGuy", "QWERTY")));
        IAplicacionEmpresa2 web = new AplicacionWeb("Facebook", "4.0.1", "2021-06-16", "58.54 MB.", "Javascript", new Usuario("Happy", "IAMHAPPY"));
        IAplicacionEmpresa2 desktop = new AplicacionEscritorio("Photo Shop", "1.0.1", "2025-03-10", "504.00 MB.", ".exe", new Usuario("paolo", "12345"));

        //INICIO DE SESION
        android.iniciarSesion();
        ios.iniciarSesion();
        windowsPhone.iniciarSesion();
        web.iniciarSesion();
        desktop.iniciarSesion();

        //CIERRE DE SESION
        android.cerrarSesion();
        ios.cerrarSesion();
        windowsPhone.cerrarSesion();
        web.cerrarSesion();
        desktop.cerrarSesion();

        //GENERACION DE DATOS
        android.generarDatos();
        ios.generarDatos();
        windowsPhone.generarDatos();
        web.generarDatos();
        desktop.generarDatos();
    }
}
