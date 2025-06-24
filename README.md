🚀 Product Manager - Backend
Bem-vindo ao Product Manager - Backend! ✨ Esta aplicação de backend foi construída com Spring Boot e MySQL para fornecer uma API poderosa e fácil de usar para gerenciar produtos. Agora você pode adicionar, editar, excluir e listar produtos de maneira simples e eficiente! 😎

🛠️ Tecnologias Utilizadas
Java ☕ – A linguagem que dá vida ao seu código.

Spring Boot 🚀 – Framework que simplifica a criação de aplicativos Java.

MySQL 🗃️ – Banco de dados relacional utilizado para armazenar informações dos produtos.

Spring Data JPA 🔄 – Conecta o Spring Boot ao MySQL de forma fácil e eficiente.

📂 Estrutura do Projeto
Aqui está a organização do seu projeto:

bash
Copiar
Editar
PRODUCT-MANAGER-BACKEND/
├── src/                   # Código fonte da aplicação
│   ├── main/
│   │   ├── java/          # Código Java
│   │   │   └── com/
│   │   │       └── example/
│   │   │           └── productmanager/
│   │   │               ├── controller/   # Controladores da API
│   │   │               ├── model/        # Modelos de dados
│   │   │               ├── repository/   # Repositórios para o banco de dados
│   │   │               └── service/      # Lógica de negócios
│   │   └── resources/         # Configurações
├── pom.xml                # Dependências do projeto
└── README.md              # Documentação do projeto
⚡ Começando
Para começar a rodar a aplicação em seu ambiente local, siga os passos abaixo:

Clone o repositório:

bash
Copiar
Editar
git clone <URL-do-repositório>
cd product-manager-backend
Instale o MySQL 🗃️

Certifique-se de ter o MySQL instalado e crie o banco de dados:

sql
Copiar
Editar
CREATE DATABASE product_manager;
Configuração do Banco de Dados 🔧

No arquivo src/main/resources/application.properties, adicione as configurações do seu banco de dados:

properties
Copiar
Editar
spring.datasource.url=jdbc:mysql://localhost:3306/product_manager
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL5InnoDBDialect
Compile e execute a aplicação 🔥

Você pode rodar a aplicação com o Maven:

bash
Copiar
Editar
./mvnw spring-boot:run
O servidor estará rodando na porta 8080 por padrão!

📋 Endpoints da API
Aqui estão as operações principais que você pode realizar com a API de gerenciamento de produtos:

1️⃣ Cadastrar Produto
Método: POST /api/products

Descrição: Adiciona um novo produto.

Requisição:

json
Copiar
Editar
{
  "name": "Produto Exemplo",
  "price": 100.0
}
Resposta:

json
Copiar
Editar
{
  "id": 1,
  "name": "Produto Exemplo",
  "price": 100.0
}
2️⃣ Listar Produtos
Método: GET /api/products

Descrição: Retorna todos os produtos cadastrados.

Resposta:

json
Copiar
Editar
[
  {
    "id": 1,
    "name": "Produto Exemplo",
    "price": 100.0
  }
]
3️⃣ Obter Detalhes de um Produto
Método: GET /api/products/{id}

Descrição: Retorna os detalhes de um produto específico.

Resposta:

json
Copiar
Editar
{
  "id": 1,
  "name": "Produto Exemplo",
  "price": 100.0
}
4️⃣ Editar Produto
Método: PUT /api/products/{id}

Descrição: Atualiza as informações de um produto.

Requisição:

json
Copiar
Editar
{
  "name": "Produto Atualizado",
  "price": 120.0
}
Resposta:

json
Copiar
Editar
{
  "message": "Produto atualizado com sucesso!",
  "product": {
    "id": 1,
    "name": "Produto Atualizado",
    "price": 120.0
  }
}
5️⃣ Excluir Produto
Método: DELETE /api/products/{id}

Descrição: Exclui um produto da base de dados.

Resposta:

json
Copiar
Editar
{
  "message": "Produto excluído com sucesso!"
}
⚙️ Rodando com Docker (Opcional)
Se preferir rodar o backend com Docker, siga estas etapas:

Criar a imagem Docker:

bash
Copiar
Editar
docker build -t product-manager-backend .
Rodar o contêiner Docker:

bash
Copiar
Editar
docker run -p 8080:8080 product-manager-backend
💻 Testando a API com Postman ou Insomnia
Você pode usar ferramentas como Postman ou Insomnia para testar os endpoints da API. Basta enviar as requisições HTTP para http://localhost:8080/api/products.

🔄 Contribuindo
Se você quiser contribuir para o projeto, siga os passos:

Fork o repositório 🍴

Crie uma nova branch para sua feature 🌱

Envie um pull request 🔁

