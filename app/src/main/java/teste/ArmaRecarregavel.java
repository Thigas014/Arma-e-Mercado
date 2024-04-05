package teste;


class ArmaRecarregavel extends ArmaLancavel {
    protected int quantidadeProjeteis;

    public ArmaRecarregavel(String nome, int danoMaximo, int chanceDeAcerto, int quantidadeProjeteis) {
        super(nome, danoMaximo, chanceDeAcerto);
        this.quantidadeProjeteis = quantidadeProjeteis;
    }

    public int getProjeteis() {
        return quantidadeProjeteis;
    }

    @Override
    public int disparar() {
        if (quantidadeProjeteis > 0) {
            quantidadeProjeteis--;
            return super.disparar();
        } else {
            return 0;
        }
    }

}


