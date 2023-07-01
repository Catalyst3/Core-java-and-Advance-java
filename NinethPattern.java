package StarPatterns;
//1
//01
//010
//1010
//10101
public class NinethPattern {

	public static void main(String[] args) 
	{
		int k=1;
		for(int i = 0;i<5;i++)
		{
			for(int j = 0;j<5;j++)
			{
				if(j<=i)
				{
					if(k==0)
					{
						System.out.print(k);
						k=1;
					}
					else 
					{
						System.out.print(k);
						k=0;
					}
					
				}
			}
			System.out.println();
		}

	}

}
