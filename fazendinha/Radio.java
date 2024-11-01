public class Radio implements Talker {
    private String name;

    public Radio(String name) {
        if (name == null) {
            IllegalArgumentException e = new IllegalArgumentException("O nome não pode ser nulo");
            throw e;
        }
        if (name.isBlank()) { // isEmpty é para string vazia, isBlank é para string com espaços
            IllegalArgumentException e = new IllegalArgumentException("O nome não pode estar em branco");
            throw e;
        }
        this.name = name;
    }

    @Override
    public void talk() {
        System.out.printf("%s toca música...", this.name); // pertence a estrutura externa
    }
}
