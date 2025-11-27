// question link: https://quera.org/problemset/268727

import java.io.*;
import java.util.*;

public class Pirharat {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);

        int n = Integer.parseInt(br.readLine());

        String[] tokens = br.readLine().split(" ");
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(tokens[i]);
        }

        Pair[] pairs = new Pair[n];
        for (int i = 0; i < n; i++) {
            pairs[i] = new Pair(a[i], i);
        }

        Arrays.sort(pairs, (p1, p2) -> Integer.compare(p1.value, p2.value));

        long S = (long)pairs[0].value + pairs[n-1].value;
        boolean valid = true;

        for (int i = 0; i < n/2; i++) {
            if ((long)pairs[i].value + pairs[n-1-i].value != S) {
                valid = false;
                break;
            }
        }

        if (n % 2 == 1) {
            if ((long)pairs[n/2].value * 2 != S) {
                valid = false;
            }
        }

        if (!valid) {
            pw.println(-1);
        } else {
            int[] permutation = new int[n];

            for (int i = 0; i < n; i++) {
                int pairIndex = n - 1 - i;
                permutation[pairs[i].index] = pairs[pairIndex].index + 1;
            }

            for (int i = 0; i < n; i++) {
                pw.print(permutation[i]);
                if (i < n - 1) pw.print(" ");
            }
            pw.println();
        }

        pw.flush();
        pw.close();
    }

    static class Pair {
        int value;
        int index;

        Pair(int value, int index) {
            this.value = value;
            this.index = index;
        }
    }
}