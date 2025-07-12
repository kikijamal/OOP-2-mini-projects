package AbstractClassesChallenges;

class InstantiationAbstract {

}this.name=name;}

  public abstract void makeSound();

  public void displayName() {
    System.out.println("Animal name: " + name);
  }
}

class Cat extends Animal {
  public Cat(String name) {
    super(name);
  }

  @Override
  public void makeSound() {
    System.out.println("Meow!");
  }
}

}
