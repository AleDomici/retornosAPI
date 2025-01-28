# Sistema de Gerenciamento de Produtos

## Como executar o sistema
1. Certifique-se de ter o Java 17+ e o Maven instalados.
2. Clone o repositório.
3. Execute o comando `mvn spring-boot:run` para iniciar o servidor.
4. Acesse os endpoints na URL `http://localhost:8080/api/products`.

## Como executar os testes
1. Execute o comando `mvn test` para rodar os testes unitários e de integração.

## Endpoints
- `POST /api/products` - Cria um novo produto.
- `GET /api/products/{id}` - Retorna um produto pelo ID.
- `PUT /api/products/{id}` - Atualiza um produto existente.
- `DELETE /api/products/{id}` - Remove um produto pelo ID.
