public class Main {
    public static void main(String[] args) {
        // Criando um objeto Cachorro
        Cachorro cachorro = new Cachorro("Rex");
        cachorro.caminha();
        cachorro.late();

        System.out.println();

        // Criando um objeto Gato
        Gato gato = new Gato("Mia");
        gato.caminha();
        gato.mia();
    }
}
