public class MyArrayList implements MyArrayListTad {

    // VARIÁVEIS DE ESTADO (Encapsuladas com 'private')
    private int[] items;    // O array real na memória que vai guardar os números.
    private int capacity;   // O tamanho MÁXIMO do array (quantas "cadeiras" existem).
    private int count;      // Quantos elementos REALMENTE estão lá (quantas "cadeiras" estão ocupadas).

    // CONSTRUTOR: Chamado quando fazemos "new MyArrayList(tamanho)"
    public MyArrayList(int size) {
        this.capacity = size;             // Define a capacidade máxima
        this.items = new int[capacity];   // Cria o array físico na memória com esse tamanho
        this.count = 0;                   // Começa com 0 itens inseridos
    }

    // --- MÉTODOS DE INSERÇÃO ---

    @Override
    public void addFirst(int newItem) {
        for (int i = count; i > 0; i--) {
            items[i] = items[i - 1];
        }
        items[0] = newItem;
        count++;
    }

    @Override
    public void addLast(int newItem) {

        items[count++] = newItem;
    }

    @Override
    public void insertAt(int index, int newItem) {

        if ( index < 0 || index > count) {
            System.out.println("Erro\nIndice não existe ou array completa");
            return;
        }
        count++;

        for (int i = count - 1; i > index; i--) {

            items[i] = items[i - 1];
        }
        items[index] = newItem;
    }

    // --- MÉTODOS DE REMOÇÃO ---


    @Override
    public void removeFirst() {
        for (int i = 0; i < count - 1; i++) {
            items[i] = items[i + 1];
        }
        count--;
    }

    @Override
    public void removeLast() {
        count--;
    }

    @Override
    public void removeAt(int index) {
        if (index < 0 || index >= count) {
            System.out.println("Erro\nIndice não existe ou array vazia");
            return;
        }
        for (int i = index; i < count - 1; i++) {
            items[i] = items[i + 1];
        }
        count--;
    }

    @Override
    public void remove(int item) {
        int index = -1;
        for (int i = 0; i < count; i++) {
            if (items[i] == item) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            System.out.println("Item não encontrado");
            return;
        }
        for (int j = index; j < count - 1; j++) {
            items[j] = items[j + 1];
        }
        count--;
    }

    // --- MÉTODOS DE BUSCA E ATUALIZAÇÃO ---

    @Override
    public int find(int item) {
        for (int i = 0; i < count; i++) {
            if (items[i] == item) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public int get(int index) {
        return items[index];
    }

    @Override
    public void set(int index, int item) {
        // Atualiza um valor diretamente na posição especificada
        if (index < 0 || index >= count) {
            System.out.println("Erro! \nIndice invalido");
            return;
        }
        items[index] = item;
    }

    // --- EXIBIÇÃO ---

    @Override
    public void display() {
        System.out.print("[ ");
        for (int i = 0; i < count; i++) {
            System.out.print(items[i] + " ");
        }
        System.out.print("]");
        System.out.println();
    }
}