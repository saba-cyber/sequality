package sequality;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculateTest {
  @Test
  public void testSum() {
    Calculate calculate = new Calculate();
    int expected = 5;
    assertEquals(expected, calculate.sum(2, 3));
  }

  public void testave() {
    Calculate calculate = new Calculate();
    double expected = 2.5;
    assertEquals(expected, calculate.average(2.0, 3.0), 0);
  }

  public void test1to10() {
    Calculate calculate = new Calculate();
    int expected = 55;
    assertEquals(expected, calculate.sum1to10());
  }

  public void testave1to10() {
    Calculate calculate = new Calculate();
    double expected = 5.5;
    assertEquals(expected, calculate.ave1to10(), 0);
  }

  public void testodd() {
    Calculate calculate = new Calculate();
    int expected = 25;
    assertEquals(expected, calculate.oddsum());
  }

  public void testeven() {
    Calculate calculate = new Calculate();
    int expected = 30;
    assertEquals(expected, calculate.evensum());
  }

}
