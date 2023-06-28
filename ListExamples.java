package CollectionFrameWorkArrayList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
public class ListExamples 
{
 public static void main (String args[])
 {
	 //Operations Performed on Array List
	 List<Integer> list = new ArrayList();
	 List<Integer> list2 = new ArrayList(Arrays.asList(23,34,556));
	 //innitialize ArrayList As List 
	 // add elements
	 list.add(23);
	 list.add(34);
	 list.add(56);
	 list.add(58);
	 list.add(354);
	 list.add(556);
	 list.add(434);
	 list.add(34);
	
	 System.out.println(list);
     //add two lists
     list.addAll(list);
     System.out.println(list);
     //remove by index
     list.remove(2);
     System.out.println(list);
     //remove by Object
    boolean a =  list.remove("354");
     System.out.println(a);
     // Remove all objects of list 2 From 1
     list.removeAll(list2);
     System.out.println(list);
     //contains (to Check is presented or not
     System.out.println(list.contains(556));
     //To Array
     Integer []Arr = null;
     Arr = list.toArray(new Integer[list.size()]);
     for (int i = 0;i<list.size();i++)	 
     {
    	 System.out.print(Arr[i]+" ");
     }
    list2.clear();
    System.out.println("\nList 2: "+list2);
    
 }
}
