// This class shows different data types in Java
public class DataTypesExamples {

    // Instance variables with different types
    int number = 42;            // int type used to store whole numbers
    boolean isJavaFun = true;   // boolean type used to store true or false
    char grade = 'A';           // char type used to score single character
    double piValue = 3.14159;   // double type used to store decimal numbers
    String message = "Hello";   // String type used to store a sequence of character

    // Method to display all variables
    void showData() {
        System.out.println("Integer value: " + number);
        System.out.println("Boolean value: " + isJavaFun);
        System.out.println("Character value: " + grade);
        System.out.println("Double value: " + piValue);
        System.out.println("String value: " + message);
    }

    // Starter code: main method
    public static void main(String[] args) {
        // Create an object
        DataTypesExamples example = new DataTypesExamples(); // create an object example using new keyword

        // Call the method using dot operator
        example.showData();
    }
}
