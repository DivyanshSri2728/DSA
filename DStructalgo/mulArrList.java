import java.util.ArrayList;
import java.util.Scanner;
public class mulArrList {
    public static void main(String[] args) {
        // Create an ArrayList of ArrayLists
       // ArrayList<ArrayList<String>> listOfLists = new ArrayList<>();

        //First method to create an ArrayList of ArrayLists

        // // Create and add the first inner list
        // ArrayList<String> innerList1 = new ArrayList<>();
        // innerList1.add("Hello");
        // innerList1.add("World");
        // listOfLists.add(innerList1);

        // // Create and add the second inner list
        // ArrayList<String> innerList2 = new ArrayList<>();
        // innerList2.add("Java");
        // innerList2.add("Programming");
        // listOfLists.add(innerList2);

        // // Print the outer list
        // System.out.println(listOfLists);


        Scanner in = new Scanner(System.in);
        //Second method to create an ArrayList of ArrayLists
        ArrayList<ArrayList<Integer>> list1 = new ArrayList<>();
        //Initialization 
        for (int i = 0; i <3; i++) {
            list1.add(new ArrayList<>());
        }
        for (int i =0 ; i<3; i++){
            for (int j =0 ; j<3; j++){
                list1.get(i).add(in.nextInt());
            }
        }
        //Printing the ArrayList of ArrayLists
        System.out.println(list1);
    }
}
 