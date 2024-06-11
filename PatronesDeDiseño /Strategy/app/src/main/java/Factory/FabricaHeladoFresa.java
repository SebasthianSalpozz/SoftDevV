package Factory;
public class FabricaHeladoFresa implements FabricaHelados {
  @Override
  public Helado crearHelado() {
    return new HeladoFresa();
  }
}
