package ejerciciosP3.ejercicio4;

import java.util.HashMap;
import java.util.Map;

public class ProxyDeAlmacenamiento implements ICluster {
    private int number = 0;
    private Servidor1 server_1 = new Servidor1("192.168.60.16", "SERV-1", "40");
    private Servidor2 server_2 = new Servidor2("172.16.40.24", "SERV-2", "30");
    private Map<Integer, UsuarioRegistrado> user_map = new HashMap<>();

    public ProxyDeAlmacenamiento() {
    }

    public ProxyDeAlmacenamiento(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void linkUserNumber(UsuarioRegistrado user){
        user_map.put(number, user);
        number++;
    }

    @Override
    public void guardar(UsuarioRegistrado user) {
        int comp = number;
        if (user.isIs_correct()){
            linkUserNumber(user);
            if((comp)%2 == 0){
                System.out.println(" Guardando Usuario en el SERVIDOR 1");
                server_1.guardar(user);
            }else{
                System.out.println(" Guardando Usuario en el SERVIDOR 2");
                server_2.guardar(user);
            }
        } else {
            user.showUserInfo();
        }
    }
}
