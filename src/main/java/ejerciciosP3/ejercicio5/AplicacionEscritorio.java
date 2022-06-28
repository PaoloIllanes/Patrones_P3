package ejerciciosP3.ejercicio5;

public class AplicacionEscritorio implements IAplicacionEmpresa2 {
    private String exe_name;
    private String exe_version;
    private String exe_release_date;
    private String exe_size;
    private String format;
    private Usuario user;

    public AplicacionEscritorio(String exe_name, String exe_version, String exe_release_date, String exe_size, String format, Usuario user) {
        this.exe_name = exe_name;
        this.exe_version = exe_version;
        this.exe_release_date = exe_release_date;
        this.exe_size = exe_size;
        this.format = format;
        this.user = user;
    }

    @Override
    public void iniciarSesion() {
        System.out.println("--------APLICACION ESCRITORIO--------");
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
        System.out.println("--------APLICACION ESCRITORIO--------");
        System.out.println("-----------CERRANDO SESIÓN-----------\n");
        System.out.println("...");
        System.out.println("...");
        System.out.println("...");
        System.out.println("SESION CERRADA CORRECTAMENTE");
        System.out.println("\n---------------------------------\n");
    }

    @Override
    public void generarDatos() {
        System.out.println("--GENERACION DE DATOS APLICACION ESCRITORIO--\n");
        System.out.println("-- Aplicación   : " + exe_name);
        System.out.println("-- Versión      : " + exe_version);
        System.out.println("-- Fecha última");
        System.out.println("   actualización: " + exe_release_date);
        System.out.println("-- Tamaño       : " + exe_size);
        System.out.println("-- Formato      : " + format);
        System.out.println("\n----------------------------------------\n");
    }

    public String getExe_name() {
        return exe_name;
    }

    public void setExe_name(String exe_name) {
        this.exe_name = exe_name;
    }

    public String getExe_version() {
        return exe_version;
    }

    public void setExe_version(String exe_version) {
        this.exe_version = exe_version;
    }

    public String getExe_release_date() {
        return exe_release_date;
    }

    public void setExe_release_date(String exe_release_date) {
        this.exe_release_date = exe_release_date;
    }

    public String getExe_size() {
        return exe_size;
    }

    public void setExe_size(String exe_size) {
        this.exe_size = exe_size;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public Usuario getUser() {
        return user;
    }

    public void setUser(Usuario user) {
        this.user = user;
    }
}
