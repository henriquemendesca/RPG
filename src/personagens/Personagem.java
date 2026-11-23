package personagens;

public class Personagem {
    private String nome;
    private int hp;
    private int ataque;
    private int defesa;

    public Personagem(String nome, int hp, int ataque, int defesa) {
        this.nome = nome;
        this.hp = hp;
        this.ataque = ataque;
        this.defesa = defesa;
    }

    public String getNome() {
        return nome;
    }

    public int getHp() {
        return hp;
    }

    public int getAtaque() {
        return ataque;
    }

    public int getDefesa() {
        return defesa;
    }

    public void receberDano(int dano) {
        hp -= dano;

        if (hp < 0) {
            hp = 0;
        }
    }

    public int calcularDanoFisico(Personagem alvo) {
        int dano = getAtaque() - alvo.getDefesa();

        if (dano < 0) {
            dano = 0;
        }

        return dano;
    }

    public void atacar(Personagem alvo) {
        int dano = calcularDanoFisico(alvo);

        alvo.receberDano(dano);

        System.out.println(nome + " atacou " + alvo.getNome());
        System.out.println("Dano causado: " + dano);
        System.out.println("Vida restante de " + alvo.getNome() + ": " + alvo.getHp());
    }

    public void usarHabilidade(Personagem alvo) {
        atacar(alvo);
    }

    public boolean estaVivo() {
        return hp > 0;
    }

    public void exibirDados() {
        System.out.println("===== DADOS DO PERSONAGEM =====");
        System.out.println("Nome: " + nome);
        System.out.println("HP: " + hp);
        System.out.println("Ataque: " + ataque);
        System.out.println("Defesa: " + defesa);
        System.out.println("===============================");
    }
}
