// question link: https://quera.org/problemset/6375

import java.util.Scanner;

public class zarf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextLong();
        long b = scanner.nextLong();
        long c = scanner.nextLong();


        long min = Math.min(a, Math.min(b,c));
        long max = Math.max(a, Math.max(b,c));
        if (min == max){
            System.out.println(0);
            return;
        }
        if (a+b+c == (min+max) * 1.5){
            System.out.println(1);
            return;
        }
        else {
            System.out.println(2);
        }
    }
}
