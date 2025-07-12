package ArraysChallenges;

import java.util.Arrays;

public class ClearingElements {
  public static void main(String[] args) {
    String[] pallets = { "B14", "A11", "B12", "A13" };
    System.out.println();
    Arrays.fill(pallets, 0, 2, null);
    if (pallets[0] != null) {

    }
  }
}
