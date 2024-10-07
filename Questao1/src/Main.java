// Main.java
public class Main {
        public static void main(String[] args) {
                // Criando um Gerente
                Gerente gerente = new Gerente("Alice", "01/01/1980", 5000.0, "Projeto Alpha");
                gerente.exibirDados();
                gerente.informarProjeto();

                System.out.println();

                // Criando um Programador
                Programador programador = new Programador("Bob", "15/03/1992", 4000.0, "Java");
                programador.exibirDados();
                programador.informarLinguagem();
        }
}
