package eckel.working_with_arrays;

import java.util.Arrays;

public class TwoDemArray {
    public static void main(String[] args) {
        double [][] myArray = new double[3][4];

        String text;
        int n, m;
        n = 5;
        m = 12;
        int [][] num = new int [n][m];
        for (int i = 0; i<n; i++){
            for(int j = 0; j<m; j++ ){
                num[i][j] = (int)(10*Math.random());

                 //107
            }
        }

    }
}
