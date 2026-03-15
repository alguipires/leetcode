public class crescente {
    public static String stringOrder = "Crescente";
    public static String ascendingOrder(int[] datas) {
        Boolean order = true;
        if (datas == null || datas.length <= 1) {
            return stringOrder = "Crescente"; // 0 ou 1 elemento esta na ordem
        }
        for (int i = 0; i < datas.length - 1; i++) {
            if (datas[i] > datas[i + 1]) {
                return stringOrder = "Não está em ordem";
            }
        }
        return stringOrder;
    }
    public static void main(String[] args) {
        int[] dados1 = {1, 2, 3, 4, 5};
        int[] dados2 = {1, 3, 2, 4, 5};
        int[] dados3 = {5, 4, 3, 2, 1};
        System.out.println("Dados1 estão em ordem... " + ascendingOrder(dados1));
        System.out.println("Dados2 estão em ordem... " + ascendingOrder(dados2));
        System.out.println("Dados3 estão em ordem... " + ascendingOrder(dados3));
    }
}
