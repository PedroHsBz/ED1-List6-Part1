import java.util.Scanner;

public class MyArrayList {

    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        int[] origenArray = {10, 20, 30, 40, 50};
        int[] modifArray = new int[origenArray.length];

        System.out.println("Lista inicial:");
        display(origenArray);
        System.out.println();

        System.out.println("--- addFirst, addLast, insertAt ---");
        System.out.println("Digite o número para o (addFirst, addLast, insertAt): ");
        int number = sc.nextInt();
        System.out.println("Digite o indice para o (insertAt): ");
        int indice = sc.nextInt();

        System.out.print("addFirst: ");
        modifArray = addFirst(origenArray, number);
        display(modifArray);

        System.out.print("addLast: ");
        modifArray = addLast(origenArray, number);
        display(modifArray);

        System.out.print("insertAt: ");
        modifArray = insertAt(origenArray, indice, number);
        display(modifArray);
        System.out.println();


        System.out.println("--- removeFirst, removeLast, removeAt, remove ---");
        System.out.println("Digite o número para o (remover): ");
        number = sc.nextInt();
        System.out.println("Digite o indice para o (removeAt): ");
        indice = sc.nextInt();

        modifArray = removeFirst(origenArray);
        display(modifArray);
        modifArray = removeLast(origenArray);
        display(modifArray);
        modifArray = removeAt(origenArray,indice);
        display(modifArray);
        modifArray = remove(origenArray,number);
        display(modifArray);
        System.out.println();

        System.out.println("--- find, get ---");
        System.out.println("Digite o número para o (find): ");
        number = sc.nextInt();
        System.out.println("Digite o indice para o (get): ");
        indice = sc.nextInt();

        System.out.println("Índice encontrado (find): " + find(origenArray, number));
        System.out.println("Valor no índice (get): " + get(origenArray, indice));
        System.out.println();

        System.out.println("--- set ---");
        number = sc.nextInt();
        System.out.println("Digite o indice para o (set): ");
        indice = sc.nextInt();
        modifArray = set(origenArray, indice, number);
        display(modifArray);
    }

    public static void display(int[] array) {
        for (int j : array) {
            System.out.print(j + " ");
        }
        System.out.println();
    }

    public static int[] addFirst(int[] array, int number) {
        int[] novoArray = new int[array.length + 1];
        novoArray[0] = number;

        for (int i = 0; i < array.length; i++) {
            novoArray[i + 1] = array[i];
        }

        return novoArray;
    }
    public static int[] addLast(int[] array, int number) {
        int[] novoArray = new int[array.length + 1];
        novoArray[array.length]=number;
        for (int i = 0; i < array.length; i++){
            novoArray[i] = array[i];
        }
        return novoArray;
    }

    public static int[] insertAt(int[] array, int indice, int number) {
        int[] novoArray = new int[array.length + 1];
        for (int i = 0; i < indice; i++) {
            novoArray[i] = array[i];
        }
        novoArray[indice] = number;
        for (int i = indice; i < array.length; i++) {
            novoArray[i + 1] = array[i];
        }
        return novoArray;
    }

    public static int[] removeFirst(int[] array) {
        int[] novoArray = new int[array.length - 1];
        for (int i = 0; i < novoArray.length; i++) novoArray[i] = array[i + 1];
        return novoArray;
    }

    public static int[] removeLast(int[] array) {
        int[] novoArray = new int[array.length - 1];
        for (int i = 0; i < novoArray.length; i++) novoArray[i] = array[i];
        return novoArray;
    }

    public static int[] removeAt(int[] array, int indice) {

        int[] novoArray = new int[array.length - 1];

        for (int i = 0; i < indice; i++) {
            novoArray[i] = array[i];
        }
        novoArray[indice] = 0;
        for (int i = indice; i < novoArray.length; i++) novoArray[i] = array[i + 1];

        return novoArray;
    }
    public static int[] remove(int[] array, int number) {

        int[] novoArray = new int[array.length - 1];
        int indice=0;
        for (int i = 0; i < array.length; i++) {
            if(array[i]==number){
                indice = i;
                break;
            }
            novoArray[i]=array[i];
        }
        for (int i = indice; i < novoArray.length; i++) novoArray[i] = array[i + 1];

        return novoArray;
    }

    public static int find(int[] array, int number){
        int indice = 0;
        for (int i =0; i< array.length; i++){
            if (array[i]==number) {
                indice = i;
                break;
            }
        }
        return indice;
    }
    public static int get(int[] array, int indice){
        return array[indice];
    }

    public static int[] set(int[] array, int indice, int number){
        array[indice]=number;
        return array;
    }
}
