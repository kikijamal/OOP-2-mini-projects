import java.util.Arrays;

public class BinarySearch {

  // Recursive Binary Search
  public static int binarySearchRecursive(int[] arr, int target, int left, int right) {
    if (left > right) {
      return -1; // Element not found
    }

    int mid = left + (right - left) / 2;

    if (arr[mid] == target) {
      return mid;
    } else if (arr[mid] > target) {
      return binarySearchRecursive(arr, target, left, mid - 1);
    } else {
      return binarySearchRecursive(arr, target, mid + 1, right);
    }
  }

  // Iterative Binary Search
  public static int binarySearchIterative(int[] arr, int target) {
    int left = 0;
    int right = arr.length - 1;

    while (left <= right) {
      int mid = left + (right - left) / 2;

      if (arr[mid] == target) {
        return mid;
      } else if (arr[mid] > target) {
        right = mid - 1;
      } else {
        left = mid + 1;
      }
    }

    return -1; // Element not found
  }

  // Wrapper method for recursive binary search
  public static int binarySearch(int[] arr, int target) {
    return binarySearchRecursive(arr, target, 0, arr.length - 1);
  }

  // Demo
  public static void main(String[] args) {
    int[] arr = { 2, 5, 8, 12, 16, 23, 38, 45, 56, 67, 78 };

    System.out.println("Array: " + Arrays.toString(arr));
    System.out.println();

    // Test different search values
    int[] searchValues = { 23, 5, 78, 1, 50, 67 };

    for (int target : searchValues) {
      int recursiveResult = binarySearch(arr, target);
      int iterativeResult = binarySearchIterative(arr, target);

      System.out.printf("Searching for %d:%n", target);
      System.out.printf("  Recursive: %s%n",
          recursiveResult != -1 ? "Found at index " + recursiveResult : "Not found");
      System.out.printf("  Iterative: %s%n",
          iterativeResult != -1 ? "Found at index " + iterativeResult : "Not found");
      System.out.println();
    }
  }
}