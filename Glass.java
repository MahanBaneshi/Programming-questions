// question link: https://quera.org/problemset/8901

import java.util.Scanner;

public class Glass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        char currentPosition = scanner.next().charAt(0);

        for (int i = 0; i < n; i++) {
            char cup1 = scanner.next().charAt(0);
            char cup2 = scanner.next().charAt(0);
            if (currentPosition == cup1) {
                currentPosition = cup2;
            } else if (currentPosition == cup2) {
                currentPosition = cup1;
            }
        }

        System.out.println(currentPosition);
    }
}
