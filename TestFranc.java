import static org.junit.Assert.*;
import org.junit.Test;

public class Tests {
   @Test
   public void testFrancMultiplication() {
      Franc five = new Franc(5);
      assertEquals(new Franc(10), five.times(2));
      assertEquals(new Franc(15), five.times(3));
   }

   public void testEquality() {
      assertTrue(new Franc(5).equals(new Franc(5)));
      assertFalse(new Franc(5).equals(new Franc(6)));
   }
}
