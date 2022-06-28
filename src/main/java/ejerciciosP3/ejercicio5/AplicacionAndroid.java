package ejerciciosP3.ejercicio5;

public class AplicacionAndroid implements IAplicacionEmpresa1 {
    private String apk_name;
    private String apk_version;
    private String apk_release_date;
    private String apk_size;
    private String min_resources;
    private Usuario user;

    public AplicacionAndroid(String apk_name, String apk_version, String apk_release_date, String apk_size, String min_resources, Usuario user) {
        this.apk_name = apk_name;
        this.apk_version = apk_version;
        this.apk_release_date = apk_release_date;
        this.apk_size = apk_size;
        this.min_resources = min_resources;
        this.user = user;
    }

    @Override
    public void login() {
        System.out.println("--------APLICACION ANDROID---------");
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
        System.out.println("--------APLICACION ANDROID---------");
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
        System.out.println("-- Aplicación   : " + apk_name);
        System.out.println("-- Versión      : " + apk_version);
        System.out.println("-- Fecha última");
        System.out.println("   actualización: " + apk_release_date);
        System.out.println("-- Tamaño       : " + apk_size);
        System.out.println("-- Recursos Min.: " + min_resources);
        System.out.println("\n----------------------------------------\n");
    }

    public String getApkName() {
        return apk_name;
    }

    public void setApkName(String apk_name) {
        this.apk_name = apk_name;
    }

    public String getApkVersion() {
        return apk_version;
    }

    public void setApkVersion(String apk_version) {
        this.apk_version = apk_version;
    }

    public String getApkReleaseDate() {
        return apk_release_date;
    }

    public void setApkReleaseDate(String apk_release_date) {
        this.apk_release_date = apk_release_date;
    }

    public String getApkSize() {
        return apk_size;
    }

    public void setApkSize(String apk_size) {
        this.apk_size = apk_size;
    }

    public String getMinResources() {
        return min_resources;
    }

    public void setMinResources(String min_resources) {
        this.min_resources = min_resources;
    }

    public Usuario getUser() {
        return user;
    }

    public void setUser(Usuario user) {
        this.user = user;
    }
}
