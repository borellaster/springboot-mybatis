# Nome do Projeto

Descrição breve do projeto.

## Tecnologias utilizadas

- **Spring Boot**: Para a criação de aplicações web e a estruturação geral do backend.
- **MyBatis**: Usado para mapear objetos Java com instruções SQL.
- **PostgreSQL**: Sistema de gerenciamento de banco de dados relacional.

## Pré-requisitos

Antes de iniciar o projeto, certifique-se de ter as seguintes ferramentas instaladas:

- **Java 11**: Você pode baixar a versão mais recente em [AdoptOpenJDK](https://adoptopenjdk.net/).
- **IntelliJ IDEA**: IDE recomendada para desenvolvimento. [Download aqui](https://www.jetbrains.com/idea/download/).
- **PostgreSQL**: É necessário ter o PostgreSQL instalado e configurado. [Instruções de instalação](https://www.postgresql.org/download/).

## Configuração do ambiente

1. **Clonar o projeto**: 

2. **Configurar PostgreSQL**:

Após instalar o PostgreSQL, crie uma base de dados e ajuste as configurações no arquivo `src/main/resources/application.properties`.

`spring.datasource.url=jdbc:postgresql://localhost:5432/nomedobanco`

`spring.datasource.username=seu_usuario`

`spring.datasource.password=sua_senha`


3. **Importar o projeto no IntelliJ**:

Abra o IntelliJ e selecione "Import Project". Navegue até o diretório clonado e selecione o arquivo `pom.xml`. Isso iniciará o processo de importação do projeto Maven.

## Como rodar o projeto

1. **Dentro do IntelliJ**:

Acesse a classe principal (geralmente nomeada `NomeDoProjetoApplication.java`) e clique no botão de play verde ao lado da declaração da classe principal. Isso iniciará o servidor Tomcat embutido e o projeto começará a rodar.

2. **Usando Maven**:

No terminal, navegue até o diretório do projeto e execute:


## Endpoints

[Liste aqui os principais endpoints da sua API, caso seja relevante.]

## Contribuições

Instruções sobre como contribuir para o projeto, se aplicável.

## Licença

Informações sobre a licença, se aplicável.

## Contato e autores

Informações de contato dos autores e contribuidores.

