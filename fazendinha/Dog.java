public class Dog extends Animal {

  public Dog(String name) {
    super(name);
  }

  @Override
  public void talk() {
    System.out.printf("%s diz AuAu! %n", getName());
  }

  public void eat() {
    System.out.printf("%s comeu petiscos %n", getName());
  }
}
