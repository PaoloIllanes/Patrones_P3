package ejerciciosP3.ejercicio1;

public class NuevoEscudo extends NuevaHabilidad {

    public NuevoEscudo(IPersonaje character) {
        super(character);
    }

    @Override
    public void operation() {
        if(super.getCharacter().isLevelUp()){
            System.out.println("\n\tOBTENIENDO ESCUDO --> Nueva Habilidad....");
            super.setDefensePoints(super.getDefensePoints() * 1.35);
            super.setArmorPercentage(super.getArmorPercentage() * 1.10);
            System.out.println("\t--- Aumentando regeneración de defensa... ");
            System.out.println("\t--- Aumentando regeneración de armadura... ");
            System.out.println("\t--- Mostrando  nuevas estadísticas...\n");
        }else{
            System.out.println("\n\tNO SE SUBIO DE NIVEL");
            System.out.println("\t--- No hay cambios en las estadísticas...\n");
        }
        super.operation();
    }
}