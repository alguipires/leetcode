public class gnome_sort {

    public static void main(String[] args) {

        int[] primeiroArr = {6, 2, 9, 4, 7, 1, 8, 5, 0};

        toStringArray(primeiroArr);

        gnomeSort(primeiroArr);

        toStringArray(primeiroArr);
    }

    public static void gnomeSort(int[] array){
        int size = array.length;
        int index = 0;

        while (index < size) {
            if (index == 0) {
                index++;
            }
            if (array[index] >= array[index - 1]) {
                index++;
            } else {
                int temp = array[index];
                array[index] = array[index - 1];
                array[index - 1] = temp;
                index--;
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
