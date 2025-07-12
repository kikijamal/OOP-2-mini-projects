package ClassesInJava;

public class Polymorphism {

}

class Animal {
  public void makeSound() {
    System.out.println("Some sound...");
  }
}

class Cat extends Animal {
  @Override
  public void makeSound() {
    System.out.println("Meow");
  }
}

class Cow extends Animal {
  @Override
  public void makeSound() {
    System.out.println("Moo");
  }
}
