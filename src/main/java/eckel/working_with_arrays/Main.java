package eckel.working_with_arrays;

public class Main {
    public static void main(String[] args) {
        int [] a, b;
        a = new int[10];
        b = new int[5];
        System.out.println(a);
        System.out.println(b);
        a=b;
        System.out.println(a==b);
        System.out.println(a.equals(b));
        System.out.println(a);
        System.out.println(b);
    }
}
