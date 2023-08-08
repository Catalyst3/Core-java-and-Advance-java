package BasicOperation;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] initialArray = new int[10]; // Let's assume you have an initial array of size 5
        Array arrayObject = new Array(initialArray);

        // Insert elements into the array
        arrayObject.insert(10);
        arrayObject.insert(20);
        arrayObject.insert(30);
        arrayObject.insert(40);
        arrayObject.insert(50);
        System.out.println("length: "+arrayObject.length);
        System.out.println("Before");
        arrayObject.print();
        arrayObject.insertAtIndex(2,100);
       System.out.println( arrayObject.deleteAtIndex(1));
       arrayObject.updateAtIndex(4,400);
        System.out.println("\nValue at index: "+arrayObject.search(2));
        System.out.println("After insert and deletion");
        arrayObject.print();
    }
}
