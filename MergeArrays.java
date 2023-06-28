import java.util.Arrays;
import java.util.Comparator;

public class MergeArrays 
{
	public static void main(String args[])
	{
		int array1 [] = {23,45,56,87,97,68};
		int array2 [] = {56,34,65,856,865};
		int array3 [] = new int[array1.length+array2.length];
		int  i;
		for ( i=0;i<array1.length;i++)
		{
			array3[i]=array1[i];
		}//{23,45,56,87,97,68,0,0,0,0,0}
		for(i=0;i<array2.length;i++)
		{
			array3[i+array1.length]=array2[i];
		}
		Arrays.sort(array3);
		for(i=0;i<array3.length;i++)
		{
			System.out.print(array3[i]+",");
		}
		System.out.println("\nAfter Reverse: ");
		for(i=array3.length-1;i>=0;i--)
		{
			System.out.print(array3[i]+",");
		}
		//Print using 
		System.out.println("\nUsing Quick Print");
		for (int element:array3)
		{
			System.out.print(element+",");
		}
	}
}
