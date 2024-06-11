package bridge;


public class BluetoothCommunication implements CommunicationTechnology {
  @Override
  public void sendData(String data) {
    System.out.println("Sending data over Bluetooth: " + data);
  }
}
