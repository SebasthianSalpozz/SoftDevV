package templatemethod;

abstract class Pokemon {
    public final void entrenar() {
        calentar();
        entrenamientoEspecifico();
        descansar();
    }

    abstract void entrenamientoEspecifico();

    void calentar() {
        System.out.println("Calentando al Pokémon");
    }

    void descansar() {
        System.out.println("El Pokémon descansa");
    }
}