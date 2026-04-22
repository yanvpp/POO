# Anotações

<details>
<summary>Clique aqui para expandir</summary>


## Modelando entidades e relacionamentos
```mermaid
classDiagram
    class Livro{
        - isbn: String
        - titulo: String
        - idioma: String
        - ano: int
        - editora: String
        - cidadeEditora: String
        - autores: ArrayList~String~
        - edicao: int
        - paginas: int
    }
```
> mas, nem todos os atributos são somente do livro 

```mermaid
classDiagram
    direction LR

    Livro"1" *-- "1..*"Edicao
    Edicao"1..*" o-- "1..*"Editora
    Edicao"1..*" o-- "1..*"Autor

    class Livro{
        - idLivro: int
        - edicoes: ArrayList~Edicao~
        - titulo: String
    }

    class Edicao{
        - edicao: int
        - isbn: String
        - idioma: String
        - ano: int
        - editora: Editora
        - autores: ArrayList~Autor~
        - paginas: int
    }

    class Editora{
        - idEditora: int
        - cidade: String
        - nome: String
    }

    class Autor{
        - idAutor: int
        - nome: String
    }
```
</details>

## Princípio da responsabilidade única
> Separation of Concerns (SoC)
> --> Facilita a manutenção

### Sistema para Gestão de Agenda Telefônica
```mermaid
classDiagram
    direction TB

    App ..> Contato
    App *-- AgendaTelefonica
    AgendaTelefonica"1" *-- "0..*"Contato
    Contato"1" *-- "0..*"Telefone
    Contato"1" *-- "0..*"Email

    class App{
        - agenda: Agenda
        + main()
        + menu()
    }

    class AgendaTelefonica{
        - contatos: ArrayList~Contato~
        + Agenda()
        + addContato(contato: Contato) boolean
        + findContato(nome: String, sobrenome: String) ArrayList~Contato~
        + removeContato(nome: String) boolean
        + addTelefone(numero: int, label: String) boolean
        + removeTelefone(numero: int) boolean
        + updateTelefone(numero: int, label: String) boolean
        + addEmail(endereco: String, label: String) boolean
        + removeEmail(endereco: String) boolean
        + updateEmail(endereco: String, label: String) boolean
        + toString() String
    }

    class Contato{
        - nome: String
        - sobrenome: String
        - birthDate: LocalDate
        - telefones: ArrayList~Telefone~
        - emails: ArrayList~Emails~
        + Contato(nome: String, sobrenome: String, birthDate: LocalDate)
        + addTelefone(numero: int, label: String) boolean
        + removeTelefone(numero: int) boolean
        + updateTelefone(numero: int, label: String) boolean
        + addEmail(endereco: String, label: String) boolean
        + removeEmail(endereco: String) boolean
        + updateEmail(endereco: String, label: String) boolean
        + toString() String
    }

    class Telefone{
        - numero: int
        - label: String
        + Telefone(numero: int, label: String)
        + toString(): String
    }

    class Email{
        - endereco: String
        - label: String
        + Email(endereco: String, label: String)
        + toString() String
    }
```