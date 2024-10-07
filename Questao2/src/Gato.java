public class Gato extends Animal {
    // Construtor da classe Gato
    public Gato(String nome) {
        super(nome); // Chama o construtor da superclasse Animal
    }

    // Método específico da classe Gato
    public void mia() {
        System.out.println(getNome() + " está miando.");
    }
}
