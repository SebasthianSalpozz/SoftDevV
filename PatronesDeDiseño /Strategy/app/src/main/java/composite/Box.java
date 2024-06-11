package composite;

import java.util.ArrayList;
import java.util.List;

public class Box implements OrderItem {
  private Double price;
  private List<OrderItem> orderItems;

  public Box(Double price) {
    this.price = price;
    this.orderItems = new ArrayList<>();
  }

  public void addOrderItem(OrderItem orderItem) {
    orderItems.add(orderItem);
  }

  public Double getPrice() {
    Double totalPrice = price;
    for (OrderItem orderItem : orderItems) {
      totalPrice += orderItem.getPrice();
    }
    return totalPrice;
  }
}


