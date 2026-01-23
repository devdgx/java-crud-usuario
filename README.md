# 🟢 Java CRUD de Usuários

[![Concepts](https://skillicons.dev/icons?i=java)](https://skillicons.dev)

Projeto de estudo desenvolvido em **Java**, que implementa um **CRUD completo de usuários via console**, com foco em **Programação Orientada a Objetos (POO)**, organização de código e boas práticas de desenvolvimento.

---

## 📌 Sobre o Projeto

Este projeto foi criado com o objetivo de consolidar conhecimentos fundamentais de **Java**, simulando um sistema simples de cadastro de usuários, semelhante ao que é utilizado em aplicações reais.

Toda a lógica foi pensada para manter o código **limpo**, **organizado** e **fácil de evoluir**.

---

## ✨ Funcionalidades

| Funcionalidade            | Descrição                                                                  |
|---------------------------|----------------------------------------------------------------------------|
| 🟢 **Adicionar Usuário**   | Cadastra um novo usuário informando nome, e-mail e idade                  |
| 📋 **Listar Usuários**     | Exibe todos os usuários cadastrados                                        |
| ✏️ **Atualizar Usuário**   | Permite atualizar os dados de um usuário existente                        |
| ❌ **Remover Usuário**     | Remove um usuário com base no e-mail                                      |
| ⚠️ **Validação Básica**    | Trata casos como usuário não encontrado e entradas inválidas              |

---

## 🧠 Conceitos Aplicados

- Programação Orientada a Objetos (POO)
- Encapsulamento e uso de getters e setters
- Separação de responsabilidades (Model, Service e Repository)
- Uso de coleções (`List`)
- Validações básicas de dados
- Organização de código em pacotes

---
## 🏗️ Arquitetura

O projeto segue uma arquitetura em camadas, separando responsabilidades:

- **Model**: representação das entidades do domínio
- **Repository**: gerenciamento e acesso aos dados
- **Service**: regras de negócio e validações
- **Application**: ponto de entrada do sistema
---

## 🔄 Fluxo da Aplicação

1. O usuário interage com o menu via console
2. A camada `Service` valida os dados
3. O `Repository` executa as operações de CRUD
4. O sistema retorna mensagens de sucesso ou erro

---

## 🗂️ Estrutura do Projeto

```text
src/
 ├── model/
 │   └── Usuario.java
 ├── repository/
 │   └── UsuarioRepository.java
 ├── service/
 │   └── UsuarioService.java
 └── application/
     └── Main.java
