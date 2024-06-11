package decorator;

public class ChocolateCaliente extends AdicionalesComboCine {
  public ChocolateCaliente(ComboCine combo) {
    super(combo);
  }

  public String getDescripcion() {
    return combo.getDescripcion() + ", Chocolate Caliente";
  }

  public double precio() {
    return 3.0 + combo.precio();
  }
}


