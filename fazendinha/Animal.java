public abstract class Animal implements Talker { //implementando a interface Talker
  protected String name;

  public Animal(String name) {
    this.name = name;
  }

  public Animal() {
    this("Anônimo");
  }

  public abstract void eat();

  public String getName() {
    return name;
  }
}