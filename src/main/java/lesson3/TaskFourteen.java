package lesson3;

public class TaskFourteen {
    public static int[] createArray(int len, int initialValue) {
        int[] array = new int[len];
        for (int i=0;i<len; i++) {
            array[i] = initialValue;
        }
        return array;
    }
    public static void main(String[] args) {
        int len = 5;
        int initialValue =20;
        int [] resultArray = createArray (len, initialValue);
        for (int element : resultArray) {
            System.out.print(element+"");
        }
    }
}
