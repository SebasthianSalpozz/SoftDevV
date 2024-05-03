package strategy.pokemon;

class AtaqueFisico implements AtaqueStrategy {
    @Override
    public void atacar(Pokemon atacante, Pokemon objetivo) {
        int daño = Math.max(0, atacante.getAtaque() - objetivo.getDefensa());
        objetivo.recibirAtaque(daño);
    }
}