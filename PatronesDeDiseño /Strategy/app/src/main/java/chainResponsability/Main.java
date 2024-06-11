package chainResponsability;

public class Main {
  public static void main(String[] args) {
    SupportHandler levelOneHandler = new LevelOneSupportHandler();
    SupportHandler levelTwoHandler = new LevelTwoSupportHandler();
    SupportHandler levelThreeHandler = new LevelThreeSupportHandler();

    levelOneHandler.setNextHandler(levelTwoHandler);
    levelTwoHandler.setNextHandler(levelThreeHandler);

    CustomerRequest request1 = new CustomerRequest("Simple");
    CustomerRequest request2 = new CustomerRequest("Complex");
    CustomerRequest request3 = new CustomerRequest("Critical");
    CustomerRequest request4 = new CustomerRequest("Urgent");

    levelOneHandler.handleRequest(request1);
    levelOneHandler.handleRequest(request2);
    levelOneHandler.handleRequest(request3);
    levelOneHandler.handleRequest(request4);
  }
}
