package templatemethod;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PokemonTest {
    @Test
    public void testEntrenamientoPikachu() {
        Pokemon pikachu = new Pikachu();
        String resultadoEsperado = "Calentando al Pokémon\n" +
                                   "Pikachu practica su ataque eléctrico\n" +
                                   "Pikachu mejora su velocidad\n" +
                                   "El Pokémon descansa\n";
        assertEquals(resultadoEsperado, getOutput(pikachu));
    }

    @Test
    public void testEntrenamientoCharmander() {
        Pokemon charmander = new Charmander();
        String resultadoEsperado = "Calentando al Pokémon\n" +
                                   "Charmander practica su lanzallamas\n" +
                                   "Charmander mejora su resistencia al fuego\n" +
                                   "El Pokémon descansa\n";
        assertEquals(resultadoEsperado, getOutput(charmander));
    }

    @Test
    public void testEntrenamientoSquirtle() {
        Pokemon squirtle = new Squirtle();
        String resultadoEsperado = "Calentando al Pokémon\n" +
                                   "Squirtle practica su pistola de agua\n" +
                                   "Squirtle mejora su defensa\n" +
                                   "El Pokémon descansa\n";
        assertEquals(resultadoEsperado, getOutput(squirtle));
    }

    private String getOutput(Pokemon pokemon) {
        ByteArrayOutputStream salidaConsola = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(salidaConsola);
        PrintStream oldOut = System.out;
        System.setOut(printStream);
        pokemon.entrenar();
        System.out.flush();
        System.setOut(oldOut);
        return salidaConsola.toString();
    }
}
