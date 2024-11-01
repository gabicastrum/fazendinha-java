public class Main {
  public static void main(String[] args) {
    Cat olivia = new Cat("Olivia");
    Cat buba = new Cat("Buba");
    Dog jujubinha = new Dog("Jujubinha");
    Cow mimosa = new Cow("Mimosa");
    Radio continental = new Radio("Continental");

    Animal[] animaisQueComem = { olivia, buba, jujubinha, mimosa };
    Talker[] falantes = { olivia, buba, jujubinha, mimosa, continental };

    for (Animal animal : animaisQueComem) {
      animal.eat();
    }

    for (Talker falante : falantes) {
      falante.talk();
    }
  }
}