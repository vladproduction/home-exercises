package eolymp_tasks.solution_in_process;

import java.util.Scanner;

public class Toasts01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        int p = scanner.nextInt();
        Toasts01 toasts01 = new Toasts01();
        toasts01.run(t, p);
    }

    private void run(int t, int p) {
        int amountOfFrying = t/p;
        if(t % p != 0){
            amountOfFrying++;
        }
        int time = (amountOfFrying*2)*2;
        System.out.println(time);

    }

}
/*Ви бажаєте підсмажити кілька тостів для майбутньої вечірки. Є сковорода, на якій може смажитися
одночасно k тостів. Підсмажування тосту з одного боку займає 2 хвилини. Будемо вважати, що операції
розміщення тосту на сковороді, перевертання і зняття тосту зі сковороди виконуються миттєво. Напишіть
 програму, яка обчислює мінімальний час в хвилинах для підсмажування n тостів. Тости не можна знімати
 зі сковороди раніше або пізніше 2 хвилин, необхідних для підсмажування однієї сторони. Кожен тост
 потрібно підсмажити з обох сторін.
    Вхідні дані
В одному рядку містяться два цілих числа n і k, розділених пропуском (0 ≤ n ≤ 1000, 1 ≤ k ≤ 50) -
кількість тостів і місткість сковороди.

    Вихідні дані
Вивести одне ціле число - мінімальний час в хвилинах для підсмажування n тостів.

Вхідні дані #1 content_copy
3 2

Вихідні дані #1 content_copy
6*/
