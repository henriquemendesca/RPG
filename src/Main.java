import personagens.Guerreiro;
import personagens.Mago;
import personagens.Arqueiro;
import inimigos.Goblin;
import inimigos.Orc;
import sistema.Batalha;

public class Main {

    public static void main(String[] args) {

        // Criando os personagens
        Guerreiro guerreiro = new Guerreiro("Thorin");
        Mago mago = new Mago("Eldrin");
        Arqueiro arqueiro = new Arqueiro("Lyra");

        // Criando os inimigos
        Goblin goblin = new Goblin("Goblin");
        Orc orc = new Orc("Orc");

        // Exibindo os dados dos personagens
        System.out.println("\n===== PERSONAGENS =====");

        guerreiro.exibirDados();
        mago.exibirDados();
        arqueiro.exibirDados();

        // Exibindo os dados dos inimigos
        System.out.println("\n===== INIMIGOS =====");

        goblin.exibirDados();
        orc.exibirDados();

        // Iniciando uma batalha
        Batalha batalha = new Batalha();

        batalha.iniciar(guerreiro, goblin);
    }
}
