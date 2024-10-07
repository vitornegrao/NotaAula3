public class Cachorro extends Animal {
    // Construtor da classe Cachorro
    public Cachorro(String nome) {
        super(nome); // Chama o construtor da superclasse Animal
    }

    // Método específico da classe Cachorro
    public void late() {
        System.out.println(getNome() + " está latindo.");
    }
}
