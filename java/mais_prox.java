public class mais_prox {

    public static void main(String[] args) {
        int[] sequencia = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
        int numeroPesquisado = 5;

        boolean isFound = findNumber(sequencia, numeroPesquisado);

        if (isFound) {
            System.out.println("O número " + numeroPesquisado + " está na sequência.");
            toStringArray(sequencia);
        } else {
            System.out.println("O número " + numeroPesquisado + " não está na sequência.");
            toStringArray(sequencia);
        }
    }

    public static boolean findNumber(int[] array, int num) {
        int size = array.length;

        // Verificar se está dentro do intervalo [a0, an-1]
        if (num < array[0] || num > array[size - 1]) {
            return false;
        }

        int start = 0;
        int end = size - 1;

        while (start <= end) {
            if (array[start] == num || array[end] == num) {
                return true;
            }
            // Interromper se start maior que o número pesquisado
            if (array[start] > num) {
                return false;
            }
            start++;
            end--;
        }
        return false;
    }

    private static void toStringArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print("[" + array[i] + "], ");
        }
        System.out.println("...");
    }
}

