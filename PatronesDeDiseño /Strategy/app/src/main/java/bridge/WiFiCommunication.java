package bridge;

public class WiFiCommunication implements CommunicationTechnology {
  @Override
  public void sendData(String data) {
    System.out.println("Sending data over Wi-Fi: " + data);
  }
}
