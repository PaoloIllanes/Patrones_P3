package bridge.ejercicio;

public class Windows implements IPlataforma {
    private IArquitectura arch;
    private String version;

    public Windows(IArquitectura arch, String version) {
        this.arch = arch;
        this.version = version;
    }

    @Override
    public void showPlatformInfo() {
        System.out.println("Windows " + version);
        arch.showArchInfo();
    }

}
