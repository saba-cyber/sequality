package sequality;

public class Calculate {
  public int sum(int x, int y) {
    return x + y;
  }

  public double average(double x, double y) {
    return (x + y) / 2;
  }

  public int sum1to10() {
    int sum = 0;
    for (int i = 1; i <= 10; i++) {
      sum = sum + i;
    }
    return sum;
  }

  public double ave1to10() {
    return new Calculate().sum1to10() / 10;
  }

  public int oddsum() {
    int odd = 0;
    for (int j = 1; j <= 10; j++) {
      if (j % 2 == 1) {
        odd = odd + j;
      }
    }
    return odd;
  }

  public int evensum() {
    int even = 0;
    for (int j = 1; j <= 10; j++) {
      if (j % 2 == 0) {
        even = even + j;
      }
    }
    return even;
  }
}
