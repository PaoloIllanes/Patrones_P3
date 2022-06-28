package ejerciciosP3.ejercicio1;

public class PersonajeBasico implements IPersonaje{
    private String char_name;
    private String char_role;
    private Integer char_level;
    private Arma char_weapon;
    private double char_armor_pct;
    private double char_atk_pt;
    private double char_def_pt;
    private double char_life_reg_pt;
    private boolean level_up;

    public PersonajeBasico(String char_name) {
        this.char_name =  char_name;
        setCharacterAttributes();
    }

    public void setCharacterAttributes(){
        double armor = 1;
        double attack = (Math.random()*30+1);
        double defense = (Math.random()*30+1);
        double regeneration = (Math.random()*30+1);
        setLevel(1);
        setWeapon(new Arma("Ninguna"));
        setLevelUp(false);
        setArmorPercentage(1);
        setAttackPoints(attack);
        setDefensePoints(defense);
        setLifeRegenerationPoints(regeneration);
        if(attack >= defense && attack >= regeneration) {
            setCharRole("Guerrero");
        } else if(defense >= attack && defense >= regeneration) {
            setCharRole("Guardia");
        } else if(regeneration >= attack && regeneration >= defense) {
            setCharRole("Curandero");
        }
    }

    public void levelUp(){
        setLevel(char_level+1);
        setLevelUp(true);
    }

    public String getCharacterName() {
        return char_name;
    }

    public void setCharacterName(String char_name) {
        this.char_name = char_name;
    }

    public String getCharRole() {
        return char_role;
    }

    public void setCharRole(String char_role) {
        this.char_role = char_role;
    }

    @Override
    public Integer getLevel() {
        return char_level;
    }

    @Override
    public void setLevel(Integer char_level) {
        this.char_level = char_level;
    }

    @Override
    public Arma getWeapon() {
        return char_weapon;
    }

    @Override
    public void setWeapon(Arma char_weapon) {
        this.char_weapon = char_weapon;
    }

    @Override
    public double getArmorPercentage() {
        return char_armor_pct;
    }

    @Override
    public void setArmorPercentage(double char_armor_pct) {
        this.char_armor_pct = char_armor_pct;
    }

    @Override
    public double getAttackPoints() {
        return char_atk_pt;
    }

    @Override
    public void setAttackPoints(double char_atk_pt) {
        this.char_atk_pt = char_atk_pt;
    }

    @Override
    public double getDefensePoints() {
        return char_def_pt;
    }

    @Override
    public void setDefensePoints(double def_pt) {
        this.char_def_pt = def_pt;
    }

    @Override
    public double getLifeRegenerationPoints() {
        return char_life_reg_pt;
    }

    @Override
    public void setLifeRegenerationPoints(double char_life_reg_pt) {
        this.char_life_reg_pt = char_life_reg_pt;
    }

    @Override
    public boolean isLevelUp() {
        return level_up;
    }

    @Override
    public void setLevelUp(boolean level_up) {
        this.level_up = level_up;
    }

    @Override
    public void operation() {
        showStatus();
    }

    public void showStatus() {
        System.out.println("--------- DATOS PERSONAJE --------");
        System.out.println("-- NOMBRE   : " + char_name);
        System.out.println("-- ROL      : " + char_role);
        System.out.println("-- NIVEL    : " + char_level);
        System.out.println("-- ARMA     : " + char_weapon.getWpn_type());
        System.out.println("-- PORCENTAJE");
        System.out.println("   ARMADURA : " + Math.round(char_armor_pct*100.0)/100.0 + "%");
        System.out.println("-- PUNTOS DE");
        System.out.println("   ATAQUE   : " + Math.round(char_atk_pt*100.0)/100.0 + " puntos");
        System.out.println("-- PUNTOS DE");
        System.out.println("   DEFENSA  : " + Math.round(char_def_pt*100.0)/100.0+ " puntos");
        System.out.println("-- PUNTOS DE");
        System.out.println("   REGENERACION");
        System.out.println("   VIDA     : " + Math.round(char_life_reg_pt*100.0)/100.0+ " puntos");
    }
}
