# Biblioteca Java Classificação e Ordenação de Livros

Este projeto é um mini-sistema de biblioteca em Java que permite:

Adicionar livros à coleção.
Ordenar os livros pelo número de páginas usando Bubble Sort (implementação manual).
Classificar os livros em quatro faixas de quantidade de páginas:
 Pequenos (até 100 páginas)
 Médios (101 a 300 páginas)
 Grandes (301 a 600 páginas)
 Gigantes (acima de 600 páginas)
 Buscar livros por título ou autor (filtro por substring, ignorando maiúsculas/minúsculas).

## Tecnologias

- Java 17+
- ArrayList
- Record (para representar livros)

## Como executar

1. Compile o arquivo `BibliotecaApp.java`:
   ```
   javac BibliotecaApp.java
   ```
2. Execute o programa:
   ```
   java BibliotecaApp
   ```

## Funcionalidades

 **Adicionar livros**: Os livros são adicionados diretamente no código, mas podem ser adaptados para entrada do usuário.
 **Ordenação**: Os livros são ordenados por páginas usando Bubble Sort.
 **Classificação por faixas**: Os livros são agrupados conforme a quantidade de páginas.
 **Busca**: É possível buscar livros por título ou autor.

## Exemplo de saída

 Lista ordenada por páginas.
 Livros agrupados por faixa de páginas.
 Exemplos de busca por autor e título.

## Estrutura

 `Livro`: Record que representa um livro.
 `Biblioteca`: Classe que gerencia a coleção de livros e oferece métodos utilitários.
 `BibliotecaApp`: Classe principal com exemplos de uso.

---

Projeto acadêmico para prática de algoritmos, estruturas de dados e manipulação de listas em Java.
