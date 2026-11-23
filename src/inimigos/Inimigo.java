package inimigos;
import personagens.Personagem;

public class Inimigo extends Personagem {

    // Atributo exclusivo dos inimigos
    private int defesaMagica;

    // Construtor
    public Inimigo(String nome, int hp, int ataque, int defesa, int defesaMagica) {
        super(nome, hp, ataque, defesa);
        this.defesaMagica = defesaMagica;
    }

    // Getter
    public int getDefesaMagica() {
        return defesaMagica;
    }

    // Método para receber dano mágico
    public void receberDanoMagico(int dano) {
        int danoFinal = dano - defesaMagica;

        if (danoFinal < 0) {
            danoFinal = 0;
        }

        receberDano(danoFinal);
    }

    // Exibição dos dados
    @Override
    public void exibirDados() {
        super.exibirDados();

        System.out.println("Defesa mágica: " + defesaMagica);
    }
}
