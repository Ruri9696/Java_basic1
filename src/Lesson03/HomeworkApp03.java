package Lesson03;

public class HomeworkApp03 {

    public static void main (String [] args) {
        System.out.println("1 задание...");
        int[] arr1 = { 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 };
        printArr1("Было:\t", arr1);
        invertArr1(arr1);
        printArr1("Стало:\t", arr1);
        System.out.println(" ");

        System.out.println("2 задание...");
        int[] arr2 = new int[100];
        fillArr(arr2);
        printArr1("Заполненный массив: ", arr2);
        System.out.println(" ");

        System.out.println("3 задание...");
        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        printArr1("Было:\t", arr3);
        changeArr(arr3);
        printArr1("Стало:\t", arr3);
        System.out.println(" ");

        System.out.println("4 задание...");
        int array = 8;
        int[][] arr4 = new int[array][array];
        fillDiagonal(arr4);
        printArr2("Диагональ: ", arr4);
        System.out.println(" ");

        System.out.println("5 задание...");
int[] returnMethod = returnArr(5, 123);
printArr1("Возвращающий одномерный массив: ", returnMethod);
        System.out.println(" ");

        System.out.println("6 задание...");
        int[] arr5 = {36, 8, 3, 2, 52, 4, 11, 2, 29, 8, 9, 1};
        printArr1("Найти мин и макс значение: \t", arr5);
        System.out.println("Минимальное: " + findMin(arr5));
        System.out.println("Максимальное: " + findMax(arr5));
    }
    public static void printArr1(String print, int [] arr) {
        System.out.print(print);
       for (int i = 0; i < arr.length; i++) {
           System.out.print(arr[i] + " ");
       }
        System.out.println();

}

    public static void invertArr1(int[] arr) {
        for (int i = 0; i < arr.length; i++)
            if (arr[i] == 1) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
    }
    public static void fillArr(int[] arr) {
        for (int i = 0; i < arr.length; i++)
            arr[i] = i +1;
    }

 public static void changeArr(int[] arr) {
        for (int i =0; i < arr.length; i++) {
            if (arr[i] < 6)
                arr[i] *= 2;
        }
 }

    public static void printArr2(String print, int [][] arr) {
        System.out.println(print);
        for (int i = 0; i < arr.length; i++) {
            for (int j =0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        }

 public static void fillDiagonal(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i][i] = 5;
            arr[i][arr.length - 1 - i] = 5;
        }
 }

public static int[] returnArr(int len, int initialValue) {
        int[] arrLen = new int[len];
        for (int i = 0; i < arrLen.length; i++) {
            arrLen[i] = initialValue;
        }
        return arrLen;
}

public static int findMin(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
}

public static int findMax(int[] arr) {
        int max = arr[0];
        for (int i =0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
}
}
