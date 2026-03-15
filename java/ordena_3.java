import java.util.Scanner;

public class ordena_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o primeiro valor: ");
        int a = input.nextInt();

        System.out.println("Digite o segundo valor: ");
        int b = input.nextInt();

        System.out.println("Digite o terceiro valor: ");
        int c = input.nextInt();

        if (a > b) {
            int aux = a;
            a = b;
            b = aux;
        }
        if (b > c) {
            int aux = b;
            b = c;
            c = aux;
        }
        if (a > b) {
            int aux = a;
            a = b;
            b = aux;
        }

        System.out.println("Valores em ordem: " + a + " " + b + " " + c);
    }
}