package Factory;

public class Main {
  public static void main(String[] args) {
    FabricaHelados fabrica = new FabricaHeladoChocolate();
    Helado helado = fabrica.crearHelado();
    System.out.println("Helado: " + helado.getNombre() + ", Precio: " + helado.getPrecio());

    fabrica = new FabricaHeladoFresa();
    helado = fabrica.crearHelado();
    System.out.println("Helado: " + helado.getNombre() + ", Precio: " + helado.getPrecio());
  }
}