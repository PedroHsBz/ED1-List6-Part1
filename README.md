# Estrutura de dados
# ID1-List6-Part1

Este repositório contém a implementação do TAD Lista Sequencial em Java, atividade integrante da disciplina de Estrutura de Dados I. O projeto consiste no desenvolvimento da classe MyArrayList baseada em arrays, com foco no aprendizado da manipulação de índices, lógica de deslocamento de elementos (shift) e controle dinâmico de capacidade.

---

## 📚 Exercícios

O objetivo principal desta atividade é criar uma estrutura do zero onde os elementos permaneçam organizados sequencialmente na memória, garantindo integridade e ausência de "buracos" no array.

### A classe MyArrayList implementa as seguintes operações fundamentais:
- **➕ Inserção (Shift Right)**
- addFirst(elemento): Insere um dado no início da lista, deslocando todos os elementos pré-existentes uma casa para a direita.
- addLast(elemento): Insere o elemento na primeira posição livre ao final da lista.
- insertAt(index, elemento): Insere um elemento em um índice específico, realizando o deslocamento necessário à direita a partir daquela posição.

- **➖ Remoção (Shift Left)**
- removeFirst(): Remove o primeiro dado da lista, deslocando os demais elementos uma casa para a esquerda.
- removeLast(): Remove o último elemento inserido.
- removeAt(index): Remove o elemento de uma posição específica e desloca os subsequentes para a esquerda para manter a continuidade.
- remove(elemento): Localiza e remove a primeira ocorrência do valor informado.

- **🔍 Busca e Atualização**
- find(elemento): Vasculha a lista e retorna o índice onde o elemento foi encontrado.
- get(index): Retorna o valor alocado no índice solicitado.
- set(index, elemento): Substitui o dado existente em um índice específico por um novo valor.

- **🛠️ Utilitários**
- display(): Exibe de forma formatada o estado atual da lista, quantidade de itens e a capacidade do array.
- Controle de Capacidade: Lógica interna para gerenciar o tamanho do array base (e redimensioná-lo, caso aplicável).

---

## 🚀 Recursos Implementados

O projeto inclui:

- Código em Java puro (sem frameworks).
- Organização por exercício, onde cada classe lida com uma operação fundamental de TAD Listas.
- Lógica de simulação de tamanho variável (alocação e cópia de memória).
- Exercícios focados em busca e manutenção da ordem em uma coleção de dados.
- Algoritmos de interação entre múltiplas coleções de dados.

---

## 🧩 Estrutura de Pastas

```text
├── src/
│   └── MyArrayList.java
```

## 🛠️ Pré-requisitos

Antes de compilar/rodar, você precisa ter:

- **Java JDK 11+** instalado
- Uma IDE ou editor de código (IntelliJ)

## 💻 Executar o exercício
- MyArrayList.java

