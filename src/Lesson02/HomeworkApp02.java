package Lesson02;

public class HomeworkApp02 {

    public static void main (String [] args){
        System.out.println("1 задание...");
        System.out.println("Ответ: " + methodName(10, 12));
        System.out.println(" ");
        System.out.println("2 задание...");
        methodNumber(15);
        System.out.println(" ");
        System.out.println("3 задание...");
        System.out.println("Ответ: " + methodNumber2(-25));
        System.out.println(" ");
        System.out.println("4 задание...");
        methodPrintWordNTimes("Hello World", 6);
    }

    public static boolean methodName(int a, int b) {
        return (a + b >= 10) && (a + b <= 20);
    }

    public static void methodNumber (int number) {
        if (number >= 0) {
            System.out.println(number + "- положительное");
        } else {
            System.out.println(number + "- отрицательное");
        }
    }

    public static boolean methodNumber2(int c) {
        return c <= 0;
    }

    public static void methodPrintWordNTimes(String word, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println("Строка " + i);
        }
    }

}
