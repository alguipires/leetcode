import java.util.Random;

public class SortingMethods {

    public SortingMethods() {
        inicialNumList(10);
    }

    public int[] inicialNumList(int value) {
        Random random = new Random();
        int[] numList = new int[value];

        for (int i = 0; i < numList.length; i++) {
            numList[i] = random.nextInt(100);
        }
        return numList;
    }

    public void bubleSort(int[] array){
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
//        System.out.println("Bubble Sort: Comparações = " + comparisons + ", Trocas = " + replacement);
//        toSgtringArray(array);
    }

    public void selectionSort(int[] array){
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
//        System.out.println("Selection Sort: Comparações = " + comparisons + ", Trocas = " + replacement);
//        toStringArray(array);
    }

//    com array auxiliar
/*    public void insertionSort(int[] array){
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
    public void insertionSort(int[] array){
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
//        System.out.println("Insertion Sort: Comparações = " + comparisons + ", Trocas = " + replacement);
//        toStringArray(array);
    }

//      METODO MERGESORT
    public void mergeSort(int[] array, int start, int end) {

        if (start < end) {
            int middle = (start + end) / 2;
            mergeSort(array, start, middle);
            mergeSort(array, middle + 1, end);
            merge(array, start, middle, end);
        }
    }
//        METODO MERGE - USO INTERNO DA CLASSE
    private void merge(int[] array, int start, int midle, int end) {

        int[] aux = new int[array.length];

        int i, j, k;
        for (i = midle + 1; i > start; i--) {
            aux[i - 1] = array[i - 1];
        }
        for (j = midle; j < end; j++) {
            aux[end + midle - j] = array[j + 1];
        }
//        int i = start;
//        int j = end;;
        for (k = start; k <= end; k++) {
            if (aux[j] < aux[i]) {
                array[k] = aux[j--];
            } else {
                array[k] = aux[i++];
            }
        }
    }

    public void quickSort(int[] array) {
        int less, aux, size;
        size = array.length;
        int comparisons = 0;
        int replacement = 0;



    }

    //TO STRING
    public static void toStringArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print("[" + array[i] + "], ");
        }
        System.out.println("...");
    }
}
