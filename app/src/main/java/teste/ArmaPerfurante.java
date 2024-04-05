package teste;


class ArmaPerfurante extends Arma {
    public ArmaPerfurante(String nome, int danoMaximo) {
        super(nome, danoMaximo);
    }

    @Override
    public int disparar() {
        return danoMaximo;
    }
}