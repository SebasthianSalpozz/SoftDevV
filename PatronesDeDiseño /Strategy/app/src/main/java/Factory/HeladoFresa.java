package Factory;

public class HeladoFresa implements Helado {
  @Override
  public String getNombre() {
    return "Helado de Fresa";
  }

  @Override
  public double getPrecio() {
    return 2.75;
  }
}