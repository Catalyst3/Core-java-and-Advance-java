//1. Write a Java program to reverse a string without using any built-in functions.
public class reverseString {
	public void reverseString(String input)
	{
		char[] charArray = input.toCharArray();
		for (int i=charArray.length-1;i>=0;i--)
		{
			System.out.print(charArray[i]);
		}
	}
	public String effectiveway(String input)
	{
		char[] charArray = input.toCharArray();
		int left = 0;
		int right = charArray.length-1;
		while(left<right)
		{
			char temp = charArray[left];
			charArray[left]=charArray[right];
			charArray[right]=temp;
			 left++;
			 right--; 
		}
		return new String(charArray);
	}
	
	public static void main(String args[])
	{
		reverseString string = new reverseString();
		string.reverseString("aditya");
		String reverse=string.effectiveway("aditya Sawant");
		System.out.println("\n"+reverse);
	}
}

