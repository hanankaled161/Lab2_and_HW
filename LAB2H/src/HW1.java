import java.util.Arrays;

public class HW1 {  public static void main(String[] args) {
    int[] A = {1, 2, 3, 4, 5, 6, 7};
    System.out.println(Arrays.toString(A));
    reverse(A, 7);
}

    public static void reverse(int[] arr, int size) {
        int[] copyArray = new int[size];

        for(int i = 0; i < arr.length; ++i) {
            copyArray[i] = arr[arr.length - 1 - i];
        }
        arr=copyArray;
        System.out.println(Arrays.toString(arr));
    }
}
