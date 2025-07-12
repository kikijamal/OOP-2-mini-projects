package ExceptionHandling;

import java.io.FileReader;
import java.io.IOException;

public class CustomException {
  public static void main(String[] args) {
    try {
      // Code that might throw an IOException
      FileReader reader = new FileReader("example.txt");
      int character;
      while ((character = reader.read()) != -1) {
        System.out.print((char) character);
      }
      reader.close();
    } catch (IOException e) {
      System.err.println("Error reading file: " + e.getMessage());
    }
  }
}