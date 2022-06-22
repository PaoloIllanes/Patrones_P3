package bridge.ejercicioNoBridge;

public class Client {
    public static void main(String[]args){

        Windows windows = new Windows();
        windows.arqx64();
        windows.arqx86();
        Linux linux= new Linux();
        linux.arqx64();
        linux.arqx86();


    }
}
