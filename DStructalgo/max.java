import java.util.Arrays;
public class max {
    public static void main(String[] args){
        int[] arr = {25,45,2,5,48};
        System.out.println(maxRange(arr,1,3)); 
    }
    public static int maxRange(int [] arr , int start, int end){
        //Method to find the maximum element in a range of an array
        int max=start;
        for(int i=start; i<=end; i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }


    //Method to find the maximum element in an array
   // public static int max(int [] arr){
    //     int max=arr[0];
    //     for(int i=0; i<arr.length; i++){
    //         if(arr[i]>max){
    //             max=arr[i];
    //         }
    //     }
    //     return max;}
     }

