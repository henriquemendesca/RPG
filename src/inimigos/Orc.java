package inimigos;

import personagens.Personagem;

public class Orc extends Inimigo {

    private int furia;

    public Orc(String nome) {
        super(nome, 180, 25, 12, 8);

        this.furia = 15;
    }

    public void ataqueFurioso(Personagem alvo) {
        int dano = getAtaque() + furia - alvo.getDefesa();

        if (dano < 0) {
            dano = 0;
        }

        alvo.receberDano(dano);

        System.out.println(getNome() + " usou Ataque Furioso!");
        System.out.println("Dano causado: " + dano);
        System.out.println("Vida restante do alvo: " + alvo.getHp());
    }

    @Override
    public void usarHabilidade(Personagem alvo) {
        ataqueFurioso(alvo);
    }

    @Override
    public void exibirDados() {
        super.exibirDados();

        System.out.println("Fúria: " + furia);
    }
}
