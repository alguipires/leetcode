import java.util.Scanner;

public class maior_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o primeiro valor: ");
        int a = input.nextInt();

        System.out.println("Digite o segundo valor: ");
        int b = input.nextInt();

        System.out.println("Digite o terceiro valor: ");
        int c = input.nextInt();

        int bigger = a;

        if (b > bigger) {
            bigger = b;
        }
        if (c > bigger) {
            bigger = c;
        }

        System.out.println("Valores iniciais: " + a + " " + b + " " + c);
        System.out.println("Valor maior: " + bigger);
    }
}