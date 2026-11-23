package personagens;

public class Guerreiro extends Personagem {

    private int forca;
    private int resistencia;

    public Guerreiro(String nome) {
        super(nome, 150, 20, 15);

        this.forca = 10;
        this.resistencia = 20;
    }

    public void golpePoderoso(Personagem alvo) {
        int dano = getAtaque() + forca - alvo.getDefesa();

        if (dano < 0) {
            dano = 0;
        }

        alvo.receberDano(dano);

        System.out.println(getNome() + " usou Golpe Poderoso!");
        System.out.println("Dano causado: " + dano);
        System.out.println("Vida restante do alvo: " + alvo.getHp());
    }

    @Override
    public void usarHabilidade(Personagem alvo) {
        golpePoderoso(alvo);
    }

    @Override
    public void exibirDados() {
        super.exibirDados();

        System.out.println("Força: " + forca);
        System.out.println("Resistência: " + resistencia);
    }
}
