package scrap.heap.refactor;

public class App {
  public String getGreeting() {
    return "Hello world.";
  }
  public static void main(String[] args) {
    //Place birthday party orders
    Order order = new Order();
    order.addItem(new Balloon.BalloonBuilder()
      .color(Balloon.Color.RED)
      .material(Balloon.Material.MYLAR)
      .quantity(4)
      .build());
    order.addItem(new Cake.CakeBuilder()
      .flavor(Cake.Flavor.CHOCOLATE)
      .frostingFlavor(Cake.Flavor.CHOCOLATE)
      .shape(Cake.Shape.CIRCLE)
      .size(Cake.Size.LARGE)
      .color(Cake.Color.BROWN)
      .quantity(1)
      .build());
     order.addItem(new Balloon.BalloonBuilder()
      .color(Balloon.Color.BLUE)
      .material(Balloon.Material.LATEX)
      .quantity(7)
      .build());
    order.addItem(new Cake.CakeBuilder()
      .flavor(Cake.Flavor.VANILLA)
      .frostingFlavor(Cake.Flavor.CHOCOLATE)
      .shape(Cake.Shape.SQUARE)
      .size(Cake.Size.MEDIUM)
      .color(Cake.Color.BROWN)
      .quantity(1)
      .build());
    order.addItem(new Balloon.BalloonBuilder()
      .color(Balloon.Color.YELLOW)
      .material(Balloon.Material.MYLAR)
      .quantity(4)
      .build());
    order.addItem(new Cake.CakeBuilder()
      .flavor(Cake.Flavor.VANILLA)
      .frostingFlavor(Cake.Flavor.VANILLA)
      .shape(Cake.Shape.SQUARE)
      .size(Cake.Size.SMALL)
      .color(Cake.Color.YELLOW)
      .quantity(1)
      .build());  
    order.placeOrder();    
  }
}
