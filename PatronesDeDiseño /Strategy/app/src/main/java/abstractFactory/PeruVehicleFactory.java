package abstractFactory;

public class PeruVehicleFactory extends VehicleFactory {
  @Override
  public Vehicle createBus() {
    return new Bus();
  }

  @Override
  public Vehicle createTrufi() {
    throw new UnsupportedOperationException("Busetas are not available in peru.");
  }

  @Override
  public Vehicle createTaxi() {
    return new Taxi();
  }
}

