# FrontEnd - Sistema Bibliotecario

Interface administrativa do Sistema Biblioteca UniCuritiba.

## Fluxo principal

- Login interno do administrador.
- Home com indicadores do acervo.
- Catalogo de livros com filtros, estoque e acesso aos detalhes.
- Detalhe do livro com tabela de emprestimos.
- Cadastro de aluno e cadastro de livro pelo menu `Cadastro`.
- Tela de pendencias com alunos em atraso e acao para registrar devolucao/anular multa.

## Integracao com backend

A URL padrao da API e:

```text
http://localhost:8080/api
```

Rotas usadas:

- `GET /livros`
- `POST /livros`
- `PUT /livros/{id}`
- `GET /usuarios`
- `POST /usuarios`
- `GET /emprestimos`
- `GET /emprestimos/atrasados`
- `PUT /emprestimos/{id}/devolver`

## Observacoes

- Quando a API nao envia multa ou devolucao prevista, o frontend calcula a previsao como 14 dias apos o emprestimo e a multa como R$ 2 por dia de atraso.
