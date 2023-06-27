package gfl.solution;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MirrorPrimeNumbers3 {
    public static void main(String[] args) {
        MirrorPrimeNumbers3 mirrorPrimeNumbers3 = new MirrorPrimeNumbers3();
        mirrorPrimeNumbers3.run();
    }

    private void run() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        printList(finder(a, b));
    }

    private List<Integer> finder(int a, int b) {

        List<Integer> num = new ArrayList();

        for (int i = a; i <= b; i++) {
            if (isSimple(i)) {
                int reverseValue = revert(i);
                if (isSimple(reverseValue)) {
                    num.add(i);
                }
            }
        }
        return num;
    }

    private void printList(List<Integer> list) {
        PrintWriter out = new PrintWriter(System.out);
        out.println(list.size());
        out.close();

    }

    private int revert(int m) {
        int res = 0;
        while (m > 0) {
            int v = m % 10;
            res = res * 10 + v;
            m = m / 10;
        }
        return res;
    }

    private boolean isSimple(int n) {
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
