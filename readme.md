# TODO List

API para gerenciar tarefas (CRUD) que faz parte de um projeto e desenvolvimento pessoal.

## Tecnologias Utilizadas

- Spring Boot
- Spring MVC
- Spring Data JPA
- SpringDoc OpenAPI 3
- PostgreSQL

## Práticas Adotadas

- SOLID, DRY, KISS
- API REST
- Consultas com Spring Data JPA
- Injeção de Dependências
- Geração Automática do Swagger com a OpenAPI 3

## Como Executar

```bash
# Clonar o repositório
git clone <url-do-repositorio>

# Construir o projeto
./mvnw clean package

# Executar a aplicação
java -jar target/todolist-0.0.1-SNAPSHOT.jar


A API poderá ser acessada em localhost:8080. 
O Swagger poderá ser visualizado em localhost:8080/swagger-ui.html

## Observações

Certifique-se de que o PostgreSQL está rodando e configurado no application.properties.
A aplicação será iniciada na porta padrão 8080.