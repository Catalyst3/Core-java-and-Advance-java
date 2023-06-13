
public class Table 
{
	void table()
	{
		int a=2;
		int i =0;
		for (i=0;i<=10;i++)
		{
			int c=i*a;
			System.out.println(2+"x"+i+" = "+c);
		}
	}
	public static void main(String args[])
	{
		Table s = new Table();
		s.table();
	}
}
