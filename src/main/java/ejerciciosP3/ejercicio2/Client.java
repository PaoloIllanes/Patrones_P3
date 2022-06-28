package ejerciciosP3.ejercicio2;

public class Client {
    public static void main(String[] args) {
        ITipoInstalacion inst_1 = new InstalacionElectrica(new PagoNormal(), "EC-15252", "Instalación Completa", "220 V", 1500.75);
        inst_1.showInfo();

        ITipoInstalacion inst_2 = new InstalacionElectrica(new PagoAplicacion(), "EC-15253", "Re-instalación", "110 v / 220 V", 1200);
        inst_2.showInfo();

        ITipoInstalacion inst_3 = new InstalacionDeAgua(new PagoTigoMoney(), "WT-5262", "Revisión de Instalación",  500);
        inst_3.showInfo();

        ITipoInstalacion inst_4 = new InstalacionDeAlacantarillado(new PagoTransferenciaBancaria(), "AT-12123", "Instalación Semi-completa",  1250);
        inst_4.showInfo();
    }
}
