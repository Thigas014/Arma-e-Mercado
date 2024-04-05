package teste;

import java.util.ArrayList;
import java.math.BigDecimal;
import java.math.RoundingMode;


public class Compra {
    private ArrayList<Item> itens;

    public Compra() {
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(Produto produto, double quantidade) {
        itens.add(new Item(produto, quantidade));
    }


    public void removerItem(int codigo) {
        for (int i = 0; i < itens.size(); i++) {
            if (itens.get(i).getProduto().getCodigo() == codigo) {
                itens.remove(i);
                break;
            }
        }
    }

    public Item getItem(int index) {
        return itens.get(index);
    }

    public int contarItens() {
        int totalItens = 0;
        for (Item item : itens) {
            totalItens++;
            if (!item.getProduto().getUnidade().equals("kg")) {
            totalItens += item.getQuantidade() - 1; // Adicionando a quantidade real, descontando 1
        }
    }
    return totalItens;
    }

    public double getTotal() {
        double total = 0;
        for (Item item : itens) {
            total += item.getValor();
        }
    
        // Arredonda o para baixo com 2 casas
        total = new BigDecimal(total).setScale(2, RoundingMode.DOWN).doubleValue();
        
        return total;
    }

}