package ejerciciosP3.ejercicio5;

public class AplicacionMovilAdaptada implements IAplicacionEmpresa2 {
    private IAplicacionEmpresa1 app;

    public AplicacionMovilAdaptada(IAplicacionEmpresa1 app) {
        this.app = app;
    }

    @Override
    public void iniciarSesion() {
        if (app instanceof AplicacionAndroid) {
            System.out.print("Adaptando el método LOG IN de una Aplicación Android,");
        } else if (app instanceof AplicacionIOS) {
            System.out.print("Adaptando el método LOG IN de una Aplicación IOS,");
        } else if (app instanceof AplicacionWindowsPhone) {
            System.out.print("Adaptando el método LOG IN de una Aplicación Windows Phone,");
        }
        System.out.println(" a INICIO DE SESIÓN de una aplicación de Escritorio o Web.");
        System.out.println("es decir, el LOG IN es igual al INICIO DE SESION:\n");
        this.app.login();
    }

    @Override
    public void cerrarSesion() {
        if (app instanceof AplicacionAndroid) {
            System.out.print("Adaptando el método LOG OUT de una Aplicación Android,");
        } else if (app instanceof AplicacionIOS) {
            System.out.print("Adaptando el método LOG OUT de una Aplicación IOS,");
        } else if (app instanceof AplicacionWindowsPhone) {
            System.out.print("Adaptando el método LOG OUT de una Aplicación Windows Phone,");
        }
        System.out.println(" a CERRAR SESIÓN de una aplicación de Escritorio o Web.");
        System.out.println("es decir, el LOG OUT es igual al CERRAR SESION:\n");
        this.app.logout();
    }

    @Override
    public void generarDatos() {
        if (app instanceof AplicacionAndroid) {
            System.out.print("Adaptando el método REPORTES de una Aplicación Android,");
        } else if (app instanceof AplicacionIOS) {
            System.out.print("Adaptando el método REPORTES de una Aplicación IOS,");
        } else if (app instanceof AplicacionWindowsPhone) {
            System.out.print("Adaptando el método REPORTES de una Aplicación Windows Phone,");
        }
        System.out.println(" a GENERADOR DE DATOS de una aplicación de Escritorio o Web.");
        System.out.println("es decir, el REPORTES es igual al GENERADOR DE DATOS:\n");
        this.app.reportes();
    }
}
