// Funcionario.java
public class Funcionario {
    protected String nome;
    protected String nasc;
    protected double salario;

    public Funcionario(String nome, String nasc, double salario) {
        this.nome = nome;
        this.nasc = nasc;
        this.salario = salario;
    }

    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Data de Nascimento: " + nasc);
        System.out.println("Salário: R$" + salario);
    }
}
