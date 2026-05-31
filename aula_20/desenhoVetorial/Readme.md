# Aplicativo para desenho vetorial 2D

```mermaid
classDiagram

FormaGeometrica *-- Ponto
FormaGeometrica <|-- FormaComArea
FormaGeometrica <|-- Linha
Ponto --* Linha
FormaComArea <|-- Circulo
Ponto --* Retangulo
FormaComArea <|-- Retangulo

class FormaGeometrica {
    <<Abstract>>
    # corLinha : String
    # pontoInicial : Ponto
    + FormaGeometrica(corLinha: String, pontoInicial: Ponto)*
    + desenhar() String*
}

class FormaComArea {
    <<Abstract>>
    # corPreenchimento : String
    + FormaComArea(corDePreenchimento: String)*
    + calcularArea() String*
    + calcularPerimetro() String*
}

class Ponto {
    - x : double
    - y : double
    + Ponto(x: double, y: double)
    + toString() String
}

class Linha {
    - pontoFinal : Ponto
    + Linha(final: Ponto)
    + desenhar() String
}

class Circulo {
    - raio : double
    + Circulo(raio: double)
    + desenhar() String
}

class Retangulo {
    - largura : double
    - altura : double
    + Retangulo(final: Ponto)
    + desenhar() String
}

```