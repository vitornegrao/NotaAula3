public class Animal {
    private String nome;
    private String raca;

    // Construtor padrão
    public Animal() {
        this.nome = "Desconhecido";
        this.raca = "Desconhecida";
    }

    // Construtor que recebe nome como parâmetro
    public Animal(String nome) {
        this.nome = nome;
        this.raca = "Desconhecida";
    }

    // Método para exibir a ação de caminhar
    public void caminha() {
        System.out.println(nome + " está caminhando.");
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }
}
