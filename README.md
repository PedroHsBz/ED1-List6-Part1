# Estrutura de dados
# ED1-List6-Part1

Este repositório contém a implementação do TAD Lista Sequencial em Java para números inteiros, atividade integrante da disciplina de Estrutura de Dados I. O projeto consiste na definição de uma interface (`MyArrayListTad`) e no desenvolvimento de sua implementação na classe `MyArrayList` baseada em arrays de tamanho fixo, com foco no aprendizado da manipulação de índices, lógica de deslocamento de elementos (shift) e encapsulamento de dados.

---

## 📚 Exercícios

O objetivo principal desta atividade é criar uma estrutura do zero onde os elementos permaneçam organizados sequencialmente na memória, garantindo integridade e ausência de "buracos" no array.

### A classe MyArrayList implementa as seguintes operações fundamentais da interface MyArrayListTad:

- **➕ Inserção (Shift Right)**
  - `addFirst(int newItem)`: Insere um dado no início da lista, deslocando todos os elementos pré-existentes uma casa para a direita.
  - `addLast(int newItem)`: Insere o elemento na primeira posição livre ao final da lista.
  - `insertAt(int indice, int newItem)`: Insere um elemento em um índice específico, realizando o deslocamento necessário à direita a partir daquela posição.

- **➖ Remoção (Shift Left)**
  - `removeFirst()`: Remove o primeiro dado da lista, deslocando os demais elementos uma casa para a esquerda.
  - `removeLast()`: Remove o último elemento inserido (apenas decrementando o contador de itens).
  - `removeAt(int indice)`: Remove o elemento de uma posição específica e desloca os subsequentes para a esquerda para manter a continuidade.
  - `remove(int item)`: Localiza e remove a primeira ocorrência do valor informado na lista.

- **🔍 Busca e Atualização**
  - `find(int item)`: Vasculha a lista e retorna o índice onde o elemento foi encontrado (ou -1 se não existir).
  - `get(int indice)`: Retorna o valor alocado no índice solicitado.
  - `set(int indice, int newItem)`: Substitui o dado existente em um índice específico por um novo valor.

- **🛠️ Utilitários**
  - `display()`: Exibe de forma formatada na tela o estado atual da lista (ex: `[ 1 2 3 ]`).
  - **Controle de Estado**: Lógica interna para gerenciar a capacidade máxima do array (`capacity`) definida na sua instanciação e a quantidade de elementos reais inseridos (`count`).

---

## 🚀 Recursos Implementados

O projeto inclui:

- Código em Java puro (sem frameworks).
- Uso da interface `MyArrayListTad` para definir o contrato do Tipo Abstrato de Dados (TAD).
- Organização lógica focada no controle de estado interno com variáveis encapsuladas (`private`).
- Lógica de deslocamento de dados no array (shift right e shift left) para as operações de inserção e remoção.
- Tratamento básico de erros com impressões no console para índices inválidos.

---

## 🧩 Estrutura de Pastas

```text
├── src/
│   ├── MyArrayListTad.java
│   └── MyArrayList.java
```

## 🛠️ Pré-requisitos

Antes de compilar/rodar, você precisa ter:

- **Java JDK 11+** instalado
- Uma IDE ou editor de código (como IntelliJ IDEA, Eclipse ou VS Code)

## 💻 Executar o exercício
- MyArrayList.java

