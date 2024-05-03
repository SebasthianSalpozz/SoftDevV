package strategy.pokemon;
class Pokemon {
    private String nombre;
    private int vida;
    private int ataque;
    private int defensa;
    private int ataqueEspecial;
    private int defensaEspecial;
    private AtaqueStrategy ataqueStrategy;

    public Pokemon(String nombre, int vida, int ataque, int defensa, int ataqueEspecial, int defensaEspecial) {
        this.nombre = nombre;
        this.vida = vida;
        this.ataque = ataque;
        this.defensa = defensa;
        this.ataqueEspecial = ataqueEspecial;
        this.defensaEspecial = defensaEspecial;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getDefensa() {
        return defensa;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    public int getAtaqueEspecial() {
        return ataqueEspecial;
    }

    public void setAtaqueEspecial(int ataqueEspecial) {
        this.ataqueEspecial = ataqueEspecial;
    }

    public int getDefensaEspecial() {
        return defensaEspecial;
    }

    public void setDefensaEspecial(int defensaEspecial) {
        this.defensaEspecial = defensaEspecial;
    }

    public AtaqueStrategy getAtaqueStrategy() {
        return ataqueStrategy;
    }

    public void setAtaqueStrategy(AtaqueStrategy ataqueStrategy) {
        this.ataqueStrategy = ataqueStrategy;
    }

    public void atacar(Pokemon objetivo) {
        ataqueStrategy.atacar(this, objetivo);
    }

    public void recibirAtaque(int daño) {
        vida -= daño;
        if (vida <= 0) {
            System.out.println(nombre + " ha sido derrotado.");
        } else {
            System.out.println(nombre + " ha recibido " + daño + " de daño. Vida restante: " + vida);
        }
    }
}