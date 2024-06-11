package abstractFactory;

public class Bus implements Vehicle {
  private int id;

  @Override
  public int generateId() {
    id = (int) (Math.random() * 9999);
    return id;
  }

  @Override
  public void printId() {
    System.out.println("Bus ID: " + id);
  }
}

