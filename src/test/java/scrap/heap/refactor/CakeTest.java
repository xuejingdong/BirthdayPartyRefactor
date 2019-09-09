package scrap.heap.refactor;

import org.junit.Test;
import static org.junit.Assert.*;

public class CakeTest {
  @Test 
  public void testCakeCreating() {
    Cake.Flavor flavor = Cake.Flavor.CHOCOLATE;  
    Cake.Flavor frostingFlavor = Cake.Flavor.CHOCOLATE;  
    Cake.Shape shape = Cake.Shape.CIRCLE;  
    Cake.Size size = Cake.Size.LARGE;  
    Cake.Color color = Cake.Color.BROWN;  
    int quantity = 1;  

    Cake testCake = new Cake.CakeBuilder()
      .flavor(flavor)
      .frostingFlavor(frostingFlavor)
      .shape(shape)
      .size(size)
      .color(color)
      .quantity(quantity)
      .build();

    assertEquals(flavor, testCake.getFlavor()); 
    assertEquals(frostingFlavor, testCake.getFrostingFlavor()); 
    assertEquals(shape, testCake.getShape()); 
    assertEquals(size, testCake.getSize()); 
    assertEquals(color, testCake.getColor()); 
    assertEquals(quantity, testCake.getQuantity()); 
  }
}
