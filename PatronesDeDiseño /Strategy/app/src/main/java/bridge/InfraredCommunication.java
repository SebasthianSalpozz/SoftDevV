package bridge;


public class InfraredCommunication implements CommunicationTechnology {
  @Override
  public void sendData(String data) {
    System.out.println("Sending data over Infrared: " + data);
  }
}