import java.util.Arrays;

public class Q2 {public static void main(String[] args) {
    int[] a=  new int[]{1,2,3,4,5,6};
    System.out.println(Arrays.toString(a));
    shiftLeft(a);
    System.out.println(Arrays.toString(a));

}

    public static int[] shiftLeft(int[] array) {
        for(int i = 0; i < array.length - 1; ++i) {
            array[i] = array[i + 1];
        }

        array[array.length - 1] = 0;
        return array;
    }
}
