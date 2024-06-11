package abstractFactory;

public class BoliviaVehicleFactory extends VehicleFactory {
  @Override
  public Vehicle createBus() {
    return new Bus();
  }

  @Override
  public Vehicle createTrufi() {
    return new Trufi();
  }

  @Override
  public Vehicle createTaxi() {
    return new Taxi();
  }
}
