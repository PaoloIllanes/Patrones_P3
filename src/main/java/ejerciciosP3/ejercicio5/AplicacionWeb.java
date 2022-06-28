package ejerciciosP3.ejercicio5;

public class AplicacionWeb implements IAplicacionEmpresa2 {
    private String web_name;
    private String web_version;
    private String web_release_date;
    private String web_size;
    private String language;
    private Usuario user;

    public AplicacionWeb(String web_name, String web_version, String web_release_date, String web_size, String language, Usuario user) {
        this.web_name = web_name;
        this.web_version = web_version;
        this.web_release_date = web_release_date;
        this.web_size = web_size;
        this.language = language;
        this.user = user;
    }

    @Override
    public void iniciarSesion() {
        System.out.println("-----------APLICACION WEB-----------");
        System.out.println("----------INICIANDO SESIÓN----------\n");
        System.out.println("-- Usuario   : " + user.getUser_name());
        System.out.println("-- Contraseña: " + user.getPassword());
        System.out.println("...");
        System.out.println("...");
        System.out.println("...");
        System.out.println("SESION INICIADA CORRECTAMENTE");
        System.out.println("\n---------------------------------\n");
    }

    @Override
    public void cerrarSesion() {
        System.out.println("-----------APLICACION WEB-----------");
        System.out.println("-----------CERRANDO SESIÓN-----------\n");
        System.out.println("...");
        System.out.println("...");
        System.out.println("...");
        System.out.println("SESION CERRADA CORRECTAMENTE");
        System.out.println("\n---------------------------------\n");
    }

    @Override
    public void generarDatos() {
        System.out.println("--GENERACION DE DATOS APLICACION WEB--\n");
        System.out.println("-- Aplicación   : " + web_name);
        System.out.println("-- Versión      : " + web_version);
        System.out.println("-- Fecha última");
        System.out.println("   actualización: " + web_release_date);
        System.out.println("-- Tamaño       : " + web_size);
        System.out.println("-- Lenguaje     : " + language);
        System.out.println("\n----------------------------------------\n");
    }

    public String getWeb_name() {
        return web_name;
    }

    public void setWeb_name(String web_name) {
        this.web_name = web_name;
    }

    public String getWeb_version() {
        return web_version;
    }

    public void setWeb_version(String web_version) {
        this.web_version = web_version;
    }

    public String getWeb_release_date() {
        return web_release_date;
    }

    public void setWeb_release_date(String web_release_date) {
        this.web_release_date = web_release_date;
    }

    public String getWeb_size() {
        return web_size;
    }

    public void setWeb_size(String web_size) {
        this.web_size = web_size;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public Usuario getUser() {
        return user;
    }

    public void setUser(Usuario user) {
        this.user = user;
    }
}
