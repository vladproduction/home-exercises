package ex1;

public class From_1_to_100 {
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5};
        System.out.println("array:");
        for (Integer item : array) {
            System.out.println(item);
        }

        System.out.println("----------");
        for (int i = 1; i <= 10; i++) {
            if (i <= 5) {
                System.out.println(i + ") i=" + i);
            }
        }
    }
}




