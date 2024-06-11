package chainResponsability;

public class LevelOneSupportHandler extends SupportHandler {
  @Override
  public void handleRequest(CustomerRequest request) {
    if (request.getType().equals("Simple")) {
      System.out.println("Level One Support: Handled simple request.");
    } else if (nextHandler != null) {
      nextHandler.handleRequest(request);
    } else {
      System.out.println("No one can handle this request.");
    }
  }
}
