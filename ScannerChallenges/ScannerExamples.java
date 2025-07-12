import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class ScannerExamples {

  // 1. Basic Console Input
  public static void basicConsoleInput() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== Basic Console Input ===");
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        
        System.out.print("Enter your height (in meters): ");
        double height = scanner.nextDouble();
        
        System.out.printf("Hello %s! You are %d years old and %.2f meters tall.%n", 
                         name, age, height);
        System.out.println();
    }
