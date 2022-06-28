package ejerciciosP3.ejercicio1;

public class NuevaPocion extends NuevaHabilidad {
    private Integer potion_number;

    public NuevaPocion(IPersonaje character, Integer potion_number) {
        super(character);
        this.potion_number = potion_number;
    }

    @Override
    public void operation() {
        if(super.getCharacter().isLevelUp()) {
            System.out.println("\n\tOBTENIENDO POCIONES --> Nueva Habilidad....");
            super.setLifeRegenerationPoints(super.getLifeRegenerationPoints() * 1.80 * potion_number);
            System.out.println("\t--- Aumentando regeneración de vida... ");
            System.out.println("\t--- Mostrando  nuevas estadísticas ...\n");
        }else{
            System.out.println("\n\tNO SE SUBIO DE NIVEL");
            System.out.println("\t--- No hay cambios en las estadísticas...\n");
        }
        super.operation();
    }
}