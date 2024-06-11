package composite;


// Clase concreta para un producto
public class Product implements OrderItem {
  private Double price;

  public Product(Double price) {
    this.price = price;
  }

  public Double getPrice() {
    return price;
  }
}
