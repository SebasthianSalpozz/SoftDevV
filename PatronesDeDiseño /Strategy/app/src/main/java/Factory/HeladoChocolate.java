package Factory;

public class HeladoChocolate implements Helado {
  @Override
  public String getNombre() {
    return "Helado de Chocolate";
  }

  @Override
  public double getPrecio() {
    return 3.50;
  }
}