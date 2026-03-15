public class Main {

//    public static Integer[] a = {1, 2};

    public static void main(String[] args) {
        System.out.println("Iniciando!");
        SortingMethods aux = new SortingMethods();
        int[] arrayAux = aux.inicialNumList(10);
        aux.toStringArray(arrayAux);

//        aux.selectionSort(arrayAux);
//        aux.bubleSort(arrayAux);
//        aux.insertionSort(arrayAux);
        aux.mergeSort(arrayAux, 0, 9);

        aux.toStringArray(arrayAux);
    }
}