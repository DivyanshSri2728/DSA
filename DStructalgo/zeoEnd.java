public class zeoEnd {
    public static void main(String[] args) {
        int[] arr = {0 , 2 , 4, 0, 5, 0, 6, 0, 7, 0};
        int[] temp = new int[arr.length];
        int j = 0;
        for(int i = 0 ; i <arr.length ; i++){
            if(arr[i]!=0){
                temp[i]=arr[i];
                j++;
            }
            
        }
        System.out.println(temp);
    }
    
}
