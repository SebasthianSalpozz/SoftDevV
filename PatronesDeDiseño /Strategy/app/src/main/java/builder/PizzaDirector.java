package builder;

public class PizzaDirector {
  private PizzaBuilder builder;

  public PizzaDirector(PizzaBuilder builder) {
    this.builder = builder;
  }

  public PizzaBuilder createHawaiianPizza() {
    return builder
            .setSize("Large")
            .addCheese("Mozzarella")
            .setSauce("Tomato")
            .setTopping("Ham and Pineapple");
  }

  public PizzaBuilder createPeperoniPizza() {
    return builder
            .setSize("Medium")
            .addCheese("Cheddar")
            .setSauce("Spicy")
            .setTopping("Peperoni");
  }

  public PizzaBuilder createFourCheesePizza() {
    return builder
            .setSize("Medium")
            .addCheese("Mozzarella")
            .addCheese("Cheddar")
            .addCheese("Parmesan")
            .addCheese("Gorgonzola")
            .setSauce("Tomato")
            .setTopping("");
  }
}
