package bridge;

public abstract class RemoteControlImpl implements RemoteControl {
  protected CommunicationTechnology communicationTechnology;

  public RemoteControlImpl(CommunicationTechnology communicationTechnology) {
    this.communicationTechnology = communicationTechnology;
  }

  abstract public void powerOn();
  abstract public void powerOff();
  abstract public void setBrightness(int brightness);
}
