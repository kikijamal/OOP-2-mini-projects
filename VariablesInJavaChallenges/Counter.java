public class Counter {
  static int count = 0; // static variable

  public Counter() {
    count++;
  }

  public static void displayCount() {
    System.out.println("Total objects: " + count);
  }
}
