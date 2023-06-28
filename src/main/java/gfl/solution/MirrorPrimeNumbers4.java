package gfl.solution;

import java.util.Scanner;

public class MirrorPrimeNumbers4 {
    public static void main(String[] args) {
        MirrorPrimeNumbers4 mirrorPrimeNumbers4 = new MirrorPrimeNumbers4();
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int count = mirrorPrimeNumbers4.findNumbers(a,b);
        System.out.println(count);
    }

    public int findNumbers (int a, int b){
        int count = 0;
        for(int i = a; i<=b;i++){
            boolean isSimple = isSimple(i);
            if (isSimple){
                int reverseValue = revert(i);
                boolean reverseNumberIsSimple = isSimple(reverseValue);
                if (reverseNumberIsSimple){
                    count++;
                }
            }
        }
        return count;
    }

    private int revert(int m){
        StringBuilder sb = new StringBuilder();
        sb.append(m);
        String reverseValue = sb.reverse().toString();
        return Integer.parseInt(reverseValue);
    }

    private  boolean isSimple(int n) {
        for (int i = 2; i<n; i++){
            int mod = n%i;
            if(mod==0){
                return false;
            }
        }
        return true;
    }
}
