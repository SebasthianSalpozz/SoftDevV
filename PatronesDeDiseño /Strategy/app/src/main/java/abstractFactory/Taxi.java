package abstractFactory;

public class Taxi implements Vehicle {
  private int id;

  @Override

  public int generateId() {
    id = (int) (Math.random() * 9999);
    return id;
  }

  @Override
  public void printId() {
    System.out.println("Taxi ID: " + id);
  }
}

