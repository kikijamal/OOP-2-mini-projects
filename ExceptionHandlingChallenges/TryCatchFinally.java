package ExceptionHandling;

public class TryCatchFinally {
  public static void main(String[] args) {
        int number = 100;
        int number2 = 0;
        try{
            int answer = number / number2;
            System.out.println(answer);
        }catch (ArithmeticException e){
            System.out.println("Division by zero is not allowed");

        }finally {
            System.out.println("Program Continues");
        }
    }
