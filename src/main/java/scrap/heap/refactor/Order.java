package scrap.heap.refactor;

import java.util.ArrayList;
import java.util.List;

public class Order {
  private List<Orderable> orderItems;

  public Order() {
    this.orderItems = new ArrayList<>();
  }

  public void addItem(Orderable item) {
    orderItems.add(item);
  }

  public void placeOrder() { 
    for (Orderable item: orderItems) {
      item.order();
    } 
  }
}
