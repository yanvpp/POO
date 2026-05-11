# Herança

> Use herança quando diferentes classes precisam compartilhar características e comportamentos comuns, mas também possuem particularidades

- Herança permite criar novas classes a partir de classes já existentes, facilitando o desenvolvimento de sistemas complexos
- A subclasse (ou classe filha) herda os atributos da classe (classe pai)

## Exemplo: Sistema para cadastro de produtos

```mermaid
classDiagram
direction TB

    Telefone"1" *--> "1"Dimensao
    Telefone <|-- SemFio
    SemFio"1" *--> "1"Dimensao

    class Telefone {
        - codigo : int
        - numSerie : String
        - modelo : String
        - peso : double
        - dimensao : Dimensao
        + Telefone(c: int, n: String, m: String, p: double. d: Dimensao)
        + toString() String
    }

    class Dimensao {
        - altura : double
        - largura : double
        - profundidade : double
        + Dimensao(a: double, l: double, p: double)
        + toString() String
    }

    class SemFio {
        - frequencia : double
        - canais : int
        - distanciaOperacao : double
        + SemFio(c: int, n: String, m: String, p: double. d: Dimensao, f: double, ca: int, dist: double)
        + toString() String
    }
```

## Membros protegidos
- Protected apresenta uma restrição intermediária entre o private e o público


## Exercícios em sala

### Exercício 1
```mermaid
classDiagram

    Pessoa <|-- Aluno
    Pessoa <|-- Professor
    Professor <|-- Coordenador
    Pessoa <|-- Diretor

    Professor o-- Disciplina
    Coordenador o-- Disciplina

    class Pessoa {
        id : int
        nome : String
    }

    class Aluno {
        matricula : int
    }

    class Professor {
        disciplinas : ArrayList~Disciplina~
    }

    class Disciplina {
        nome : String
    }

    class Coordenador{
        funcao : String
    }

    class Diretor {
        - vigencia : int
    }
```

### Exercício 2
```mermaid
classDiagram

    Obra <|-- Livro
    Obra <|-- Jornal


    Jornal <|-- Revista
    Jornal <|-- Gibi

    class Obra {

    }

    class Livro {
        isbn : String
        titulo : String
    }

    class Revista {
        
    }

    class Jornal {
        issn : String
    }

    class Gibi {

    }
```

### Exercício 3
```mermaid
classDiagram

    MeioTransporte <|-- Ar
    MeioTransporte <|-- Terra
    MeioTransporte <|-- Agua

    Ar <|-- Aviao
    Terra <|-- Carro
    Terra <|-- Caminhao
    Agua <|-- Barco

    class MeioTransporte {
        - velocidadeAtual : int
        + acelerar(n : int) boolean
    }

    class Ar {
        - altitudeMaxima : int
    }

    class Terra {

    }

    class Agua {
        - capacidadeDoLastro : int
    }

    class Carro {

    }

    class Aviao {

    }

    class Barco {

    }

    class Caminhao {

    }
```

### Exercício 4
```mermaid
classDiagram

    Animal <|-- Mamifero
    Animal <|-- Ave
    Animal <|-- Peixe
    Mamifero <|-- Gato
    Mamifero <|-- Cachorro
    Mamifero <|-- Baleia
    Ave <|-- Arara
    Ave <|-- Galinha
    Peixe <|-- Tubarao

    class Animal {

    }

    class Mamifero {

    }

    class Ave {

    }

    class Peixe {

    }

    class Gato {

    }

    class Cachorro {

    }

    class Arara {

    }

    class Galinha {

    }

    class Baleia {

    }

    class Tubarao {

    }
```