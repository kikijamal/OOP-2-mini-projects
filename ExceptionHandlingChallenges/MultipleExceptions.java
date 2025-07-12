package ExceptionHandling;

public class MultipleExceptions {
  public static void main(String[] args) {
    try {

      java.io.FileReader reader = new java.io.FileReader("example.txt");
      int character;
      while ((character = reader.read()) != -1) {
        System.out.print((char) character);
      }
      reader.close();
    } catch (java.io.IOException e) {

      System.err.println("An I/O error occurred: " + e.getMessage());
      e.printStackTrace(); // For debugging purposes
    }

  }
}