package ejerciciosP3.ejercicio1;

public class NuevaArma extends NuevaHabilidad{
    private Arma new_weapon;

    public NuevaArma(IPersonaje character, Arma new_weapon) {
        super(character);
        this.new_weapon = new_weapon;
    }

    @Override
    public void operation() {
        if(super.getCharacter().isLevelUp()){
            System.out.println("\n\tOBTENIENDO ARMA --> Nueva Habilidad....");
            super.setAttackPoints(super.getAttackPoints() * 1.30);
            super.setLevel(super.getLevel() * 2);
            super.setWeapon(new_weapon);
            System.out.println("\t--- Nueva Arma Obtenida: " + new_weapon.getWpn_type());
            System.out.println("\t--- Aumentando regeneración de ataque... ");
            System.out.println("\t--- Duplicando nivel... ");
            System.out.println("\t--- Mostrando  nuevas estadísticas...\n");
        }else{
            System.out.println("\n\tNO SE SUBIO DE NIVEL");
            System.out.println("\t--- No hay cambios en las estadísticas...\n");
        }
        super.operation();
    }
}
