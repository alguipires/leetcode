class Sudoku:
    def isValidRow(self, sudoku: list[list[int]], row: int) -> bool:
        seen = [False] * 9  # uma array de bool
        for i in range(9):
            num = sudoku[row][i]
            if num != 0 and (num < 1 or num > 9):
                print(f"line [row+1], column [i+1]: the number between 1 to 9")
                return False
            if seen[num - 1]:
                print(f"line [row + 1], column [i + 1]: the number is present in this line")
                return False
            if num != 0:
                seen[num - 1] = True
        return True

    def isValidColumn(self, sudoku: list[list[int]], col: int) -> bool:
        seen = [False] * 9  # uma array de bool
        for i in range(9):
            num = sudoku[i][col]
            if num != 0 and (num < 1 or num > 9):
                print(f"line [i + 1], column [col + 1]: the number between 1 to 9")
                return False
            if seen[num - 1]:
                print(f"line [i + 1], column [col + 1]: the number is present in this column")
                return False
            if num != 0:
                seen[num - 1] = True
        return True

    def isValidRegion(self, sudoku: list[list[int]], row: int, col: int) -> bool:
        seen = [False] * 9  # uma array de bool
        for i in range(row, row + 3, 1):
            for j in range(col, col + 3, 1):
                num = sudoku[i][j]
                if num != 0 and (num < 1 or num > 9):
                    print(f"line [i + 1], column [j + 1]: the number between 1 to 9")
                    return False
                if seen[num - 1]:
                    print(f"line [i + 1], column [j + 1]: the number is present in this region")
                    return False
                if num != 0:
                    seen[num - 1] = True
        return True

    def isValidSudoku(self, sudoku: list[list[int]]) -> bool:

        # valid lines
        for i in range(9):
            if not self.isValidRow(sudoku, i):
                return False

        # valid columns
        for j in range(9):
            if not self.isValidColumn(sudoku, j):
                return False

        # valid region
        for i in range(0, 9, 3):
            for j in range(0, 9, 3):
                if not self.isValidRegion(sudoku, i, j):
                    return False

        print("Sudoku is valid!!")
        return True


if __name__ == '__main__':
    # VALIDO
    sudokuCompletoValido: list[list[int]] = [
        [4, 3, 5, 2, 9, 1, 8, 7, 6],
        [8, 9, 1, 6, 3, 7, 4, 2, 5],
        [6, 2, 7, 5, 4, 8, 9, 3, 1],
        [9, 8, 2, 7, 1, 4, 5, 6, 3],
        [7, 4, 6, 3, 8, 5, 2, 1, 9],
        [5, 1, 3, 9, 2, 6, 7, 8, 4],
        [2, 7, 9, 1, 5, 3, 6, 4, 8],
        [1, 6, 8, 4, 7, 9, 3, 5, 2],
        [3, 5, 4, 8, 6, 2, 1, 9, 7]
    ]

    # INVALIDO
    sudokuCompletoInvalido: list[list[int]] = [
        [4, 3, 4, 2, 9, 1, 8, 7, 6],
        [8, 9, 1, 6, 3, 7, 4, 2, 8],
        [6, 2, 7, 5, 4, 4, 9, 3, 1],
        [9, 4, 2, 7, 1, 4, 5, 6, 3],
        [7, 4, 6, 3, 8, 5, 2, 1, 9],
        [5, 1, 3, 9, 2, 6, 7, 1, 4],
        [2, 7, 9, 7, 5, 3, 6, 4, 8],
        [1, 6, 8, 4, 7, 9, 3, 5, 1],
        [3, 5, 4, 8, 6, 2, 1, 9, 7]
    ]

    sudokus = Sudoku()

    sudokus.isValidSudoku(sudokuCompletoValido)
    sudokus.isValidSudoku(sudokuCompletoInvalido)
