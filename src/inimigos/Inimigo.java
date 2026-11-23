package inimigos;
import personagens.Personagem;

public class Inimigo extends Personagem {

    private int defesaMagica;
   
    public Inimigo(String nome, int hp, int ataque, int defesa, int defesaMagica) {
        super(nome, hp, ataque, defesa);
        this.defesaMagica = defesaMagica;
    }

    public int getDefesaMagica() {
        return defesaMagica;
    }

    public void receberDanoMagico(int dano) {
        int danoFinal = dano - defesaMagica;

        if (danoFinal < 0) {
            danoFinal = 0;
        }

        receberDano(danoFinal);
    }

    @Override
    public void exibirDados() {
        super.exibirDados();

        System.out.println("Defesa mágica: " + defesaMagica);
    }
}
