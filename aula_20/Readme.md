# Conversão de tipos (typecasting)

> Operador ```instanceof``` serve para verificar o tipo de um objeto

<details>
<summary>exemplo de código com instanceof</summary>
```Java
    Telefone produtos[] = new Telefone[3];
    produtos[0] = new Telefone();
    produtos[1] = new SemFio();
    produtos [2] = new Celular();

    for (Telefone t : produtos) {
        if (t instanceof Celular c) {
            String sistemaOperacional = c.getSistemaOperacional();
            System.out.println("Celular com SO: " + sistemaOperacional);
        }
    }
```
</details>

