package eolymp_tasks.solution_in_process;

import java.util.Scanner;

public class GCD02 {
    public static void main(String[] args) {
        GCD02 main = new GCD02();
        main.run();
    }

    private void run() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int res = scanList(scanner.nextLine().split(" "));
        System.out.println(res);
    }

    private int scanList(String[] list) {
        int m = 0;
        for (String element : list) {
            int a = Integer.parseInt(element);
            int[] lineN = new int[a];
            int res = lineN[0];
            for (int item : lineN) {
                res = gcdTwo(res, item);
                if (res == 1) {
                    return 1;
                }
            }
            return m+res;
        }
        return m;
    }

    static int gcdTwo(int a, int b) {
        if (a == 0) {
            return b;
        }
        return gcdTwo(b % a, a);
    }

}
