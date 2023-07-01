package eolymp_tasks.solution_in_process;

import java.io.IOException;
import java.util.Scanner;

public class GCD03 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        String[] s = scanner.nextLine().split(" ");
        int [] line = convert(s);
        int res = findGCD(line, m);
        System.out.println(res);

    }

    public static int[] convert(String[] s) {
        int[] result = new int[s.length];
        for (int i = 0; i < s.length; i++) {
            result[i] = Integer.parseInt(s[i]);

        }
        return result;
    }

    static int gcd(int a, int b) {
        if (a == 0) {
            return b;
        }
        return gcd(b % a, a);
    }

    public static int findGCD(int arr[], int m) {
        int res = arr[0];
        for (int element : arr) {
            res = gcd(res, element);
            if (res == 1) {
                return 1;
            }
        }
        return res;
    }
}
