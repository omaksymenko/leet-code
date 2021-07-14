package thing;

import java.util.HashSet;

public class SudokuValidator {
    public static void main(String[] args) {
        System.out.println(isValidSudoku(
                new char[][]{
                        new char[]{'.', '.', '.', '.', '.', '.', '.', '.', '.'},
                        new char[]{'.', '.', '.', '.', '.', '.', '.', '.', '.'},
                        new char[]{'.', '.', '.', '.', '.', '.', '.', '.', '.'},
                        new char[]{'.', '.', '.', '.', '.', '.', '.', '.', '.'},
                        new char[]{'.', '.', '.', '.', '.', '.', '.', '.', '.'},
                        new char[]{'.', '.', '.', '.', '.', '.', '.', '.', '.'},
                        new char[]{'.', '.', '.', '.', '.', '.', '.', '.', '.'},
                        new char[]{'.', '.', '.', '.', '.', '.', '.', '.', '.'},
                        new char[]{'.', '.', '.', '.', '.', '.', '.', '.', '.'}
                })

                /*
                  new char[]{'5', '.', '.', '.', '5', '.', '.', '1', '.'},
                        new char[]{'.', '.', '.', '3', '.', '.', '.', '.', '.'},
                        new char[]{'.', '.', '.', '.', '.', '3', '.', '.', '1'},
                        new char[]{'8', '.', '.', '.', '.', '.', '.', '2', '.'},
                        new char[]{'.', '.', '2', '.', '7', '.', '.', '.', '.'},
                        new char[]{'.', '1', '5', '.', '.', '.', '.', '.', '.'},
                        new char[]{'.', '.', '.', '.', '.', '2', '.', '.', '.'},
                        new char[]{'.', '2', '.', '9', '.', '.', '.', '.', '.'},
                        new char[]{'.', '.', '4', '.', '.', '.', '.', '.', '.'}
                * */

              /*  new char[][]{
                        new char[]{'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                        new char[]{'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                        new char[]{'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                        new char[]{'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                        new char[]{'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                        new char[]{'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                        new char[]{'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                        new char[]{'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                        new char[]{'.', '.', '.', '.', '8', '.', '.', '7', '9'}
                })*/
        );
    }

        public static boolean isValidSudoku(char[][] board) {

            int[] indices = new int[]{0, 3, 6, 9};
            return areTraversedCharsValid(board, indices);



          /*  int j = 0;
            // each el in each row is unique
            for(int i = 0; i < board.length; i++) {
                if (!areRowDigitsUnique(board[i])) {
                    return false;
                }
            }
            // each el in each column is unique
            for (int i = 0; j < board.length; j++) {
                HashSet<Character> charsColumn = new HashSet<>();
                for (; i < board.length; i++) {
                    if (board[i][j] != '.') {
                        if (!charsColumn.add(board[i][j])) {
                            return false;
                        }
                    }
                }
                i = 0;
            }
            return true;
            */

            /*int prevArrRowLimit = 0;
            int arrRowLimit = 3;
            for(int i = 0; i < arrRowLimit; i++) {
                int prevArrColumnLimit = 0;
                int arrColumnLimit = 3;
                for(int j = 0; j < arrColumnLimit; j++) {

                }
                    arrRowLimit += 3;

            }*/

    }

    private static boolean areTraversedCharsValid(char[][] board, int[] indies) {
        HashSet<Character> chars;
        for(int z = 1; z < indies.length; z++) {

            for (int k = 1; k < indies.length; k++) {
                chars = new HashSet<>();

                for (int i = indies[k - 1]; i < indies[k]; i++) {

                    for (int j = indies[z - 1]; j < indies[z]; j++) {
                        if (board[i][j] != '.') {
                            if (!chars.add(board[i][j]))
                                return false;
                        }
                    }
                }
                if(chars.isEmpty()) {
                    System.out.println("empty");
                    return false;
                }
            }
        }

        return true;
    }

    private static boolean areRowDigitsUnique(char[] row) {
            HashSet<Character> charsSet = new HashSet<>();
            for(int i = 0; i < row.length; i++) {
                if (row[i] != '.') {
                    if(!charsSet.add(row[i])){
                        return false;
                    }
                }
            }
            return true;
        }
}
