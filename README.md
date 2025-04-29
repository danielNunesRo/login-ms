# API de Login e Autenticação

Esta é uma API simples de Login e Autenticação, desenvolvida com Spring Boot, que oferece dois endpoints principais: **/auth/register** e **/auth/login**. A API permite o registro de novos usuários e o login para usuários existentes.

## Endpoints

### 1. **POST /auth/register**

Este endpoint permite o registro de novos usuários. Ele espera um JSON com as informações do usuário, como login, senha, role, e outros dados pessoais.

#### Exemplo de Request:
```json
{
	"login": "adm.teste",
	"password": "test",
	"role": "ADMIN",
	"email": "tess@gmail.com",
	"cpf": "123456789+11",
	"cep": "0454521252"
}
```

### 2. **POST /auth/login**
  Este endpoint permite que usuários já registrados realizem o login. O usuário deve fornecer o login e a senha.

  #### Exemplo de Request:
```json
{
	"login": "adm.teste",
	"password": "test"
}
```
