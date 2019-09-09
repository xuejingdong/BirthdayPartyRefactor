package scrap.heap.refactor;

public class Balloon extends Orderable {
  public enum Color {
   RED, WHITE, BLUE, YELLOW, GREEN; 
  }

  public enum Material {
    LATEX, MYLAR; 
  }
  private Color color;
  private Material material;

  private Balloon() {
    super(0);
  }

  public Color getColor(){
    return this.color;
  }

  public Material getMaterial() {
    return this.material;
  }

  @Override
  public void order() {
    //pretend this method works and adds balloons to the order
    System.out.println("Balloon ordered: " + this.color + ", " 
        + this.material  + ", " + this.quantity);
  }

  public static class BalloonBuilder {
    private Color color;
    private Material material;
    private int quantity;

    public BalloonBuilder color(Color color) {
      this.color = color;
      return this;
    }
    
    public BalloonBuilder material(Material material) {
      this.material = material;
      return this;
    }

    public BalloonBuilder quantity(int quantity) {
      this.quantity = quantity;
      return this;
    } 

    public Balloon build() {
      Balloon balloon = new Balloon();
      balloon.quantity = this.quantity;
      balloon.color = this.color;
      balloon.material = this.material;
      return balloon;
    }
  }
}
