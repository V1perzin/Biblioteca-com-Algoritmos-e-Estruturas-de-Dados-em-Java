# Biblioteca Java Classificação e Ordenação de Livros

A implementação foi realizada pelos discentes:<br>
• José Miguel dos Santos Neto<br>
• José Luiz Oliveira Cavalcante Teles<br>
• José Matheus de Castro Lima<br>
• Bianca de Moura Lucena<br>
• Samir Freitas dos Santos<br>

## Este projeto é um mini-sistema de biblioteca em Java que permite:

Adicionar livros à coleção.<br>
Ordenar os livros pelo número de páginas usando Bubble Sort (implementação manual).<br>
Classificar os livros em quatro faixas de quantidade de páginas:<br>
 Pequenos (até 100 páginas)<br>
 Médios (101 a 300 páginas)<br>
 Grandes (301 a 600 páginas)<br>
 Gigantes (acima de 600 páginas)<br>
 Buscar livros por título ou autor (filtro por substring, ignorando maiúsculas/minúsculas).<br>

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

 **Adicionar livros**: Os livros são adicionados diretamente no código, mas podem ser adaptados para entrada do usuário.<br>
 **Ordenação**: Os livros são ordenados por páginas usando Bubble Sort.<br>
 **Classificação por faixas**: Os livros são agrupados conforme a quantidade de páginas.<br>
 **Busca**: É possível buscar livros por título ou autor.<br>

## Exemplo de saída

 Lista ordenada por páginas.<br>
 Livros agrupados por faixa de páginas.<br>
 Exemplos de busca por autor e título.<br>

## Estrutura

 `Livro`: Record que representa um livro.<br>
 `Biblioteca`: Classe que gerencia a coleção de livros e oferece métodos utilitários.<br>
 `BibliotecaApp`: Classe principal com exemplos de uso.<br>

---

Projeto acadêmico para prática de algoritmos, estruturas de dados e manipulação de listas em Java.
