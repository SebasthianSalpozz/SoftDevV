package decorator;

public abstract class AdicionalesComboCine extends ComboCine {
  protected ComboCine combo;

  public AdicionalesComboCine(ComboCine combo) {
    this.combo = combo;
  }

  public abstract String getDescripcion();
  public abstract double precio();
}
