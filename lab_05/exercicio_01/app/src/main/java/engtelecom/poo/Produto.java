package engtelecom.poo;

public class Produto {
    private int id;
    private String descricao;
    private double preco;
    private int qtdEstoque;

    private static int incrementador = 1;

    public Produto(String descricao, double preco, int qtdEstoque) {
        this.descricao = descricao;
        this.preco = preco;
        this.qtdEstoque = qtdEstoque;

        this.id = incrementador;
        incrementador++;
    }

    public String getDescricao(){
        return descricao;
    }

    public int getID(){
        return id;
    }

    public int getEstoque(){
        return qtdEstoque;
    }

    public String getItem(){
        return descricao + " R$" + preco + " / unidade";
    }

    public String toString(){
        return String.format("""
                Descrição: %s
                Preco: %.2f
                Em Estoque: %d
                """, descricao, preco, qtdEstoque);
    }
}
