import java.util.Scanner;
public class plusone {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
         System.out.println("Enter the size of the array: ");
            int n = sc.nextInt();
            int [] arr = new int[n];
            System.out.println("Enter the elements of the array: ");
            for(int i = 0; i<arr.length; i++){
                arr[i]=sc.nextInt();
            }
            int result=plusone(arr);
            System.out.println("The result is: " + result);

    }

    static int plusone(int[] digits) {
        int n=0;
        for(int i = 0; i<digits.length;i++){
            n = digits[i] + n*10;
        }
        n = n + 1;
        return n;
    }

}
