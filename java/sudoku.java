public class sudoku {

    public static void main(String[] args) {

        //VALIDO
        int[][] sudokuCompletoValido = {
                {4, 3, 5, 2, 9, 1, 8, 7, 6},
                {8, 9, 1, 6, 3, 7, 4, 2, 5},
                {6, 2, 7, 5, 4, 8, 9, 3, 1},
                {9, 8, 2, 7, 1, 4, 5, 6, 3},
                {7, 4, 6, 3, 8, 5, 2, 1, 9},
                {5, 1, 3, 9, 2, 6, 7, 8, 4},
                {2, 7, 9, 1, 5, 3, 6, 4, 8},
                {1, 6, 8, 4, 7, 9, 3, 5, 2},
                {3, 5, 4, 8, 6, 2, 1, 9, 7}
        };

        //INVALIDO
        int[][] sudokuCompletoInvalido = {
                {4, 3, 4, 2, 9, 1, 8, 7, 6},
                {8, 9, 1, 6, 3, 7, 4, 2, 8},
                {6, 2, 7, 5, 4, 4, 9, 3, 1},
                {9, 4, 2, 7, 1, 4, 5, 6, 3},
                {7, 4, 6, 3, 8, 5, 2, 1, 9},
                {5, 1, 3, 9, 2, 6, 7, 1, 4},
                {2, 7, 9, 7, 5, 3, 6, 4, 8},
                {1, 6, 8, 4, 7, 9, 3, 5, 1},
                {3, 5, 4, 8, 6, 2, 1, 9, 7}
        };

        sudokuToString(sudokuCompletoInvalido);
        isValidSudoku(sudokuCompletoInvalido);

        sudokuToString(sudokuCompletoValido);
        isValidSudoku(sudokuCompletoValido);
    }

    public static boolean isValidSudoku(int[][] sudoku) {

        //verifica colunas
        for (int j = 0; j < 9; j++) {
            if (!isValidColumn(sudoku, j)) {
                return false;
            }
        }

        //verifica linhas
        for (int i = 0; i < 9; i++) {
            if (!isValidRow(sudoku, i)) {
                return false;
            }
        }

        //verifica regiões
        for (int i = 0; i < 9; i += 3) {
            for (int j = 0; j < 9; j += 3) {
                if (!isValidRegion(sudoku, i, j)) {
                    return false;
                }
            }
        }

        System.out.println("Sudoku Valido!!");
        return true;
    }

    private static boolean isValidColumn(int[][] sudoku, int col) {
        boolean[] seen = new boolean[9]; // matriz validadora de visualizados
        for (int i = 0; i < 9; i++) { //iteração 0 a 9
            int num = sudoku[i][col];
            if (num != 0 && (num < 1 || num > 9)) { // validação
                System.out.println("Linha " + (i+1) + ", coluna " + (col+1) + ": o número deve estar entre 1 e 9;");
                return false;
            }
            if (seen[num - 1]){
                System.out.println("Linha " + (i+1) + ", coluna " + (col+1) + ": o número " + num + " já está presente nesta coluna;");
                return false;
            }
            if (num != 0) { // marcou se já foi visto
                seen[num - 1] = true;
            }
        }
        return true;
    }

    private static boolean isValidRow(int[][] sudoku, int row) {
        boolean[] seen = new boolean[9];
        for (int j = 0; j < 9; j++) {
            int num = sudoku[row][j];
            if (num != 0 && (num < 1 || num > 9)) {
                System.out.println("Linha " + (row+1) + ", coluna " + (j+1) + ": o número deve estar entre 1 e 9;");
                return false;
            }
            if (seen[num - 1]){
                System.out.println("Linha " + (row+1) + ", coluna " + (j+1) + ": o número " + num + " já está presente nesta linha;");
                return false;
            }
            if (num != 0) {
                seen[num - 1] = true;
            }
        }
        return true;
    }

    private static boolean isValidRegion(int[][] sudoku, int row, int col) {
        boolean[] seen = new boolean[9]; // matriz validadora de visualizados
        for (int i = row; i < row + 3; i++) { // iteração da linha ate 3
            for (int j = col; j < col + 3; j++) { //iteração coluna ate 3
                int num = sudoku[i][j];
                if (num != 0 && (num < 1 || num > 9)) { // validação
                    System.out.println("Linha " + (i+1) + ", coluna " + (j+1) + ": o número deve estar entre 1 e 9;");
                    return false;
                }
                if (seen[num - 1]){
                    System.out.println("Linha " + (i+1) + ", coluna " + (j+1) + ": o número " + num + " já está presente nesta região;");
                    return false;
                }
                if (num != 0) {
                    seen[num - 1] = true;
                }
            }
        }
        return true;
    }

    private static void sudokuToString(int[][] sudoku) {
        System.out.println("      [ S ] [ U ] [ D ] [ O ] [ K ] [ U ]\n");
        for (int i = 0; i < sudoku.length; i++){
            for (int j = 0 ; j < sudoku.length; j++){
                System.out.print("[ " + sudoku[i][j] + " ]");
            }
            System.out.printf("\n");
        }
    }
}
