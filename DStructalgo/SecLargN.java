import java.util.Arrays;
public class SecLargN {
    public static void main(String[] args) {
        int[] arr = {45 , 23, 67, 89, 12, 34, 56, 78, 90, 11};
        System.out.println(secondLargest(arr)); // Output: 78
    }
    static int secondLargest(int [] arr){
        int count = 0;
        int num = 0;
        Arrays.sort(arr);
        for(int i = arr.length-1; i >=0 ; i--){
            if (arr[i]>arr[i-1]){
                count++;
            } 
                
            if(count == 2){
                 num = arr[i];
                 break;
            }
        }
        return num;
        
    }
}
