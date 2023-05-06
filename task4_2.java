// Задача 2. Реализуйте очередь с помощью LinkedList со следующими методами:
// • enqueue() — помещает элемент в конец очереди,
// • dequeue() — возвращает первый элемент из очереди и удаляет его,
// • first() — возвращает первый элемент из очереди, не удаляя.

import java.util.LinkedList;

public class task4_2 {
    public static void main(String[] args) {
        LinkedList<Integer> l23 = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            enqueue(l23, getRandomNumber()); 
        }
        System.out.println(l23);

        System.out.println(dequeue(l23)); 
        System.out.println(l23);

        System.out.println(first(l23)); 
        System.out.println(l23); 
    }

    public static void enqueue(LinkedList<Integer> l23, int num) {
        l23.addLast(num);
    }

    public static int dequeue(LinkedList<Integer> l23) { 
        int num = l23.get(0);
        l23.remove(0);
        return num;
    }

    public static int first(LinkedList<Integer> l23) { 
        int num = l23.get(0);
        return num;
    }

    public static int getRandomNumber() { 
        double x = (Math.random() * 99);
        int num = (int) x;
        return num;
    }
}
