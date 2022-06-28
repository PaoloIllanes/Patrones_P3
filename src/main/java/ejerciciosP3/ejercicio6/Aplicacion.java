package ejerciciosP3.ejercicio6;

public class Aplicacion implements IAplicacion {

    @Override
    public void obtenerEstado(Celular cell_phone) {
        System.out.println("----ARTEFACTO ELECTRONICO: CELULAR----\n");
        System.out.println("-- Marca         : " + cell_phone.getTrademark());
        System.out.println("-- Modelo        : " + cell_phone.getModel());
        System.out.println("-- Almacenamiento: " + cell_phone.getStorage());
        System.out.println("-- Memoria RAM   : " + cell_phone.getRam());
        System.out.println("-- Estado Batería: " + cell_phone.getBattery_Status());
        System.out.println("\nSE NECESITA MANTENIMIENTO PREVENTIVO");
        System.out.println("\n-------------------------------------\n\n");
    }

    @Override
    public void obtenerEstado(Computadora pc) {
        System.out.println("----ARTEFACTO ELECTRONICO: COMPUTADORA----\n");
        int random = (int)(Math.random()*30+1);
        if(random % 2 == 0){
            System.out.println("SE NECESITA MANTENIMIENTO PREVENTIVO\n");
        }else {
            System.out.println("SE NECESITA MANTENIMIENTO CORRECTIVO\n");
        }
        System.out.println("-------------------------------------\n\n");
    }

    @Override
    public void obtenerEstado(Televisor tv) {
        System.out.println("----ARTEFACTO ELECTRONICO: TELEVISOR----\n");
        System.out.println("-- Marca         : " + tv.getTrademark());
        System.out.println("-- Modelo        : " + tv.getModel());
        System.out.println("-- Tamaño        : " + tv.getSize());
        System.out.println("\n-------------------------------------\n\n");
    }
}
