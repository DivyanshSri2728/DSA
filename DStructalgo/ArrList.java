import java.util.ArrayList;
import java.util.Scanner;
public class ArrList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(10);
        // list.add("Hello");
        // list.add("World");  
        // list.add("Java");
        // list.add("Programming");
        // System.out.println(list);
        // list.remove(2); // Remove the element at index 2 (Java)
        // System.out.println(list);
        // list.set(1, "Python"); // Set the element at index 1 to Python
        // System.out.println(list);
        // System.out.println("Size of the list: " + list.size()); // Get the size of the list
        // System.out.println("Is the list empty? " + list.isEmpty()); // Check if the list is empty
        // System.out.println("Index of 'Hello': " + list.indexOf("Hello")); // Get the index of "Hello"
        // System.out.println("Last index of 'Hello': " + list.lastIndexOf("Hello")); // Get the last index of "Hello"
        // System.out.println(list.set(0, "Hi")); // Set the element at index 0 to "Hi" and print the old value
        // System.out.println(list);

        //Taking input from user
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 5; i++){
            System.out.println("Enter a string: ");
            list.add(sc.nextLine()); // Add the user input to the list
        }

        // for(int i = 0; i < 5; i++){
        //    System.out.println(list.get(i));
        // }
        System.out.println(list);
    }
}
