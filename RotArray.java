import java.util.Arrays;
import java.util.Scanner;
public class RotArray {
    public static void main(String[] args) {
        int arr [] = new int[4];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements of the array: ");
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the number of rotations: ");
        int k = sc.nextInt();
        for(int i = 0; i<k ; i++){
            int temp = arr[0];
            for(int j =0; j<arr.length-1; j++){
                arr[j] = arr[j+1];
            }
            arr[arr.length-1] = temp;
        }
        System.out.println("Array after rotation: " + Arrays.toString(arr));
        sc.close();

    }
}
