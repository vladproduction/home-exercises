package eckelBook.home_work_by_books;

import java.util.Scanner;

public class SwitchDemo02 {

    public static void main(String[] args) {
        SwitchDemo02 main = new SwitchDemo02();
        main.run();
    }

    private void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Set number from 1 to 9:");
        int number = scanner.nextInt();
        String text = "";

        switch (number) { // Оператор выбора
            case 1:
            case 9:
                text = "Вы ввели нечетное,\n но не простое число.";
                break;
            case 2:
            case 3:
            case 5:
            case 7:
                text = "Вы ввели простое число.";
                break;
            case 4:
            case 8:
                text = "Вы ввели число - степень двойки.";
                break;
            case 6:
                text = "Вы ввели 6 - совершенное число.";
        }
        System.out.println(text);
    }
}

