package bridge.ejercicio;

public class Client {
    public static void main(String[] args){
        IPlataforma windows64 = new Windows(new x64(), "10");
        windows64.showPlatformInfo();

        IPlataforma windows86 = new Windows(new x86(), "7");
        windows86.showPlatformInfo();

        IPlataforma linux64 = new Linux(new x64());
        linux64.showPlatformInfo();

        IPlataforma linux86 = new Linux(new x86());
        linux86.showPlatformInfo();
    }
}
