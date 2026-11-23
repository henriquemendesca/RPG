package personagens;

public class Arqueiro extends Personagem {

    private int precisao;
    private int agilidade;

    public Arqueiro(String nome) {
        super(nome, 110, 28, 7);

        this.precisao = 15;
        this.agilidade = 20;
    }

    public void flechaDupla(Personagem alvo) {
        int dano = getAtaque() + precisao - alvo.getDefesa();

        if (dano < 0) {
            dano = 0;
        }

        alvo.receberDano(dano);
        alvo.receberDano(dano);

        System.out.println(getNome() + " usou Flecha Dupla!");
        System.out.println("Dano de cada flecha: " + dano);
        System.out.println("Dano total: " + (dano * 2));
        System.out.println("Vida restante do alvo: " + alvo.getHp());
    }

    @Override
    public void usarHabilidade(Personagem alvo) {
        flechaDupla(alvo);
    }

    @Override
    public void exibirDados() {
        super.exibirDados();

        System.out.println("Precisão: " + precisao);
        System.out.println("Agilidade: " + agilidade);
    }
}
