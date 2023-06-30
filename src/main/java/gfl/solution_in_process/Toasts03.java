package gfl.solution_in_process;

import java.util.Scanner;

public class Toasts03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        int p = scanner.nextInt();
        Toasts03 toasts03 = new Toasts03();
        toasts03.run(t, p);
    }

    private void run(int t, int p) {
        if(t<=p){
            int amountFrying = 0;
            amountFrying++;
            int time = (amountFrying*2)*2;
            System.out.println(time);
        }
        if (t>p){
            double countFry = (double) t/p;
            double amountMulti = (countFry*2)*2;
            int time = (int) amountMulti;
            System.out.println(time);
        }
    }
}
