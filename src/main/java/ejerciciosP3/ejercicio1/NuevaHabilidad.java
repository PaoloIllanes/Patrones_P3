package ejerciciosP3.ejercicio1;

public class NuevaHabilidad implements IPersonaje {
    private IPersonaje character;

    public NuevaHabilidad(IPersonaje character) {
        this.character = character;
    }

    public IPersonaje getCharacter() {
        return character;
    }

    public void setCharacter(IPersonaje character) {
        this.character = character;
    }


    @Override
    public void operation() {
        this.character.operation();
    }

    @Override
    public Integer getLevel() {
        return this.character.getLevel();
    }

    @Override
    public void setLevel(Integer level) {
        this.character.setLevel(level);
    }

    @Override
    public Arma getWeapon() {
        return this.character.getWeapon();
    }

    @Override
    public void setWeapon(Arma weapon) {
        this.character.setWeapon(weapon);
    }

    @Override
    public double getArmorPercentage() {
        return this.character.getArmorPercentage();
    }

    @Override
    public void setArmorPercentage(double armor_pct) {
        this.character.setArmorPercentage(armor_pct);
    }

    @Override
    public double getAttackPoints() {
        return this.character.getAttackPoints();
    }

    @Override
    public void setAttackPoints(double atck_pt) {
        this.character.setAttackPoints(atck_pt);
    }

    @Override
    public double getDefensePoints() {
        return this.character.getDefensePoints();
    }

    @Override
    public void setDefensePoints(double def_pt) {
        this.character.setDefensePoints(def_pt);
    }

    @Override
    public double getLifeRegenerationPoints() {
        return this.character.getLifeRegenerationPoints();
    }

    @Override
    public void setLifeRegenerationPoints(double life_reg_pt) {
        this.character.setLifeRegenerationPoints(life_reg_pt);
    }

    @Override
    public boolean isLevelUp() {
        return this.character.isLevelUp();
    }

    @Override
    public void setLevelUp(boolean level_up) {
        this.character.setLevelUp(level_up);
    }
}
