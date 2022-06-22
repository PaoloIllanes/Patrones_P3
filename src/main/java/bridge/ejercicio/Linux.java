package bridge.ejercicio;

public class Linux implements IPlataforma {
    private IArquitectura arch;

    public Linux(IArquitectura arch) {
        this.arch = arch;
    }

    @Override
    public void showPlatformInfo() {
        System.out.println("Linux");
        arch.showArchInfo();
    }
}
