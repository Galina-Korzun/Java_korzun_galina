package lesson3;

public class TaskEleven {
    public static void main(String[] args) {
        int[] arr=new int[100];
        for (int a=0; a<arr.length; a++) {
            arr[a]=a+1;
        }
        for (int element : arr) {
            System.out.print(element + "");
        }
    }
}
