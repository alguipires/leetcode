
public class teste_de_mesa {

    public static void main(String[] args) {

        int[] primeiroArr = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        int[] segundoArr = {10, 1, 9, 2, 8, 3, 7, 4, 6, 5};
        int[] terceiroArr = {4, 5, 6, 1, 2, 3, 7, 8, 9, 10};

        System.out.println("primeiro caso...");
        bubleSort(primeiroArr);
        selectionSort(primeiroArr);
        insertionSort(primeiroArr);

        System.out.println("segundo caso...");
        bubleSort(segundoArr);
        selectionSort(segundoArr);
        insertionSort(segundoArr);

        System.out.println("primeiro caso...");
        bubleSort(terceiroArr);
        selectionSort(terceiroArr);
        insertionSort(terceiroArr);

    }

    public static void bubleSort(int[] array){
        int j, aux, size;
        size = array.length;
        int comparisons = 0;
        int replacement = 0;

        for(int i = 0; i < size-1; i++) {
            for (j = 0; j < (size - i-1); j++) {
                comparisons++;
                if (array[j] > array[j+1]) {
                    aux = array[j];
                    array[j] = array[j+1];
                    array[j+1] = aux;
                    replacement++;
                }
            }
        }
        System.out.println("Bubble Sort: Comparações = " + comparisons + ", Trocas = " + replacement);
//        toSgtringArray(array);
    }

    public static void selectionSort(int[] array){
        int less, aux, size;
        size = array.length;
        int comparisons = 0;
        int replacement = 0;

        for (int i = 0; i < size-1; i++) {
            less = i;
            for (int j = i + 1; j < size; j++) {
                comparisons++;
                if (array[j] < array[less])
                    less = j;
            }
            if (i != less) {
                aux = array[i];
                array[i] = array[less];
                array[less] = aux;
                replacement++;
            }
        }
        System.out.println("Selection Sort: Comparações = " + comparisons + ", Trocas = " + replacement);
//        toStringArray(array);
    }

//    com array auxiliar
/*    public static void insertionSort(int[] array){
        int size = array.length;
        int auxArray[] = new int[size], j;
        int comparisons = 0;
        int replacement = 0;

        for (int i = 0; i < size; i++) {
            for (j = i; j > 0 && array[i] < auxArray[j-1]; j--) {
                comparisons++;
                replacement++;
                auxArray[j] = auxArray[j-1];
            }
            replacement++;
            auxArray[j] = array[i];
        }
        System.out.println("Insertion Sort: Comparações = " + comparisons + ", Trocas = " + replacement);
    }*/

//    sem array auxiliar
    public static void insertionSort(int[] array){
        int size = array.length;
        int comparisons = 0;
        int replacement = 0;
        int current, j;

        for (int i = 1; i < size; i++) {
            current = array[i];
            for (j = i - 1; j >= 0 && array[j] > current; j--) {
                array[j+1] = array[j];
                replacement++;
                comparisons++;
            }
            array[j+1] = current;
            replacement++;
        }
        System.out.println("Insertion Sort: Comparações = " + comparisons + ", Trocas = " + replacement);
//        toStringArray(array);
    }

    private static void toStringArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print("[" + array[i] + "], ");
        }
        System.out.println("...");
    }

}
