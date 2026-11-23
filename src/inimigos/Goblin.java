package inimigos;

import personagens.Personagem;

public class Goblin extends Inimigo {

    private int velocidade;

    public Goblin(String nome) {
        super(nome, 60, 15, 5, 3);

        this.velocidade = 20;
    }

    public void ataqueRapido(Personagem alvo) {
        int dano = getAtaque() + (velocidade / 5) - alvo.getDefesa();

        if (dano < 0) {
            dano = 0;
        }

        alvo.receberDano(dano);
        alvo.receberDano(dano);

        System.out.println(getNome() + " usou Ataque Rápido!");
        System.out.println("Dano de cada ataque: " + dano);
        System.out.println("Dano total: " + (dano * 2));
        System.out.println("Vida restante do alvo: " + alvo.getHp());
    }

    @Override
    public void usarHabilidade(Personagem alvo) {
        ataqueRapido(alvo);
    }

    @Override
    public void exibirDados() {
        super.exibirDados();

        System.out.println("Velocidade: " + velocidade);
    }
}
