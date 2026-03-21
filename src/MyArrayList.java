import java.util.Scanner;

public class MyArrayList {

    public static void main(String[] args) {
        var sc = new Scanner(System.in);

        int[] origenArray = {10, 20, 30, 40, 50};
        int[] modifArray = new int[origenArray.length+1];
        System.out.println("addFirst, addLast, insertAt");
        System.out.println();
        System.out.println("Digite o número para o (addFirst, addLast, insertAt): ");
        int number = sc.nextInt();
        System.out.println("Digite o indice para o (insertAt): ");
        int indice = sc.nextInt();
        modifArray = addFirst(origenArray, number);
        imprimirVetor(modifArray);
        modifArray = addLast(origenArray, number);
        imprimirVetor(modifArray);
        modifArray = insertAt(origenArray, indice, number);
        imprimirVetor(modifArray);
        System.out.println();
        System.out.println("removeFirst, removeLast, removeAt, remove");
        System.out.println("Digite o número para o (remover): ");
        number = sc.nextInt();
        System.out.println("Digite o indice para o (removeAt): ");
        indice = sc.nextInt();
        modifArray = removeFirst(origenArray);
        imprimirVetor(modifArray);
        modifArray = removeLast(origenArray);
        imprimirVetor(modifArray);
        modifArray = removeAt(origenArray,indice);
        imprimirVetor(modifArray);
        modifArray = remove(origenArray,number);
        imprimirVetor(modifArray);
        System.out.println();

        System.out.println("find, get");
        System.out.println("Digite o número para o (find): ");
        number = sc.nextInt();
        System.out.println("Digite o indice para o (get): ");
        indice = sc.nextInt();
        System.out.println(find(origenArray, number));
        System.out.println(get(origenArray, indice));
        System.out.println();

        System.out.println("set");
        System.out.println("Digite o número para o (set): ");
        number = sc.nextInt();
        System.out.println("Digite o indice para o (set): ");
        indice = sc.nextInt();
        modifArray = set(origenArray, indice, number);
        imprimirVetor(modifArray);
    }

    public static void imprimirVetor(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
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
