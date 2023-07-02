package eolymp_tasks.solution_in_process;

import java.util.Scanner;

public class LCM04 {
    public static void main(String[] args) {
        LCM04 main = new LCM04();
        main.run();
    }

    private void run() {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        byte [] array = new byte[n];
        for (int i = 0; i < n; i++) {
            String m = scanner.next();
            array[i] = Byte.parseByte(m);
        }

        long lcm = findLCM(array);
        System.out.println(lcm);
    }

    private long findLCM(byte [] array) {
        if (array.length == 0) {
            return 0;
        }
        if (array.length == 1) {
            return array[0];
        }

        long lcm = findLCM(array[0], array[1]);

        for (int i = 2; i < array.length; i++) {
            lcm = findLCM(lcm, array[i]);
        }

        return lcm;
    }


    private long findGCD(long a, long b) {

        if (a < b) {
            a = a + b;
            b = a - b;
            a = a - b;
        }
        long mod = a % b;
        if (mod == 0) {
            return b;
        }
        return findGCD(b, mod);
    }

    private long findLCM(long a, long b) {

        long gcd = findGCD(a, b);
        long lcm = (b / gcd) * a;

        return lcm;
    }
}
