package teste;

abstract class Arma {
    protected String nome;
    protected int danoMaximo;

    public Arma(String nome, int danoMaximo) {
        this.nome = nome;
        this.danoMaximo = danoMaximo;
    }

    public abstract int disparar();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDano() {
        return danoMaximo;
    }

    public void setDano(int danoMaximo) {
        this.danoMaximo = danoMaximo;
    }
}
