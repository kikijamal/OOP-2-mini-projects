package ClassesInJava;

public class Abstraction {

}

abstract class Vehicle {
  abstract void start(); // Abstract method

  public void fuel() {
    System.out.println("Vehicle fueled.");
  }
}

class Car extends Vehicle {
  @Override
  public void start() {
    System.out.println("Car starts with key.");
  }
}
