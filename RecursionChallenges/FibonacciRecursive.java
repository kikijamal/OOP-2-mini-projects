import java.util.HashMap;
import java.util.Map;

public class FibonacciRecursive {

  // Basic Recursive Fibonacci
  public static int fibonacci(int n) {
    if (n <= 1) {
      return n;
    }
    return fibonacci(n - 1) + fibonacci(n - 2);
  }

  // Optimized with Memoization
  private static Map<Integer, Integer> cache = new HashMap<>();

  public static int fibonacciMemo(int n) {
    if (cache.containsKey(n)) {
      return cache.get(n);
    }

    if (n <= 1) {
      return n;
    }

    int result = fibonacciMemo(n - 1) + fibonacciMemo(n - 2);
    cache.put(n, result);
    return result;
  }

  // Generate Fibonacci Series
  public static int[] fibonacciSeries(int n) {
    int[] series = new int[n];
    for (int i = 0; i < n; i++) {
      series[i] = fibonacciMemo(i);
    }
    return series;
  }

  // Demo
  public static void main(String[] args) {
    System.out.println("Fibonacci Numbers:");
    for (int i = 0; i < 10; i++) {
      System.out.printf("fib(%d) = %d%n", i, fibonacci(i));
    }

    System.out.println("\nFibonacci Series (first 15 terms):");
    int[] series = fibonacciSeries(15);
    for (int i = 0; i < series.length; i++) {
      System.out.print(series[i]);
      if (i < series.length - 1) {
        System.out.print(", ");
      }
    }
    System.out.println();

    System.out.printf("%nLarge number example: fib(30) = %d%n", fibonacciMemo(30));
  }
}