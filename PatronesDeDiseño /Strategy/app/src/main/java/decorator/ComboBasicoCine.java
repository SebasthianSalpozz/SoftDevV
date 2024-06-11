package decorator;


public class ComboBasicoCine extends ComboCine {
  public String getDescripcion() {
    return "Entrada de cine, palomitas de maíz y gaseosa";
  }

  public double precio() {
    return 15.0;
  }
}
