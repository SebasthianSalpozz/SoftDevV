package bridge;
public class Main {
  public static void main(String[] args) {
    RemoteControl wifiRemoteControl = new SimpleRemoteControl(new WiFiCommunication());
    wifiRemoteControl.powerOn();
    wifiRemoteControl.setBrightness(75);
    wifiRemoteControl.powerOff();


    RemoteControl bluetoothRemoteControl = new SimpleRemoteControl(new BluetoothCommunication());
    bluetoothRemoteControl.powerOn();
    bluetoothRemoteControl.setBrightness(50);
    bluetoothRemoteControl.powerOff();
  }
}
