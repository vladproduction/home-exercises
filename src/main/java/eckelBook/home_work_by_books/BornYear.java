package eckelBook.home_work_by_books;


import java.util.Scanner;

public class BornYear {
    public static void main(String[] args) {
        BornYear main = new BornYear();
        main.run();
    }

    private void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Set Your born year:\n");
        int bornYear = scanner.nextInt();
        int age, yearCurrent = 2023;
        age = howOldAreYou(bornYear,yearCurrent);
        System.out.println("You are: "+age);
    }
    static int howOldAreYou(int bornYear, int yearCurrent){
        return yearCurrent-bornYear;
    }
}
