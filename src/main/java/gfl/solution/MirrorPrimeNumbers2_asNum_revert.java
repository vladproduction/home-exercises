package gfl.solution;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MirrorPrimeNumbers2_asNum_revert {

    public static void main(String[] args) {
        MirrorPrimeNumbers2_asNum_revert mirrorPrimeNumbers2revert = new MirrorPrimeNumbers2_asNum_revert();
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        List<Integer> num = mirrorPrimeNumbers2revert.findNumbers(a, b);
        System.out.println(num.size());

    }

    public List<Integer> findNumbers(int a, int b) {
        List<Integer> num = new ArrayList();
        for (int i = a; i <= b; i++) {
            boolean isSimple = isSimple(i);
            if (isSimple) {
                int reverseValue = revert(i);
                boolean reverseNumberIsSimple = isSimple(reverseValue);
                if (reverseNumberIsSimple) {
                    num.add(i);
                }
            }
        }
        return num;
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

