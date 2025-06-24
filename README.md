🚀 Product Manager - Backend
Este é o backend da aplicação Product Manager, que gerencia produtos através de uma API RESTful desenvolvida com Spring Boot e MySQL. Com essa API, é possível adicionar, editar, excluir e listar produtos.

🚀 Tecnologias Utilizadas
Java – Linguagem de programação principal.

Spring Boot – Framework para desenvolvimento rápido de aplicações Java.

MySQL – Banco de dados relacional utilizado para armazenar os dados dos produtos.

Spring Data JPA – Ferramenta para comunicação entre o Spring Boot e o banco de dados MySQL.

📂 Estrutura do Projeto
bash
Copiar
Editar
PRODUCT-MANAGER-BACKEND/
├── src/                   # Código fonte
│   ├── main/
│   │   ├── java/          # Código Java
│   │   │   └── com/
│   │   │       └── example/
│   │   │           └── productmanager/
│   │   │               ├── controller/   # Controladores da API
│   │   │               │   └── ProductController.java
│   │   │               ├── model/        # Modelos de dados
│   │   │               │   └── Product.java
│   │   │               ├── repository/   # Repositórios para interação com o banco de dados
│   │   │               │   └── ProductRepository.java
│   │   │               ├── service/      # Lógica de negócios
│   │   │               │   └── ProductService.java
│   │   │               └── ProductManagerApplication.java # Ponto de entrada do Spring Boot
│   ├── resources/         # Arquivos de configuração
│   │   ├── application.properties # Configurações da aplicação, incluindo banco de dados
├── pom.xml                # Gerenciador de dependências do Maven
└── README.md              # Documentação do projeto
🖥️ Como Usar
Clone o repositório:

bash
Copiar
Editar
git clone <URL-do-repositório>
cd product-manager-backend
Instale o MySQL (caso não tenha o MySQL instalado):

Se você já tem o MySQL instalado, pode criar um banco de dados com o nome product_manager ou qualquer nome que preferir.

Configuração do Banco de Dados:

Edite o arquivo src/main/resources/application.properties para configurar a conexão com o banco de dados MySQL:

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
Compile e execute o projeto:

Para rodar a aplicação, use o Maven ou a IDE de sua preferência:

Usando Maven:

bash
Copiar
Editar
./mvnw spring-boot:run
O servidor será iniciado na porta padrão 8080.

📋 Funcionalidades da API
A API oferece os seguintes endpoints para gerenciar produtos:

POST /api/products – Adiciona um novo produto.

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
GET /api/products – Lista todos os produtos.

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
GET /api/products/{id} – Retorna os detalhes de um produto específico.

Resposta:

json
Copiar
Editar
{
  "id": 1,
  "name": "Produto Exemplo",
  "price": 100.0
}
PUT /api/products/{id} – Atualiza as informações de um produto.

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
DELETE /api/products/{id} – Exclui um produto.

Resposta:

json
Copiar
Editar
{
  "message": "Produto excluído com sucesso!"
}
⚡ Rodando com Docker (Opcional)
Se preferir, você pode rodar o backend utilizando o Docker.

Crie a imagem Docker:

No diretório do projeto, crie a imagem Docker:

bash
Copiar
Editar
docker build -t product-manager-backend .
Rodar o contêiner Docker:

Você pode rodar o contêiner com o seguinte comando (assegurando-se de que as configurações de banco de dados estejam no .env ou no application.properties):

bash
Copiar
Editar
docker run -p 8080:8080 product-manager-backend
