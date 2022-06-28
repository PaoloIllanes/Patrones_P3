package ejerciciosP3.ejercicio5;

public class AplicacionIOS implements IAplicacionEmpresa1 {
    private String ios_name;
    private String ios_version;
    private String ios_release_date;
    private String ios_size;
    private double price;
    private Usuario user;

    public AplicacionIOS(String ios_name, String ios_version, String ios_release_date, String ios_size, double price, Usuario user) {
        this.ios_name = ios_name;
        this.ios_version = ios_version;
        this.ios_release_date = ios_release_date;
        this.ios_size = ios_size;
        this.price = price;
        this.user = user;
    }

    @Override
    public void login() {
        System.out.println("----------APLICACION IOS-----------");
        System.out.println("-----LOG IN (INICIANDO SESIÓN)-----\n");
        System.out.println("-- Usuario   : " + user.getUser_name());
        System.out.println("-- Contraseña: " + user.getPassword());
        System.out.println("...");
        System.out.println("...");
        System.out.println("...");
        System.out.println("USUARIO REGISTRADO CORRECTAMENTE");
        System.out.println("\n---------------------------------\n");
    }

    @Override
    public void logout() {
        System.out.println("----------APLICACION IOS-----------");
        System.out.println("-----LOG OUT (CERRANDO SESIÓN)-----\n");
        System.out.println("...");
        System.out.println("...");
        System.out.println("...");
        System.out.println("CIERRE DE SESION REALIZADO CORRECTAMENTE");
        System.out.println("\n---------------------------------\n");
    }

    @Override
    public void reportes() {
        System.out.println("-----REPORTE DE LA APLICACION ANDROID-----\n");
        System.out.println("-- Aplicación   : " + ios_name);
        System.out.println("-- Versión      : " + ios_version);
        System.out.println("-- Fecha última");
        System.out.println("   actualización: " + ios_release_date);
        System.out.println("-- Tamaño       : " + ios_size);
        System.out.println("-- Precio       : " + price + " $us");
        System.out.println("\n-----------------------------------------\n");
    }

    public String getIos_name() {
        return ios_name;
    }

    public void setIos_name(String ios_name) {
        this.ios_name = ios_name;
    }

    public String getIos_version() {
        return ios_version;
    }

    public void setIos_version(String ios_version) {
        this.ios_version = ios_version;
    }

    public String getIos_release_date() {
        return ios_release_date;
    }

    public void setIos_release_date(String ios_release_date) {
        this.ios_release_date = ios_release_date;
    }

    public String getIos_size() {
        return ios_size;
    }

    public void setIos_size(String ios_size) {
        this.ios_size = ios_size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Usuario getUser() {
        return user;
    }

    public void setUser(Usuario user) {
        this.user = user;
    }
}
