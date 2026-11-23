package sistema;

import java.util.Scanner;
import personagens.Personagem;
import inimigos.Inimigo;

public class Batalha {

    private static final Scanner scanner = new Scanner(System.in);

    public void iniciar(Personagem personagem, Inimigo inimigo) {

        System.out.println("\n================================");
        System.out.println("       INICIO DA BATALHA");
        System.out.println("================================");

        System.out.println(personagem.getNome() + " VS " + inimigo.getNome());

        while (personagem.estaVivo() && inimigo.estaVivo()) {

            System.out.println("\n--- TURNO DO JOGADOR ---");
            System.out.println("Personagem: " + personagem.getNome());
            System.out.println("Vida: " + personagem.getHp());

            System.out.println("\nEscolha sua ação:");
            System.out.println("1 - Ataque normal");
            System.out.println("2 - Habilidade especial");

            int opcao = 0;

            while (opcao != 1 && opcao != 2) {

                System.out.print("Digite sua escolha: ");

                String entrada = scanner.nextLine();

                try {
                    opcao = Integer.parseInt(entrada);

                    if (opcao != 1 && opcao != 2) {
                        System.out.println("Opção inválida! Escolha 1 ou 2.");
                    }

                } catch (NumberFormatException e) {
                    System.out.println("Digite apenas números!");
                }
            }

            if (opcao == 1) {
                personagem.atacar(inimigo);
            } else {
                personagem.usarHabilidade(inimigo);
            }

            if (!inimigo.estaVivo()) {
                break;
            }

            System.out.println("\n--- TURNO DO INIMIGO ---");

            inimigo.usarHabilidade(personagem);

            System.out.println("\n--- STATUS DA BATALHA ---");
            System.out.println(personagem.getNome() + ": " + personagem.getHp() + " HP");
            System.out.println(inimigo.getNome() + ": " + inimigo.getHp() + " HP");
        }

        System.out.println("\n================================");

        if (personagem.estaVivo()) {
            System.out.println(personagem.getNome() + " VENCEU A BATALHA!");
        } else {
            System.out.println(inimigo.getNome() + " VENCEU A BATALHA!");
        }

        System.out.println("================================");
    }
}
