public class onibus {

    private static String[] busPlaces = new String[41]; // 42 lugares fixos

    public static void main(String[] args) {

        boarding(0, "joão");
        boarding(1, "alfredo");
        boarding(2, "marcelo");
        boarding(3, "maria");
        boarding(4, "ana");
        boarding(5, "eduarda");
        boarding(5, "joaquina");

        onibusToString(busPlaces);

    }

    public static boolean boarding(int accent, String name){
        if (accent == 0){
            System.out.println("Numero de acento invalido!");
            return false;
        }
        if (accent > 0 && accent <=42 && busPlaces[accent-1] == null) {
            busPlaces[accent-1] = name;
            return true;
        }else{
            if (busPlaces[accent-1] != null){
                System.out.println("Acento preenchido com usuario: " + busPlaces[accent-1]);
            }else {
                System.out.println("Numero de acento invalido!");
            }
            return false;
        }
    }

    private static void onibusToString(String[] busPlaces) {
        System.out.println("        [ BUS-TICKET ] \n");
        for (int i = 0; i < busPlaces.length; i++){
            System.out.println("Ticket - [" + (i+1) + "]" + "Nome passageiro: " + busPlaces[i]);
        }
    }
}
