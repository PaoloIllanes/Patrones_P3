package ejerciciosP3.ejercicio4;

import java.util.ArrayList;
import java.util.List;

public class Servidor2 implements ICluster{
    private String ip;
    private String host_name;
    private String port;
    private List<UsuarioRegistrado> user_list_1;

    public Servidor2() {
    }

    public Servidor2(String ip, String host_name, String port) {
        this.ip = ip;
        this.host_name = host_name;
        this.port = port;
        user_list_1 = new ArrayList<>();
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getHost_name() {
        return host_name;
    }

    public void setHost_name(String host_name) {
        this.host_name = host_name;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    @Override
    public void guardar(UsuarioRegistrado user) {
        System.out.println("Usuario guardado");
        user_list_1.add(user);
        user.showUserInfo();
    }
}
