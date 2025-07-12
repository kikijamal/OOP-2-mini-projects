package ArraysChallenges;

public class RandomSelection {
  public static void main(String[] args) {
    String[] orderIds = { "B123", "C234", "A345", "C15", "B122", "G3003", "C235", "B179", "C121", "D1232", "B121" };
    for (String item : orderIds) {
      if (item.startsWith("B")) {
        System.out.println("Starts with B\n" + item);

      }
      if (item.startsWith("C")) {
        System.out.println("Starts with C\n" + item);

      }
    }
  }
}