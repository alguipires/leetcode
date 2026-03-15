import java.util.Random;

public class bingo {

    public static void main(String[] args) {
        generateBingo();

    }
    private static void generateBingo(){
        Random random = new Random();
        int[] bingo = new int[25];

        for (int i = 0; i < bingo.length; i++){
            int ramdomNumber;
            do {
                ramdomNumber = random.nextInt(50);
            }while (containsNumber(bingo, ramdomNumber));
            bingo[i] = ramdomNumber;
        }

        bingoToString(bingo);
    }

    private static boolean containsNumber(int[] array, int number){
        boolean aux = false;
        for (int i = 0; i < array.length && aux == true; i++) {
            if (array[i] == number) {
                aux = true;
            }
        }
        return aux;
    }

    private static void bingoToString(int[] bingo) {
        System.out.println("[  B  ] [  I  ] [  N  ] [  G  ] [  O  ] ");
        int auxLine = 0;
        for (int i = 0; i < bingo.length; i++){
            int value = bingo[i];
            if (auxLine < 5){
                if (value < 10){ //formatação
                    System.out.print("[  " + bingo[i] + "  ] ");
                }else {
                    System.out.print("[ " + bingo[i]+ "  ] ");
                }
                auxLine++;
            }else {
                auxLine = 1;
                System.out.print("\n");
                if (value < 10){ //formatação
                    System.out.print("[  " + bingo[i] + "  ] ");
                }else {
                    System.out.print("[ " + bingo[i]+ "  ] ");
                }
            }
        }
    }

    // MATRIZ BIDIMENCIONAL
    /*private static void generateBingo(){
        Random random = new Random();
        int[][] bingo = new int[5][5];

        for (int i = 0; i < bingo.length; i++){
            for (int j = 0; j < bingo.length; j++){
                bingo[i][j] = random.nextInt(50);
            }
        }

        bingoToString(bingo);
    }*/

    //MATRIZ BIDIMENSIONAL
    /*private static void bingoToString(int[][] bingo) {
        System.out.println("[  B  ] [  I  ] [  N  ] [  G  ] [  O  ] ");
        for (int i = 0; i < bingo.length; i++){
            for (int j = 0; j < bingo.length; j++){
                int value = bingo[i][j];
                if (value < 10){
                    System.out.print("[  " + bingo[i][j] + "  ] ");
                }else {
                    System.out.print("[ " + bingo[i][j] + "  ] ");
                }
            }
            System.out.printf("\n");
        }
    }*/
}
