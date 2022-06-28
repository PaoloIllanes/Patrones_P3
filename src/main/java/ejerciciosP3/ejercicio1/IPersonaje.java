package ejerciciosP3.ejercicio1;

public interface IPersonaje {
    void operation();

    //Nivel
    Integer getLevel();
    void setLevel(Integer level);

    //Arma
    Arma getWeapon();
    void setWeapon(Arma weapon);

    //Porcentaje De Armadura
    double getArmorPercentage();
    void setArmorPercentage(double armor_pct);

    //Puntos De Ataque
    double getAttackPoints();
    void setAttackPoints(double atck_pt);

    //Puntos De Defensa
    double getDefensePoints();
    void setDefensePoints(double def_pt);

    //Puntos De Regeneración De Vida
    double getLifeRegenerationPoints();
    void setLifeRegenerationPoints(double life_reg_pt);

    //Puntos De Regeneración De Vida
    boolean isLevelUp();
    void setLevelUp(boolean level_up);
}
