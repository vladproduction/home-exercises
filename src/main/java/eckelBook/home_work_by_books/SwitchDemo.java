package eckelBook.home_work_by_books;

import java.util.Scanner;

public class SwitchDemo {

    public static void main(String[] args) {
        SwitchDemo main = new SwitchDemo();
        main.run();
    }

    private void run() {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        String name;
        switch (number){
            case 1:
                name = "First operation";
                break;
            case 2:
                name = "Second operation";
                break;
            case 3:
                name = "Third operation";
                break;
            case 4:
                name = "Forth operation";
                break;
            case 5:
                name = "Fifth operation";
                break;
            default:
                name = "No value";
        }
        System.out.println(name);
    }
}
