package abstractFactory;

public class Main {
  public static void main(String[] args) {
    VehicleFactory boliviaFactory = new BoliviaVehicleFactory();
    VehicleFactory peruFactory = new PeruVehicleFactory();

    Vehicle busColombia = boliviaFactory.createBus();
    Vehicle busetaColombia = boliviaFactory.createTrufi();
    Vehicle taxiColombia = boliviaFactory.createTaxi();

    Vehicle busUSA = peruFactory.createBus();
    Vehicle taxiUSA = peruFactory.createTaxi();

    busColombia.generateId();
    busColombia.printId();

    busetaColombia.generateId();
    busetaColombia.printId();

    taxiColombia.generateId();
    taxiColombia.printId();

    busUSA.generateId();
    busUSA.printId();

    taxiUSA.generateId();
    taxiUSA.printId();
  }
}

