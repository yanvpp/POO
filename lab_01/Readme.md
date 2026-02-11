# Sistema de Controle de Versão

## Configuração inicial para uso do Git

### Configuração de nome de usuário e e-mail no Git

A configuração de nome de usuário e email é necessário para manter controle entre as versões e organização dos commits no Git.

```bash
git config --global user.name "seu nome aqui"
```
```bash
git config --global user.email "seu email aqui"
```

### Criando Personal Access Token (PAT) no GitHub

O PAT é um substituto para a senha de usuário, utilizado para autenticar operações Git via HTTPS ou API.

1. Clique na sua foto do GitHub, no canto superior direito da página, e selecione a opção "Settings"
1. No menu da esquerda, selecione a última opção "Developer Settings"
1. Clique na opção "Personal access tokens" e em "Tokens (classic)"
1. Clique em "Generate new token (classic)"
1. Adicione um nome para facilitar a identificação
1. Ajuste quando o token irá expirar da maneira que achar melhor (se for em um computador pessoal, pode selecionar a opção "No expiration")
1. Em "Select scopes", você seleciona apenas a opção "repo"
1. Por fim, vá até o final da página e selecione "Generate token"
1. Dica final: não precisa deixar o token anotado, ele contém permissões para fazer alterações na sua conta! Caso esqueça, pode gerar um novo clicando no nome dele em azul, ou realizar os passos abaixo para armazenar por quanto tempo desejar no seu computador.

### Salvar em cache as credenciais do PAT

- Para armazenar por 15 minutos:
```bash
git config global credential.helper cache
```

- Para armazenar por 1 hora:
```bash
git config --global credential.helper 'cache = 3600'
```

## Qual a diferença entre git merge e git rebase?

O git merge une as atualizações do repositório remoto com o local, preservando o histórico original e criando um commit de merge.
Já o git rebase, reescreve o hitórico, reposicionando os commits locais acima dos remotos, criando uma linha de tempo linear.