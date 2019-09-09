package scrap.heap.refactor;

import org.junit.Test;
import static org.junit.Assert.*;

public class BalloonTest {
  @Test 
  public void testBalloonCreating() {
    Balloon.Color color = Balloon.Color.RED;
    Balloon.Material material = Balloon.Material.MYLAR;
    int quantity = 4;

    Balloon testBalloon = new Balloon.BalloonBuilder()
      .color(color)
      .material(material)
      .quantity(quantity)
      .build();

    assertEquals(color, testBalloon.getColor()); 
    assertEquals(material, testBalloon.getMaterial()); 
    assertEquals(quantity, testBalloon.getQuantity()); 
  }
}
