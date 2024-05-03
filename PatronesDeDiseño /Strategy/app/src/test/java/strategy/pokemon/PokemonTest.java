package strategy.pokemon;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PokemonTest {
    @Test
    void testAtaqueFisico() {
        Pokemon pikachu = new Pokemon("Pikachu", 100, 50, 40, 70, 60);
        Pokemon charmander = new Pokemon("Charmander", 100, 55, 35, 65, 55);

        pikachu.setAtaqueStrategy(new AtaqueFisico());
        charmander.setAtaqueStrategy(new AtaqueFisico());

        pikachu.atacar(charmander);

        assertEquals(85, charmander.getVida());
    }

    @Test
    void testAtaqueEspecial() {
        Pokemon pikachu = new Pokemon("Pikachu", 100, 50, 40, 70, 60);
        Pokemon charmander = new Pokemon("Charmander", 100, 55, 35, 65, 100);

        pikachu.setAtaqueStrategy(new AtaqueEspecial());
        charmander.setAtaqueStrategy(new AtaqueEspecial());
        pikachu.atacar(charmander);

        assertEquals(100, charmander.getVida());
    }
}