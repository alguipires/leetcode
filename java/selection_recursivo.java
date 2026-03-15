public class selection_recursivo {

    public static void main(String[] args) {

        int[] primeiroArr = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        int[] segundoArr = {10, 1, 9, 2, 8, 3, 7, 4, 6, 5};
        int[] terceiroArr = {4, 5, 6, 1, 2, 3, 7, 8, 9, 10};

        System.out.println("primeiro caso...");
        toStringArray(primeiroArr);
        recursiveSelectionSort(primeiroArr);
        toStringArray(primeiroArr);

    }

    public static void recursiveSelectionSort(int[] array) {
        recursiveSelectionSort(array, 0);
    }

    private static void recursiveSelectionSort(int[] array, int startIndex) {
        if (startIndex < array.length - 1) {
            int minIndex = findMinimumIndex(array, startIndex);
            if (minIndex != startIndex) {
                int temp = array[startIndex];
                array[startIndex] = array[minIndex];
                array[minIndex] = temp;
            }
            recursiveSelectionSort(array, startIndex + 1);
        }
    }

    private static int findMinimumIndex(int[] array, int startIndex) {
        int minIndex = startIndex;
        for (int i = startIndex + 1; i < array.length; i++) {
            if (array[i] < array[minIndex]) {
                minIndex = i;
            }
        }
        return minIndex;
    }


    private static void toStringArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print("[" + array[i] + "], ");
        }
        System.out.println("...");
    }
}
