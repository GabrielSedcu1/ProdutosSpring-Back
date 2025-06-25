📦 Product API - Backend

Este é o backend do projeto **Product API**, desenvolvido com **Spring Boot** e **MySQL**. Ele fornece uma API RESTful para gerenciar produtos — ideal para sistemas de catálogo, estoque ou e-commerce.

🔗 Repositório: [ProdutosSpring-Back](https://github.com/GabrielSedcu1/ProdutosSpring-Back.git)

---

🚀 Tecnologias Utilizadas

✅ Java 21  
✅ Eclipse IDE  
✅ Postman  
✅ MySQL (Workbench ou HeidiSQL)  
✅ Lombok  
✅ Maven  

📦 Dependências

✅ Spring Boot DevTools  
✅ Spring Web  
✅ Spring Data JPA  
✅ MySQL Driver  
✅ Lombok  

---

⚙️ Como rodar o projeto localmente

### ✅ Pré-requisitos

- MySQL instalado e configurado  
- IDE (Eclipse, IntelliJ ou VSCode)  
- Lombok configurado na IDE  
- Postman (ou Insomnia) para testar a API  

### ▶️ Passos para rodar:

1. Clone o repositório:
```bash
git clone https://github.com/GabrielSedcu1/ProdutosSpring-Back.git
cd ProdutosSpring-Back
Crie o banco de dados no MySQL:

sql
Copiar
Editar
CREATE DATABASE spring;
Abra o projeto em sua IDE, aguarde o Maven instalar as dependências e execute a classe ProductApiApplication (ou similar) para iniciar o servidor.

A aplicação estará disponível em:
👉 http://localhost:9090

📁 Estrutura de Pastas

css
Copiar
Editar
src
├── main
│   ├── java
│   │   └── com.live.codiguin.Spring
│   │       ├── controllers
│   │       │   └── ProductController.java
│   │       ├── domain_product
│   │       │   ├── Product.java
│   │       │   ├── RequestProduct.java
│   │       │   └── ProductRepository.java
│   └── resources
│       ├── application.properties
│       └── static/
└── test
🧪 Testes com Postman

📌 Listar produtos
GET
http://localhost:9090/product

➕ Cadastrar produto
POST
http://localhost:9090/product

Body (JSON):

json
Copiar
Editar
{
  "name": "Produto Exemplo",
  "priceInCents": 2500
}
✏️ Atualizar produto
PUT
http://localhost:9090/product

Body (JSON):

json
Copiar
Editar
{
  "id": "1",
  "name": "Produto Atualizado",
  "priceInCents": 3000
}
❌ Deletar produto
DELETE
http://localhost:9090/product/1

📚 Referência

Projeto desenvolvido com base nas melhores práticas do ecossistema Spring Boot, ideal para estudos, portfólio e aplicações reais.

🎥 Vídeo Sugerido
Como criar uma aplicação Fullstack com Java e React - Fernanda Kipper
