package JavaAssign;

public class DiagonalProblem {
    public static void main(String[] args) {
        int[][] arr = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        int n = arr.length;
        int m = arr[0].length;
        // for finding elemnts above secondary diagonal
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if ((i + j) < m - 1) {

                    System.out.print(arr[i][j] + " ");
                }
            }
        }
        System.out.println();
        // for finding both primary and secondary diagonal elements
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i][i] + " ");
            if (i != m - 1 - i) {
                System.out.print(arr[i][n - 1 - i] + " ");

            }
        }
        System.out.println();
        // for finding largest numner in 2d matrix
        int a = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] > 0) {
                    a = arr[i][j];
                }
            }
        }
        System.out.println("Largest number is " + a);

        System.out.println();
        // to find middle elemnts of 2d array

        int[][] arr2 = {
                { 1, 2, 3, 4, 5 },
                { 3, 4, 5, 6, 7 },
                { 7, 6, 5, 4, 3 },
                { 8, 7, 6, 5, 4 },
                { 1, 2, 37, 8, 0 }
        };
        int M = arr2.length;
        for (int i = 0; i < M; i++) {
            System.out.print(arr2[i][M / 2] + " ");
            if (i != M - 1 - i) {
                System.out.print(arr2[M / 2][i] + " ");
            }
        }
    }
}
