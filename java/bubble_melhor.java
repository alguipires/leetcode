public class bubble_melhor {
    public static void main(String[] args) {

        int[] primeiroArr = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        int[] segundoArr = {10, 1, 9, 2, 8, 3, 7, 4, 6, 5};
        int[] terceiroArr = {4, 5, 6, 1, 2, 3, 7, 8, 9, 10};

        System.out.println("primeiro caso...");
        bubleSort(primeiroArr);
        System.out.println("segundo caso...");
        bubleSort(segundoArr);
        System.out.println("primeiro caso...");
        bubleSort(terceiroArr);


    }

    public static void bubleSort(int[] array){
        int j, aux, size;
        size = array.length;
        int comparisons = 0;
        int replacement = 0;
        boolean swapped;

        for(int i = 0; i < size-1; i++) {
            swapped = false;
            for (j = 0; j < (size - i-1); j++) {
                comparisons++;
                if (array[j] > array[j+1]) {
                    aux = array[j];
                    array[j] = array[j+1];
                    array[j+1] = aux;
                    replacement++;
                    swapped = true;
                }
            }
            if (!swapped){
                break;
            }
        }
        System.out.println("Bubble Sort: Comparações = " + comparisons + ", Trocas = " + replacement);
        toStringArray(array);
    }

    private static void toStringArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print("[" + array[i] + "], ");
        }
        System.out.println("...");
    }
}
