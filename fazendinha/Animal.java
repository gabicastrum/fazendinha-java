public abstract class Animal {
  protected String name;

  public Animal(String name) {
    super();
    this.name = name;
  }

  public Animal() {
    this("Anônimo");
  }

  public abstract void talk();
  
  public abstract void eat();

  public String getName() {
    return name;
  }

//   public void talk() {
//     System.out.printf("%s diz ...%n", this.name);
//   }
}