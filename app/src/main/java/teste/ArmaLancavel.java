package teste;

import java.util.Random;

class ArmaLancavel extends Arma {
    protected int chanceDeAcerto;
    protected Random random;

    public ArmaLancavel(String nome, int danoMaximo, int chanceDeAcerto) {
        super(nome, danoMaximo);
        this.chanceDeAcerto = chanceDeAcerto;
        this.random = new Random();
    }

    public int getChanceDeAcerto() {
        return chanceDeAcerto;
    }

    public void setChanceDeAcerto(int chanceDeAcerto) {
        this.chanceDeAcerto = chanceDeAcerto;
    }

    @Override
    public int disparar() {
        int num = random.nextInt(100);
        if (num <= chanceDeAcerto) {
            return 50;
        } else {
            return 0;
        }
    }

    public void setRandomGenerator(Random random) {
        this.random = random;
    }
}


