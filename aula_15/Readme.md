# Diagrama de classes UML

## Primeiro
```mermaid
classDiagram
    direction LR

    class Retangulo{
        - int altura
        - int largura
        + Retangulo(int a, int l)
        + getArea() int
    }
```

## Segundo

```mermaid
classDiagram
    direction LR

    Carro"1"-->"3..4"Roda
    Carro"1"o--"1"Motor

    class Carro{
        - marca: String
        - propulsor: Motor
        + Carro()
        + acelerar(v: int): void
    }
    
    class Motor{
        - hp: int
        - giroAtual: int
        - clindros: int
        + Motor()
        + acelerar(v:int): void
    }

    class Roda{
        - diamentro: double
        - material: String
        - calibragem: double
        + Roda()
    }
```

```mermaid
classDiagram
    direction LR

    Livro"1" o-- "1..*"Pessoa
    Livro"1" *-- "1..*"Capitulo

    class Pessoa{
        - nome String
    }

    class Livro{
        - titulo: String
        - autor: ArrayList~Pessoa~
        - capitulos: ArrayList~Capitulo~
        + Livro(titulo: String, autor: Pessoa)
        + adicionaCapitulo(titulo: String): void
    }

    class Capitulo{
        - titulo: String
        + Capitulo(titulo: String)
    }