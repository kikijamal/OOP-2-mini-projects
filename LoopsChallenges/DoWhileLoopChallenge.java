package LoopsChallenges;

import java.util.Scanner;

public class DoWhileLoopChallenge {
    public static void calculatorMenu() {
        Scanner scanner = new Scanner(System.in);
        int choice;
        
        do {
            // Display menu
            System.out.println("\n=== Simple Calculator ===");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");
            System.out.print("Choose an option (1-5): ");
            
            choice = scanner.nextInt();
            
            if (choice >= 1 && choice <= 4) {
                System.out.print("Enter first number: ");
                double num1 = scanner.nextDouble();
                System.out.print("Enter second number: ");
                double num2 = scanner.nextDouble();
                
                double result = 0;
                String operation = "";
                
                switch (choice) {
                    case 1:
                        result = num1 + num2;
                        operation = "+";
                        break;
                    case 2:
                        result = num1 - num2;
                        operation = "-";
                        break;
                    case 3:
                        result = num1 * num2;
                        operation = "*";
                        break;
                    case 4:
                        if (num2 != 0) {
                            result = num1 / num2;
                            operation = "/";
                        } else {
                            System.out.println("Error: Division by zero!");
                            continue;
                        }
                        break;
                }
                
                System.out.println("Result: " + num1 + " " + operation + " " + num2 + " = " + result);
            } else if (choice == 5) {
                System.out.println("Thank you for using the calculator!");
            } else {
                System.out.println("Invalid choice! Please select 1-5.");
            }
            
        } while (choice != 5);
        
        scanner.close();
    }
    
    public static void main(String[] args) {
        calculatorMenu();
    }
}

{

}
