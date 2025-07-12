public class ForLoopChallenge {
  public static void multiplicationTable(int number) {
    System.out.println("Multiplication table for " + number + ":");

    for (int i = 1; i <= 10; i++) {
      int result = number * i;
      System.out.println(number + " x " + i + " = " + result);
    }
  }

  public static void main(String[] args) {
    multiplicationTable(7);
  }
}
