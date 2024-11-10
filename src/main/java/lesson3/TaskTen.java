package lesson3;

public class TaskTen {
    public static void main(String[] args) {
        int [] arr = {1,0,0,1,1,0,1,0,1,0,0,0,1,1};
        for (int j=0; j<arr.length; j++) {
            if (arr[j]==0) {
                arr [j]=1;
            } else if (arr[j]==1) {
                arr[j]=0;
            }
        }
        for (int element : arr) {
            System.out.print(element+ "");
        }
    }
}

