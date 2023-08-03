//Write a Java program to find the largest element in an array.
public class LargestArray {
	public int largest()
	{
		 int [] number = {1,2,3,4,5,6,76,7,56,34};
		  int largest=0;
		  int i = 0;
		  while(i<number.length)
		  {
			  if(number[i]>largest){
				  largest=number[i]; 
			  }
			  i++;  
		  }
		  return largest;
	}
	public static void main(String args[])
	{
		LargestArray large =new LargestArray();
		
		System.out.println("Largest is "+large.largest());
	}

}
