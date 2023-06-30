package gfl.solution_in_process;

import java.io.IOException;
import java.util.Scanner;

public class GCD01 {
    public static void main(String[] args) throws IOException {
        GCD01 GCD01 = new GCD01();
        GCD01.run();
    }

    private void run(){

        Scanner scanner = new Scanner(System.in);
        String [] line = scanner.nextLine().split(" ");
        int[] result = new int[line.length];
        for(int i = 0; i<line.length; i++){
            line = scanner.nextLine().split(" ");
            result [i] = Integer.parseInt(line[i]);
            int res = findGCD(result);
            System.out.println("res = "+res);
        }

    }

    public int findGCD(int arr[]){
        int result = arr[0];
        for (int element: arr){
            result = gcdTwo(result, element);
            if(result == 1) {
                return 1;
            }
        }
        return result;
    }

    static int gcdTwo(int a, int b){
        if (a == 0){
            return b;
        }
        return gcdTwo(b % a, a);
    }

}
