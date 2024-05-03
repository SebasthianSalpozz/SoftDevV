package strategy.pokemon;
class Entrenador {
    private Pokemon pokemon;

    public void setPokemon(Pokemon pokemon) {
        this.pokemon = pokemon;
    }

    public void atacar(Pokemon objetivo) {
        pokemon.atacar(objetivo);
    }
}
