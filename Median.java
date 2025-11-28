// question link: Compiler design with the help of

import java.util.Scanner;

public class Median {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] values = new int[n];
        for (int i = 0; i < n; i++) {
            values[i] = scanner.nextInt();
        }
        double[] results = new double[n - k + 1];
        long up = 0;
        long down = 0;
        int x;
        for (int i = 0; i < n - k + 1; i++) {
            x = 1;
            for (int j = i; j < k + i; j++) {
                up += (long) x * values[j];
                down += x;
                x++;
            }
            results[i] = (double) up / down;
            up = 0;
            down = 0;
        }
        for (double result : results) {
            System.out.printf("%.9f\n", result);
        }
    }
}
