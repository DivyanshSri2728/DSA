public class maxConsec {
    public static void main(String[] args) {
      int [] arr = {0,0,1,1,0,0,0,1,1,1,0,0,0,0,1};
      int maxcount = 0;
      int count = 0 ; 
      for(int i=0;i<arr.length;i++){
       if(arr[i]==1){
        count++;
       }
       else{
        count = 0;
       }
        if(count>maxcount){
          maxcount = count;
        }
    }
    System.out.println(maxcount);
    }
}