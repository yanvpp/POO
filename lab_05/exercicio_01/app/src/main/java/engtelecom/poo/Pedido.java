package engtelecom.poo;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.ArrayList;

public class Pedido {
    private int id;
    private LocalDate data;
    private String situacao;
    private HashMap<Produto, Integer> pedido = new HashMap<>();
    private ArrayList<Produto> produtos = new ArrayList<>();

    private static int incrementador = 1;

    public Pedido(LocalDate data, String situacao) {
        this.data = data;
        this.situacao = situacao;

        this.id = incrementador;
        incrementador++;
    }

    public int getID() {
        return id;
    }

    public boolean addProduto(int idProduto, int quantidade) {
        if (idProduto <= 0 || quantidade <= 0) {
            return false;
        }

        for (Produto e : produtos) {
            if (e.getID() == idProduto) {
                if (e.getEstoque() >= quantidade) {
                    pedido.put(e, quantidade);
                    return true;
                }
            }
        }
        return false;
    }

    public boolean removeProduto(int idProduto, int quantidade) {
        if (idProduto <= 0 || quantidade <= 0) {
            return false;
        }

        for (Produto e : produtos) {
            if (e.getID() == idProduto){
                pedido.remove(e);
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString(){
        StringBuilder listaProdutos = new StringBuilder();

        if (pedido.isEmpty()){
            listaProdutos.append("VAZIO");
        } else {
            for (Produto e : produtos){
                int quantidade = pedido.get(e);

                listaProdutos.append(quantidade + " " + e.getItem());
            }
        }

        return String.format("""
                --------------
                |   PEDIDO   |
                --------------
                ID: %d
                Data: %s
                Situação: %s
                --------------
                |  PRODUTOS  |
                --------------
                %s
                """, id, data, situacao, listaProdutos);
    }
}