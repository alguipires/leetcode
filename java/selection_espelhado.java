public class selection_espelhado {

    public static void main(String[] args) {

        int[] primeiroArr = {7, 3, 10, 5, 8, 2, 9, 6, 1, 4};

        System.out.println("primeiro caso...");
        toStringArray(primeiroArr);
        selectionSortEspelhado(primeiroArr);
        toStringArray(primeiroArr);

    }
    public static void selectionSortEspelhado(int[] array) {
        int size = array.length;

        for (int i = 0; i < size / 2; i++) {
            int minIndex = i;
            int maxIndex = i;

            for (int j = i + 1; j < size - i; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                } else if (array[j] > array[maxIndex]) {
                    maxIndex = j;
                }
            }

            if (minIndex != i) {
                int temp = array[i];
                array[i] = array[minIndex];
                array[minIndex] = temp;
            }

            if (maxIndex == i) {
                maxIndex = minIndex;
            }

            if (maxIndex != size - i - 1) {
                int temp = array[size - i - 1];
                array[size - i - 1] = array[maxIndex];
                array[maxIndex] = temp;
            }
        }
    }



    private static void toStringArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print("[" + array[i] + "], ");
        }
        System.out.println("...");
    }
}
