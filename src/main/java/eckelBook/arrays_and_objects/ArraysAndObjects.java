package eckelBook.arrays_and_objects;

public class ArraysAndObjects {
    public static void main(String[] args) {

        /*  В программе используются классы, которые содержат
            поля-массивы и поля объекты,
            а также создается массив объектов*/

        // Количество элементов в массиве объектов:
        int count = 5;
        // Создание массива объектных переменных:
        Second[] objArr = new Second[count];
        // Связывание объектных переменных - элементов массива
        // с создаваемыми объектами класса Second:
        for (int i = 0; i < objArr.length; i++) {
            objArr[i] = new Second(3 * i + 4);
        }
    }
}

