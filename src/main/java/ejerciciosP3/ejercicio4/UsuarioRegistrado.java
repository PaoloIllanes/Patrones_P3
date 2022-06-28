package ejerciciosP3.ejercicio4;

public class UsuarioRegistrado {
    private String user_name;
    private String password;
    private boolean is_correct;

    public UsuarioRegistrado() {
    }

    public UsuarioRegistrado(String user_name, String password, boolean is_correct) {
        this.user_name = user_name;
        this.password = password;
        this.is_correct = is_correct;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isIs_correct() {
        return is_correct;
    }

    public void setIs_correct(boolean is_correct) {
        this.is_correct = is_correct;
    }

    public void showUserInfo(){
        System.out.println("------ INFO USUARIO ------");
        if (is_correct){
            System.out.println("-- Contraseña CORRECTA");
            System.out.println("-- Usuario   : " + user_name);
            System.out.println("-- Contraseña: ************** " + "(" + password + ")\n\n");
        }else{
            System.out.println("-- Contraseña o Usuario INCORRECTA");
            System.out.println("   Intente de nuevo. :(\n\n");
        }

    }
}
