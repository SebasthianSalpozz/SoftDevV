package strategy.pokemon;

class AtaqueEspecial implements AtaqueStrategy {
    @Override
    public void atacar(Pokemon atacante, Pokemon objetivo) {
        int daño = Math.max(0, atacante.getAtaqueEspecial() - objetivo.getDefensaEspecial());
        objetivo.recibirAtaque(daño);
    }
}
