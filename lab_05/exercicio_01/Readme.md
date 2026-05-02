# Sistema de comércio eletrônico
> Um produto tem uma descrição, um preço e uma quantidade em estoque. Um cliente tem um nome, um e-mail e um ou mais endereços de entrega. Um cliente pode fazer um ou mais pedidos. Um pedido tem uma data, uma situação (pendente, pago, entregue, cancelado), um ou mais produtos, sendo que cada produtotem uma quantidade e um preço unitário.
```mermaid
classDiagram
    direction TB

    Endereco"1..*" --* "1"Cliente
    Cliente"1" *-- "0..*"Pedido
    Pedido"1" o-- "0..*"Produto

    class Produto {
        - id: int$
        - descricao: String
        - preco: double
        - qtdEstoque: int
        + Produto(descricao: String, preco: double, qtdEstoque: int)
        + getID() int
        + getEstoque() int
        + toString() String
    }

    class Cliente {
        - nome: String
        - email: String
        - enderecos: ArrayList~Endereco~
        - pedidos: ArrayList~Pedido~
        + Cliente(nome: String, email: String)
        + addEndereco(cep: String, logradouro: String, numero: int, complemento: String) boolean
        + removeEndereco(cep: String, logradouro: String, numero: int, complemento: String) boolean
        + criaPedido(data: LocalDate, situacao: String) boolean
        + apagarPedido(idPedido: int) boolean
        + addProdutoNoPedido(idPedido: int, idProduto: int, quantidade: int) boolean
        + removeProdutoNoPedido(idPedido: int, idProduto: int, quantidade: int) boolean
        + toString() String
    }
            
    class Endereco {
        - cep: String
        - logradouro: String
        - numero: int
        - complemento: String
        + Endereco(cep: String, logradouro: String, numero: int, complemento: String)
        + getCep() String
        + getLogradouro() String
        + getNumero() String
        + toString() String
    }
                
    class Pedido {
        - id: int$
        - data: LocalDate
        - situacao: String
        - pedido: HashMap~Produto, Integer~
        - produtos: ArrayList~Produto~
        + Pedido(data: LocalDate, situacao: String)
        + getID() int
        + getItem() String
        + addProduto(idProduto: int, quantidade: int) boolean
        + removeProduto(idProduto: int, quantidade: int) boolean
        + toString() String
    }
```