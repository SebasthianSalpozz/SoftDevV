package composite;

public class Main {
  public static void main(String[] args) {
    Product martillo = new Product(20.0);
    Product recibo = new Product(1.5);
    Product cargador = new Product(10.0);
    Product telefono = new Product(500.0);
    Product auriculares = new Product(30.0);

    Box caja1 = new Box(5.0);
    Box caja2 = new Box(10.0);
    Box caja3 = new Box(20.0);

    caja1.addOrderItem(martillo);
    caja1.addOrderItem(recibo);
    caja2.addOrderItem(cargador);
    caja3.addOrderItem(telefono);
    caja3.addOrderItem(auriculares);

    Box caja4 = new Box(30.0);
    caja4.addOrderItem(caja1);
    caja4.addOrderItem(caja2);
    caja4.addOrderItem(caja3);
    System.out.println("Caja 4 Price :" + caja4.getPrice());

  }
}