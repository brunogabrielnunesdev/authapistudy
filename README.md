🔐 Auth API - Spring Security (DAO + JWT)

API de autenticação desenvolvida com Spring Boot + Spring Security, utilizando DAO Authentication e JWT para controle de acesso.

📌 Projeto focado em estudo e consolidação de conceitos de autenticação e segurança no backend.

🚀 Tecnologias
Java
Spring Boot
Spring Security
JWT (JSON Web Token)
JPA / Hibernate
PostgreSQL (ou H2 para testes)
⚙️ Funcionalidades
✅ Registro de usuário
✅ Login com email e senha
✅ Geração de token JWT
✅ Rotas protegidas
✅ Autenticação stateless
🧠 Fluxo de autenticação
1. Usuário se registra
2. Usuário faz login
3. Credenciais são validadas (DAO)
4. Token JWT é gerado
5. Cliente envia token no header Authorization
6. Filtro valida o token
7. Acesso liberado às rotas protegidas
🔐 Endpoints
📌 Register

POST /auth/register

{
  "email": "user@email.com",
  "password": "123456"
}

Response:

{
  "message": "User registered successfully"
}
🔑 Login

POST /auth/login

{
  "email": "user@email.com",
  "password": "123456"
}

Response:

{
  "token": "jwt-token-aqui"
}
🔒 Rota protegida (exemplo)

GET /api/me

Header:

Authorization: Bearer SEU_TOKEN
🧪 Como testar

Você pode testar a API utilizando ferramentas como o Postman ou Insomnia.

Passos:
Faça o registro (/auth/register)
Faça login (/auth/login)
Copie o token retornado
Use o token nas rotas protegidas
🗄️ Banco de dados

Tabela principal:

CREATE TABLE users (
    id UUID PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    email VARCHAR(150) NOT NULL UNIQUE,
    password VARCHAR(255) NOT NULL
);
📌 Observações
As senhas são armazenadas utilizando BCrypt
A aplicação não utiliza sessão (stateless)
Projeto sem frontend (API pura)
Focado em entendimento do fluxo de autenticação
💡 Objetivo

Este projeto foi desenvolvido para consolidar conhecimentos em:

Spring Security
Fluxo de autenticação com DAO
Uso de JWT
Estruturação de APIs seguras
🚀 Possíveis melhorias futuras
Refresh Token
Roles (USER / ADMIN)
Tratamento global de exceções
Testes automatizados
Deploy em VPS
👨‍💻 Autor

Desenvolvido para fins de estudo.
