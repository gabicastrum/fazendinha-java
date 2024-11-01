public class Cow extends Animal {

    public Cow(String name) {
        super(name);
    }

    @Override // Override serve para sobrescrever um método da classe pai, que está sendo
              // herdado do arquivo Animal.java
    public void talk() {
        System.out.printf("%s diz Muuuuu! %n", getName());
    }

    public void eat() {
        System.out.printf("%s comeu capim %n", getName());
    }
}