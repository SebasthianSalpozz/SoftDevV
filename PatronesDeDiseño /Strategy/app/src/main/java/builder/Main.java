package builder;


public class Main {
  public static void main(String[] args) {
    PizzaDirector director = new PizzaDirector(new PizzaBuilderImpl());

    PizzaBuilder hawaiianPizza = director.createHawaiianPizza();
    System.out.println(hawaiianPizza.getDescription());

    PizzaBuilder peperoniPizza = director.createPeperoniPizza();
    System.out.println(peperoniPizza.getDescription());

    PizzaBuilder fourquesos = director.createFourCheesePizza();
    System.out.println(fourquesos.getDescription());
  }
}