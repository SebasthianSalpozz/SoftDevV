package bridge;

public class SimpleRemoteControl extends RemoteControlImpl {
  public SimpleRemoteControl(CommunicationTechnology communicationTechnology) {
    super(communicationTechnology);
  }

  @Override
  public void powerOn() {
    communicationTechnology.sendData("Turn on");
  }

  @Override
  public void powerOff() {
    communicationTechnology.sendData("Turn off");
  }

  @Override
  public void setBrightness(int brightness) {
    communicationTechnology.sendData("Set brightness to " + brightness);
  }
}

