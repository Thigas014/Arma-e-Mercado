package teste;

public class Produto {
    private int codigo;
    private String nome;
    private String unidade;
    private double preco;

    public Produto(int codigo, String nome, double preco, String unidade ) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
        this.unidade = unidade;
        
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public String getUnidade() {
        return unidade;
    }

   

    public double getPreco() {
        return preco;
    }
    


    public void setPreco(double preco) {
        this.preco = preco;
    }
}
