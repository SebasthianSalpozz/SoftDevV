package builder;

public interface PizzaBuilder {
  PizzaBuilder setSize(String size);
  PizzaBuilder addCheese(String cheese);
  PizzaBuilder setSauce(String sauce);
  PizzaBuilder setTopping(String topping);
  String getDescription();
}
