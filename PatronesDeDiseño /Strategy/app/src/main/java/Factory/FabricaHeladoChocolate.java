package Factory;

public class FabricaHeladoChocolate implements FabricaHelados {
  @Override
  public Helado crearHelado() {
    return new HeladoChocolate();
  }
}