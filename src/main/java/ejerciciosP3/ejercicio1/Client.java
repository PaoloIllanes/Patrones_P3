package ejerciciosP3.ejercicio1;

public class Client {
    public static void main(String [] args){
        IPersonaje character = new PersonajeBasico("Beatrice");
        ((PersonajeBasico)character).showStatus();

        ((PersonajeBasico)character).levelUp();
        character = new NuevaArma(character, new Arma("Espada"));
        character = new NuevoEscudo(character);
        character = new NuevoEscudo(character);
        character = new NuevaPocion(character, 4);
        character.operation();

    }
}
