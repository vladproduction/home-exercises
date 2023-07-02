package eolymp_tasks.Tasks_FINISHED;

import java.util.Scanner;

public class TwoDigits01 {
    public static void main(String[] args) {
        TwoDigits01 main = new TwoDigits01();
        main.run();
    }

    /*      рекуррентность:
        f(n) = f(n – 1) + f(n – 2),
        f(1) = 2, f(2) = 4              */

    private void run() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int l = 32;   // not 30!!!
        int[] m = new int[l];
        m[1] = 2;
        m[2] = 4;
        for (int i = 3; i <= n; i++) {
            m[i] = m[i - 1] + m[i - 2];
        }
        System.out.println(m[n]);
    }

}
