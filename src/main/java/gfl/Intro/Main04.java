package gfl.Intro;

public class Main04 {
    public static void main(String[] args) {
        int a = 3;
        a += 2.5;//calculate right part as double and in java automatically casting to int for left part
                 // '+=' that inside has such operation
        //a=a+2.5 --> '+=' not only calculation, also convert type
        System.out.println(a); //5

        int k = 5;
        k = ++k + ++k; //like 'k = 6 + 7'
        System.out.println(k); //13 cause override 'k' every step to the new value
    }
}
