package gfl.solution;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MirrorPrimeNumbers_sb_revert {
    public static void main(String[] args) {
        MirrorPrimeNumbers_sb_revert primeNumbers = new MirrorPrimeNumbers_sb_revert();
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        List<Integer> numbList = primeNumbers.findNumbers(a,b);
        System.out.println(numbList.size());
    }

    public List<Integer> findNumbers (int a, int b){
        List<Integer> num = new ArrayList();
        for(int i = a; i<=b;i++){
            boolean isSimple = isSimple(i);
            if (isSimple){
                int reverseValue = revert(i);
                boolean reverseNumberIsSimple = isSimple(reverseValue);
                if (reverseNumberIsSimple){
                    num.add(i);
                }
            }
        }
        return num;
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
