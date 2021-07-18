package Lesson01;

public class HomeWorkApp {
    // 1 задание
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }
    // 2 задание
    public static void printThreeWords() {
        System.out.println("------------------");
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }
    // 3 задание
    public static void checkSumSign() {
        System.out.println("------------------");
        int a = 20;
        int b = -15;
        int c = a + b;
        if (c > 0) {
            System.out.println("Сумма положительная");
        }
        else {
            System.out.println("Сумма отрицательная");
        }
    }
    // 4 задание
    public static void printColor() {
        System.out.println("------------------");
        int value = 25;
        if (value <= 0) {
            System.out.println("Красный");
        }
        if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        }
        if (value > 100) {
            System.out.println("Зеленый");
        }
    }
    // 5 задание
    public static void compareNumbers() {
        System.out.println("------------------");
        int a = 10;
        int b = 15;
        if (a >= b) {
            System.out.println("a >= b");
        }
        else {
            System.out.println("a < b");
        }
    }
}