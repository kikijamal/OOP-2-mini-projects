 public class Calculator {    //declares a class named Calculator


     void add() {
         System.out.println(5 + 3);      //defines a method that prints out 5+3
     }


     public static void main(String[] args) {
         (new Calculator()).add(); // Create a Calculator object and calls the add function using the dot opertaor
     }
 }