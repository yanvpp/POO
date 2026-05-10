# Sistema de Reserva de Passagens Aéreas

> Uma companhia aérea oferece voos para diversos destinos. Cada voo tem um número de voo, um destino,
uma data e uma hora de partida, e uma capacidade máxima de passageiros. Os passageiros podem reservar
assentos em um voo, e cada reserva está associada a um único passageiro e a um único voo. Um passageiro
tem um nome, um e-mail e um número de telefone.

```mermaid
classDiagram
direction TB

    App"1" *-- "0..*"CompAerea
    CompAerea"1" *-- "1..*"Voo
    Voo"1" o-- "0..*"Reserva
    Reserva"1" --> "1"Passageiro

    class App {

    }

    class CompAerea {
        - voos: ArrayList~Voo~
        - destinos: ArrayList~Destino~
        + CompAerea()
    }

    class Voo {
        - numVoo: int$
        - destino: Destino
        - data: LocalDate
        - horaPartida: LocalDate
        - capacidadeMaxima: int
        + Voo()
    }

    class Reserva {
        - id: int$
    }

    class Passageiro {
        - nome: String
        - email: String
        - telefone: String
        + Passageiro(nome: String, email: String, telefone: String)
    }

```