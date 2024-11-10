package lesson3;

public class TaskThirteen {
    public static void main(String[] args) {
        int[][] matrix = {{1, 7, 3},
                {2, 15, 4},
                {3, 2, 4}};
        for (int i = 0; i < 3; i++) {
            matrix[i][i] = 1;
            matrix[i][2 - i] = 1;
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "");
            }
            System.out.println();
        }
    }
}
