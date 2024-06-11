package decorator;

public class Nachos extends AdicionalesComboCine {
  public Nachos(ComboCine combo) {
    super(combo);
  }

  public String getDescripcion() {
    return combo.getDescripcion() + ", Nachos";
  }

  public double precio() {
    return 4.0 + combo.precio();
  }
}


