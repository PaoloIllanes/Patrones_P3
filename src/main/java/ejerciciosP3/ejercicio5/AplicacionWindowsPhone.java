package ejerciciosP3.ejercicio5;

public class AplicacionWindowsPhone implements IAplicacionEmpresa1 {
    private String wp_name;
    private String wp_version;
    private String wp_release_date;
    private String wp_size;
    private boolean diponibility;
    private Usuario user;

    public AplicacionWindowsPhone(String wp_name, String wp_version, String wp_release_date, String wp_size, boolean diponibility, Usuario user) {
        this.wp_name = wp_name;
        this.wp_version = wp_version;
        this.wp_release_date = wp_release_date;
        this.wp_size = wp_size;
        this.diponibility = diponibility;
        this.user = user;
    }

    @Override
    public void login() {
        System.out.println("------APLICACION WINDOWS PHONE------");
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
        System.out.println("------APLICACION WINDOWS PHONE------");
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
        System.out.println("-- Aplicación    : " + wp_name);
        System.out.println("-- Versión       : " + wp_version);
        System.out.println("-- Fecha última");
        System.out.println("   actualización : " + wp_release_date);
        System.out.println("-- Tamaño        : " + wp_size);
        System.out.println("-- Disponibilidad: " + diponibility);
        System.out.println("\n----------------------------------------\n");
    }

    public String getWp_name() {
        return wp_name;
    }

    public void setWp_name(String wp_name) {
        this.wp_name = wp_name;
    }

    public String getWp_version() {
        return wp_version;
    }

    public void setWp_version(String wp_version) {
        this.wp_version = wp_version;
    }

    public String getWp_release_date() {
        return wp_release_date;
    }

    public void setWp_release_date(String wp_release_date) {
        this.wp_release_date = wp_release_date;
    }

    public String getWp_size() {
        return wp_size;
    }

    public void setWp_size(String wp_size) {
        this.wp_size = wp_size;
    }

    public boolean isDiponibility() {
        return diponibility;
    }

    public void setDiponibility(boolean diponibility) {
        this.diponibility = diponibility;
    }

    public Usuario getUser() {
        return user;
    }

    public void setUser(Usuario user) {
        this.user = user;
    }
}
