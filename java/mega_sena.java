import java.util.Scanner;


public class mega_sena {

    public static int[] cards = new int[6];
    public static int[] winCards = new int[6];


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 6; i++) {
            System.out.println("digite o " + (i+1) + "ºnumero do seu cartão da Mega Sena em ordem crescente:");
            cards[i] = scanner.nextInt();
        }
        System.out.println("Numeros cadastrados!");
        cardsToString(cards);

        for (int i = 0; i < 6; i++) {
            System.out.println("digite o " + (i+1) + "ºnumero premiado da Mega Sena em ordem crescente do sorteio:");
            winCards[i] = scanner.nextInt();
        }
        scanner.close();

        System.out.println("Numeros cadastrados!");
        cardsToString(winCards);
        System.out.println("....calculando...");

        isValidWin(cards, winCards);
    }

    private static void isValidWin(int[] cardUser, int[] winCard){

        int coincidencias = 0;
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (cardUser[i] == winCard[j]) {
                    coincidencias++;
                }
            }
        }

        if (coincidencias == 6) {
            System.out.println("Parabéns! Você acertou a sena!");
        } else if (coincidencias == 5) {
            System.out.println("Você acertou a quina!");
        } else if (coincidencias == 4) {
            System.out.println("Você acertou a quadra!");
        } else {
            System.out.println("Seu cartão não foi premiado.");
        }
    }
    private static void cardsToString(int[] cards) {
        for (int i = 0; i < cards.length; i++){
            System.out.print("[" + cards[i] + "] ");
        }
        System.out.print("...\n");
    }
}
