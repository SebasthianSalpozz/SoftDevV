package chainResponsability;


public class LevelTwoSupportHandler extends SupportHandler {
  @Override
  public void handleRequest(CustomerRequest request) {
    if (request.getType().equals("Complex")) {
      System.out.println("Level Two Support: Handled complex request.");
    } else if (nextHandler != null) {
      nextHandler.handleRequest(request);
    } else {
      System.out.println("No one can handle this request.");
    }
  }
}
