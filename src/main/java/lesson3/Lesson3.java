package lesson3;

public class Lesson3 {

    public void сheckSumSign() {
        int a = 10, b = 15;
        int c = a + b;
        if (c >= 0) System.out.println("Сумма положительная");
        else System.out.println("Сумма отрицательная");
    }


    public void compareNumbers() {
        int a = 1, b = 2;
        if (a >= b) System.out.println("a>=b");
        else System.out.println("a<b");
    }

    public void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }


    public void printColor() {
        int value = 1;
        if (value <= 0) System.out.println("Красный");
        else if (value > 0 && value <= 100) System.out.println("Желтый");
        else System.out.println("Зеленый");

    }

    public void methodLineNumber() {
        int number = 7;
        String line = "Hello, Aston!";
        for (int i = 0; i < number; i++) {
            System.out.println(line);
        }
    }


    public void taskEleven() {
        int[] arr = new int[100];
        for (int a = 0; a < arr.length; a++) {
            arr[a] = a + 1;
        }
        for (int element : arr) {
            System.out.print(element + "");
        }
    }


    public void taskFive() {
        System.out.println("expressionCheck(int a,int b,int c)");
        int a = 8;
        int b = 5;
        int c = a + b;
        if (c >= 10 && c <= 20) System.out.println(true);
        else System.out.println(false);

    }


    public void taskNine() {
        int year = 2020;
        System.out.println("Год" + year + "високосный" + LeapYear(year));
    }

    public static boolean LeapYear(int year) {
        if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else if (year % 4 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public void taskSix() {
        int val = 0;
        if (val >= 0) {
            System.out.println("Number is positive");
        } else if (val < 0) {
            System.out.println("Number is negative");
        }
    }


    public void taskTen() {
        int[] arr = {1, 0, 0, 1, 1, 0, 1, 0, 1, 0, 0, 0, 1, 1};
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] == 0) {
                arr[j] = 1;
            } else if (arr[j] == 1) {
                arr[j] = 0;
            }
        }
        for (int element : arr) {
            System.out.print(element + "");
        }
    }


    public void taskThirteen() {
        int[][] matrix = {{1, 7, 3},
                {2, 15, 4},
                {3, 2, 4}};
        for (int i = 0; i < 3; i++) {
            matrix[i][i] = 1;
            matrix[i][2 - i] = 1;
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "");
            }
            System.out.println();
        }
    }


    public void taskFourteen(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
        }
        printMassive(arr);
    }

    private void printMassive(int[] arr) {
        for (int element : arr) {
            System.out.print(element + "");
        }
        System.out.println("]");
    }
}
