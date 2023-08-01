//2. Implement a function to check if a string is a palindrome.
public class Palindrome 
{
	public boolean checkPalindrome(String input)
	{
		input = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
		char[] charArray = input.toCharArray();
		int left =0;
		int right=charArray.length-1;
		while(left<right)
		{
			char temp = charArray[left];
			if(charArray[left]!=charArray[right])
			{
//				System.out.println("Not palindrome");
				return false;
			}
			charArray[right]=temp;
			left++;
			right--;
		}
		return true;
	}
	public static void main(String args[])
	{
		Palindrome palindrome = new Palindrome(); 
		if(palindrome.checkPalindrome("Adiida "))
		{
			System.out.println("palindrome");
		}
		else
		{
		System.out.println("Not");
		}
	}

}
