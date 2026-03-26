// O TAD (Tipo Abstrato de Dados) define as operações que nossa lista deve ter.
// Quem implementar esta interface será OBRIGADO a escrever o código de todos estes métodos.
public interface MyArrayListTad {
    void addFirst(int newItem);             // Adiciona no início
    void addLast(int newItem);              // Adiciona no final
    void insertAt(int indice, int newItem); // Insere em uma posição específica
    void removeFirst();                     // Remove o primeiro item
    void removeLast();                      // Remove o último item
    void removeAt(int indice);              // Remove de uma posição específica
    void remove(int number);                // Busca um número específico e o remove
    int find(int item);                     // Busca um item e retorna o seu índice
    int get(int indice);                    // Retorna o valor que está em um índice
    void set(int indice, int newItem);      // Substitui o valor de um índice
    void display();                         // Imprime a lista na tela
}