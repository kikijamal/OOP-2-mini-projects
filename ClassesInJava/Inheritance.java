package ClassesInJava;

public class Inheritance {

}

// Superclass
class Animal {
  public void eat() {
    System.out.println("This animal eats food.");
  }
}

// Subclass
class Dog extends Animal {
  public void bark() {
    System.out.println("Dog barks.");
  }
}
