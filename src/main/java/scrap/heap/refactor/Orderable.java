package scrap.heap.refactor;

public abstract class Orderable {
  protected int quantity;

  public Orderable(int quantity) {
    this.quantity = quantity;
  }

  public int getQuantity() {
    return this.quantity;
  }

  public abstract void order();
} 
