package personagens;

import inimigos.Inimigo;

public class Mago extends Personagem {

    private int poderMagico;
    private int inteligencia;

    public Mago(String nome) {
        super(nome, 90, 25, 5);

        this.poderMagico = 20;
        this.inteligencia = 15;
    }

    public void bolaDeFogo(Personagem alvo) {
        int dano = getAtaque() + poderMagico;

        if (alvo instanceof Inimigo) {
            Inimigo inimigo = (Inimigo) alvo;
            inimigo.receberDanoMagico(dano);
            dano -= inimigo.getDefesaMagica();
            
            if (dano < 0) {
                dano = 0;
            }
        } else {
            alvo.receberDano(dano);
        }

        System.out.println(getNome() + " usou Bola de Fogo!");
        System.out.println("Dano causado: " + dano);
        System.out.println("Vida restante do alvo: " + alvo.getHp());
    }

    @Override
    public void usarHabilidade(Personagem alvo) {
        bolaDeFogo(alvo);
    }

    @Override
    public void exibirDados() {
        super.exibirDados();

        System.out.println("Poder mágico: " + poderMagico);
        System.out.println("Inteligência: " + inteligencia);
    }
}
