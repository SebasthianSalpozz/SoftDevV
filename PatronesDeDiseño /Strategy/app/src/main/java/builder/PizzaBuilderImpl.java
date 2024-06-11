package builder;

import java.util.ArrayList;
import java.util.List;

public class PizzaBuilderImpl implements PizzaBuilder {
  private String size;
  private List<String> cheeses;
  private String sauce;
  private String topping;

  public PizzaBuilderImpl() {
    this.cheeses = new ArrayList<>();
  }

  @Override
  public PizzaBuilder setSize(String size) {
    this.size = size;
    return this;
  }

  @Override
  public PizzaBuilder addCheese(String cheese) {
    this.cheeses.add(cheese);
    return this;
  }

  @Override
  public PizzaBuilder setSauce(String sauce) {
    this.sauce = sauce;
    return this;
  }

  @Override
  public PizzaBuilder setTopping(String topping) {
    this.topping = topping;
    return this;
  }
  @Override
  public String getDescription() {
    return "Pizza size: " + size + " Cheeses: " + cheeses + " Sauce: " + sauce + " Topping: " + topping;
  }
}
