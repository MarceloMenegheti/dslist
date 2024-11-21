

[JAVA_BADGE]:https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white
[SPRING_BADGE]: https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white

<h1 align="center" style="font-weight: bold;">Projeto DSList 💻</h1>

![java][JAVA_BADGE]
![spring][SPRING_BADGE]

# Sobre o projeto

DSList é uma aplicação backend construída durante a 2° edição do **Intensivão Java Spring** (2024), evento organizado pela [DevSuperior](https://devsuperior.com "Site da DevSuperior").

## Modelo conceitual
![Modelo de domínio DSList](https://raw.githubusercontent.com/devsuperior/java-spring-dslist/main/resources/dslist-model.png)

# Tecnologias utilizadas
## Back end
- Java
- Spring Boot
- JPA / Hibernate
- Maven

## Test
- Banco de dados H2

## Perfil de homologação / staging:
- dev
- Banco de dados Postgres de homologação

## Implantação em produção
- Back end: Docker Compose / Heroku
- Banco de dados: Postgresql / H2

## API REST Endpoints
A API fornece os seguintes Endpoints:

```markdown
GET /Games 

GET /Games by id

GET /Games lists 

POST /List receplament
```

# Como executar o projeto

## Back end
Pré-requisitos: Java 21

```bash
# clonar repositório
git clone https://github.com/MarceloMenegheti/dslist.git

# entrar na pasta do projeto back end
cd backend

# executar o projeto
./mvnw spring-boot:run
```

# Autor

Marcelo Eduardo Menegheti
