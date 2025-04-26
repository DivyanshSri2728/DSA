import java.util.Arrays;
import java.util.Scanner;
public class MDArr {
    public static void main(String[] args) {
        // int[][] arr= new int[3][];
        // int[][] arr1= {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        // System.out.println(arr1[0][0]);

        //Input of the 2DArray
        int[][] arr2= new int[3][3];
        for(int i = 0; i<arr2.length; i++){
            for(int j = 0 ; j<arr2[i].length ; j++){
                Scanner obj = new Scanner(System.in);
                System.out.println("Enter a number: ");
                arr2[i][j]=obj.nextInt();
            } 
        }
        //Printing the 2DArray
        // for(int i = 0; i<arr2.length; i++){
        //     for(int j = 0 ; j<arr2[i].length ; j++){
        //         System.out.print(arr2[i][j] + " ");
        //     }
        // System.out.println();
        // }
        //Printing the 2DArray using for-each loop
        for(int[] a: arr2){
            System.out.println(Arrays.toString(a));
        }
    }
}
