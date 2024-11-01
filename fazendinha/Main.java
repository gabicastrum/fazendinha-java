public class Main {
  public static void main(String[] args) {
    Animal olivia = new Cat("Olivia");
    Cat buba = new Cat("Buba");
    Dog jujubinha = new Dog("Jujubinha");
    Cow Mimosa = new Cow("Mimosa");

    Animal[] animais = { olivia, buba, jujubinha, Mimosa };

    talker(animais);

    eating(animais);
  }

  public static void talker(Animal[] animais) {
    for (Animal animal : animais) { // aqui ele está percorrendo o array de animais
      animal.talk();
    }
  }

  public static void eating(Animal[] animais) {
    for (Animal animal : animais) { // aqui ele está percorrendo o array de animais
      animal.eat();
    }
    // if (animal instanceof Cat) {
    // ((Cat) animal).eat();
    // }
    // for (int i = 0; i < animais.length; i++) {
    // if (animais[i] instanceof Cat) {
    // ((Cat) animais[i]).eat();
    // }

    // animais[i].talk();
  }
}