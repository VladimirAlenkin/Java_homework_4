// Задача 1. Пусть дан LinkedList с несколькими элементами. 
// Реализуйте метод, который вернёет «перевёрнутый» список.

import java.util.LinkedList;

public class task4_1 {
    public static void main(String[] args) {
        LinkedList<Integer> a = new LinkedList<>();
        for (int i = 0; i < 5; i++) {
            a.add(getRandomNumber());
        }
        System.out.println(a);

        for (int i = 0; i < 5; i++) {
            System.out.print(a.getLast() + ", ");
            a.removeLast();

        }
    }

    public static int getRandomNumber() { 
        double x = (Math.random() * 99);
        int num = (int) x;
        return num;
    }
}

