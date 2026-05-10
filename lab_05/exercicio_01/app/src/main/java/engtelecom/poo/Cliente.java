package engtelecom.poo;

import java.util.ArrayList;
import java.time.LocalDate;

public class Cliente {
    private String nome;
    private String email;
    private ArrayList<Endereco> enderecos = new ArrayList<>();
    private ArrayList<Pedido> pedidos = new ArrayList<>();

    public Cliente(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public String getEmail(){
        return email;
    }

    public boolean addEndereco(String cep, String logradouro, int numero, String complemento) {
        if (cep.isBlank() || logradouro.isBlank() || numero <= 0) {
            return false;
        }

        Endereco endereco = new Endereco(cep, logradouro, numero, complemento);

        return enderecos.add(endereco);
    }

    public boolean removeEndereco(String cep, String logradouro, int numero, String complemento) {
        if (cep.isBlank() || logradouro.isBlank() || numero <= 0) {
            return false;
        }

        for (Endereco e : enderecos) {
            if (e.getCep().equals(cep) && e.getLogradouro().equals(logradouro) && e.getNumero() == numero) {
                return enderecos.remove(e);
            }
        }

        return false;
    }

    public boolean criaPedido(LocalDate data, String situacao) {
        if (situacao.isBlank() || data.toString().isBlank()) {
            return false;
        }

        Pedido pedido = new Pedido(data, situacao);

        return pedidos.add(pedido);
    }

    public boolean apagarPedido(int idPedido) {
        if (pedidos.get(idPedido) == null) {
            return false;
        }

        pedidos.remove(idPedido);

        return true;
    }

    public boolean addProdutoNoPedido(int idPedido, int idProduto, int quantidade) {
        if (idPedido <= 0 || idProduto <= 0 || quantidade <= 0) {
            return false;
        }

        for (Pedido e : pedidos) {
            if (e.getID() == idPedido){
                return e.addProduto(idProduto, quantidade);
            }
        }

        return false;
    }

    public boolean removeProdutoNoPedido(int idPedido, int idProduto, int quantidade) {
        if (idPedido <= 0 || idProduto <= 0 || quantidade <= 0) {
            return false;
        }

        for (Pedido e : pedidos) {
            if (e.getID() == idPedido){
                return e.removeProduto(idProduto, quantidade);
            }
        }

        return false;
    }

    @Override
    public String toString() {
        StringBuilder enderecosString = new StringBuilder();
        StringBuilder pedidosString = new StringBuilder();

        if (enderecos.isEmpty()) {
            enderecosString.append("VAZIO");
        } else {
            for (Endereco e : enderecos) {
                enderecosString.append(e.toString());
            }
        }

        if (pedidos.isEmpty()) {
            pedidosString.append("VAZIO");
        } else {
            for (Pedido e : pedidos) {
                pedidosString.append(e.toString());
            }
        }

        return String.format("""
                Nome: %s
                Email: %s
                Endereços:
                %s
                Pedidos:
                %s
                """, nome, email, enderecosString, pedidosString);
    }
}
