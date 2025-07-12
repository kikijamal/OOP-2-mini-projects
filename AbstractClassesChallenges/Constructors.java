package AbstractClassesChallenges;

public class Constructors {
  abstract class Shape {
    protected String name;

    public Shape(String name) {
      this.name = name;
    }

    public abstract double area();

    public void printName() {
      System.out.println("Shape: " + name);
    }
  }

  class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(String name, double width, double height) {
      super(name);
      this.width = width;
      this.height = height;
    }

    @Override
    public double area() {
      return width * height;
    }
  }

}
