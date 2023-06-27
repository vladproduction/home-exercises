package gfl.solution;
//Partial sum of a matrix


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;


public class PartialSumMatrix {
    public static void main(String[] args) throws IOException {
        PartialSumMatrix main = new PartialSumMatrix();
        main.run();
    }

    private void run() throws IOException {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] box = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                box [i][j] = scanner.nextInt();
            }
        }

        int rez[][] = doTask(box);

        printBox(rez);
    }

    private int[][] doTask(int[][] box) {

        int[][] res = new int[box.length][box[0].length];
        res[0][0] = box[0][0];
        for (int i = 1; i < box[0].length; i++) {
            res[0][i] = res[0][i - 1] + box[0][i];
        }
        for (int i = 1; i < box.length; i++) {
            res[i][0] = res[i - 1][0] + box[i][0];
        }
        for (int i = 1; i < box.length; i++) {
            for (int j = 1; j < box[0].length; j++) {
                res[i][j] = res[i - 1][j] + res[i][j - 1] -
                        res[i - 1][j - 1] + box[i][j];
            }
        }
        return res;
    }

    private void printBox(int[][] box) {
        PrintWriter out = new PrintWriter(System.out);
        for (int[] rows : box) {
            for (int x : rows) {
                out.print(x + " ");
            }
            out.println();
        }
        out.close();
    }
}
