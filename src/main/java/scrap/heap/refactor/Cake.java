package scrap.heap.refactor;

public class Cake extends Orderable {
  public enum Flavor {
    VANILLA, CHOCOLATE;
  }
  public enum Shape {
    CIRCLE, SQUARE;
  }
  public enum Size {
    LARGE, MEDIUM, SMALL;
  }
  public enum Color {
    BROWN, YELLOW;
  }
  private Flavor flavor;
  private Flavor frostingFlavor;
  private Shape shape;
  private Size size;
  private Color color;
  
  private Cake() {
    super(0);
  }

  public Flavor getFlavor() {
    return this.flavor;
  }

  public Flavor getFrostingFlavor() {
    return this.frostingFlavor;
  }

  public Shape getShape() {
    return this.shape;
  }
  
  public Color getColor() {
    return this.color;
  }

  public Size getSize() {
    return this.size;
  }
  
  @Override
  public void order() {
    //pretend this method works and adds balloons to the order
    System.out.println("Cake ordered: " + this.flavor + ", " 
        + this.frostingFlavor  + ", " + this.shape + ", "
        + this.size + ", " + this.color + ", " + this.quantity);
  }
  
  public static class CakeBuilder {
    private Flavor flavor;
    private Flavor frostingFlavor;
    private Shape shape;
    private Size size;
    private Color color;
    private int quantity;

    public CakeBuilder flavor(Flavor flavor){
      this.flavor = flavor;
      return this;
    }

    public CakeBuilder frostingFlavor(Flavor frostingFlavor){
      this.frostingFlavor = frostingFlavor;
      return this;
    }

    public CakeBuilder shape(Shape shape){
      this.shape = shape;
      return this;
    }

    public CakeBuilder size(Size size){
      this.size = size;
      return this;
    } 

    public CakeBuilder color(Color color) {
      this.color = color;
      return this;
    }
    
    public CakeBuilder quantity(int quantity) {
      this.quantity = quantity;
      return this;
    }

    public Cake build() {
      Cake cake = new Cake();
      cake.quantity = this.quantity;
      cake.flavor = this.flavor;
      cake.frostingFlavor = this.frostingFlavor;
      cake.shape = this.shape;
      cake.size = this.size;
      cake.color = this.color;
      return cake;
    }
  }
}
