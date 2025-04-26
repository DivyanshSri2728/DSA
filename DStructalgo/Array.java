import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        // 1. Declare an array of integers and initialize it with values
        // 2.Array of primitives
        int[] arr = {1, 2, 3, 4, 5};
        // System.out.println("Array length: " + arr.length);
        // System.out.println("First element: " + arr[0]);
        // System.out.println("Last element: " + arr[arr.length - 1]);
        // System.out.println(Arrays.toString(arr));//[1, 2, 3, 4, 5]



       //Array of Objects
       String[] stArr= new String[5];
       for(int i = 0 ; i<stArr.length; i++){
        //System.out.println("Enter a string: ");
        //stArr[i]=obj.nextLine();

       }
      // System.out.println(Arrays.toString(stArr));[hello, hi, gy, by, ahhhh]
     


       //Array passing in functions
         int[] arr1 = {1, 2, 3, 4, 5};
            System.out.println(Arrays.toString(arr1)); // [1, 2, 3, 4, 5]
            changeArray(arr1);// here at this point arr1[0] = 10
            // arr1[0] = 10; // this is the same as arr[0] = 10
            System.out.println(Arrays.toString(arr1)); // [10, 2, 3, 4, 5]

}

static void changeArray(int[] arr) {
    arr[0] = 10;
}
}