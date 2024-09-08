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
      assertTrue(Money.franc(5).equals(Money.franc(5)));
      assertFalse(Money.franc(5).equals(Money.franc(6)));
      assertFalse(Money.franc(5).equals(Money.dollar(5)));
      assertFalse(Money.franc(5).equals(Money.franc(6)));
      assertFalse(Money.franc(5).equals(Money.dollar(5)));
   }
}
