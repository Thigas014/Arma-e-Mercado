package teste;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Item {
    private Produto produto;
    private double quantidade;

    public Item(Produto produto, double quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }

    public Produto getProduto() {
        return produto;
    }

    public double getQuantidade() {
        return quantidade;
    }
    

    public double getValor() {
        BigDecimal quantidade = BigDecimal.valueOf(getQuantidade());
        BigDecimal preco = BigDecimal.valueOf(produto.getPreco());
        //arredonda para cima com 2 casas
        BigDecimal valor = quantidade.multiply(preco).setScale(2,RoundingMode.HALF_UP);
        
        return valor.doubleValue();
        
    }
}