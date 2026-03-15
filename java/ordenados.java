import java.util.Random;

public class ordenados {

    public static int TAM = 10;


    public static void main(String[] args) {

        System.out.println("iniciando!");
        toStringArray(arrayOrder());

    }

    public static int[] arrayOrder() {
        Random random = new Random();
        int[] array = new int[TAM];
        int lastValue, next;

        for (int i = 0; i < array.length; i++) {

            if (i == 0){
                array[i] = random.nextInt(10);
            }else {
                next = random.nextInt(10);
                array[i] = array[i-1] + next;
            }
        }
        return array;
    }

    private static void toStringArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print("[" + array[i] + "], ");
        }
        System.out.println("...");
    }
}
