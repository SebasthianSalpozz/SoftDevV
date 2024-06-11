package chainResponsability;


public class LevelThreeSupportHandler extends SupportHandler {
  @Override
  public void handleRequest(CustomerRequest request) {
    if (request.getType().equals("Critical")) {
      System.out.println("Level Three Support: Handled critical request.");
    } else if (nextHandler != null) {
      nextHandler.handleRequest(request);
    } else {
      System.out.println("No one can handle this request.");
    }
  }
}
