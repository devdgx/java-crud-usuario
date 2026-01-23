# 🟢 Java CRUD de Usuários

[![Java](https://img.shields.io/badge/Java-17+-blue?style=for-the-badge&logo=java)](https://www.java.com/)
[![GitHub](https://img.shields.io/badge/GitHub-Project-black?style=for-the-badge&logo=github)]
[![License](https://img.shields.io/badge/License-MIT-green?style=for-the-badge)]

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
