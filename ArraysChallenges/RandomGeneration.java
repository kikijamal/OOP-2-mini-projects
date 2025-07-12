package ArraysChallenges;

import java.util.Random;

public class RandomGeneration {
  public static void main(String[] args) {
    Random RandomGenerator = new Random();
    String[] ids = new String[5];
    for (int i = 0; i < ids.length; i++) {
      char prefix = (char) (RandomGenerator.nextInt(5) + 'A');
      int number = RandomGenerator.nextInt(999) + 1;
      String suffix = String.format("%03d", number);
      ids[i] = prefix + suffix;
      for (String orderId : ids) {
        System.out.println(orderId);
      }
    }

  }
}