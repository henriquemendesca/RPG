import personagens.Guerreiro;
import personagens.Mago;
import personagens.Arqueiro;
import inimigos.Goblin;
import inimigos.Orc;
import sistema.Batalha;

public class Main {

    public static void main(String[] args) {

        Guerreiro guerreiro = new Guerreiro("Thorin");
        Mago mago = new Mago("Eldrin");
        Arqueiro arqueiro = new Arqueiro("Lyra");

        Goblin goblin = new Goblin("Goblin");
        Orc orc = new Orc("Orc");

        System.out.println("\n===== PERSONAGENS =====");

        guerreiro.exibirDados();
        mago.exibirDados();
        arqueiro.exibirDados();

        System.out.println("\n===== INIMIGOS =====");

        goblin.exibirDados();
        orc.exibirDados();

        Batalha batalha = new Batalha();

        batalha.iniciar(guerreiro, goblin);
    }
}
