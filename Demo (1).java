package JavaAssign;

import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows");
        int n = sc.nextInt();
        System.out.println("Enter number of Column");
        int m = sc.nextInt();

        int[][] arr = new int[n][m];
        System.out.println("enter elements of matrix");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int posNum = 0;
        int negNum = 0;
        int eveNum = 0;
        int oddNum = 0;
        int Zero = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] > 0) {
                    posNum++;
                }
                if (arr[i][j ]< 0) {
                    negNum++;
                }

                if (arr[i][j] == 0) {
                    Zero++;
                }

                if (arr[i][j] % 2 == 0) {
                    eveNum++;
                } else {
                    oddNum++;
                }
            }

        }
        System.out.println("Number of positive numbers " + posNum);
        System.out.println("Number of negative numbers " + negNum);
        System.out.println("Number of Zero numbers " + Zero);
        System.out.println("Number of even numbers " + eveNum);
        System.out.println("Number of odd numbers " + oddNum);
    }
}
