import java.util.Arrays;
public class Swap {
    public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4, 5};
    swap(arr,1,3);
    System.out.println(Arrays.toString(arr)); // Output: [1, 4, 3, 2, 5]
    }
    static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
