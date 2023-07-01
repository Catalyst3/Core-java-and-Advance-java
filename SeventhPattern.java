package StarPatterns;
// 12345
// 1234
// 123
// 12
// 1
public class SeventhPattern {

	public static void main(String[] args) 
	{
		for(int i=0;i<6;i++)
		{
			int k=1;
			for (int j=0;j<6;j++)
			{
				if (j<=4-i)//4 is 
				{
					System.out.print(k);
					k++;
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}	
	}
}
