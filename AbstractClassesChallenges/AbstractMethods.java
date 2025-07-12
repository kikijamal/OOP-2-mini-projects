package AbstractClassesChallenges;

public class AbstractMethods {

}

abstract class Employee {
  protected String name;
  protected double salary;

  public Employee(String name, double salary) {
    this.name = name;
    this.salary = salary;
  }

  public abstract double calculateBonus();

  public void showDetails() {
    System.out.println(name + "'s Salary: " + salary);
  }
}

class Manager extends Employee {
  public Manager(String name, double salary) {
    super(name, salary);
  }

  @Override
  public double calculateBonus() {
    return salary * 0.2;
  }
}
