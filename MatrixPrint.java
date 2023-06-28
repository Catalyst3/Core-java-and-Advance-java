package MultiDiamentionalArray;
import java.util.Scanner;
public class MatrixPrint 
{
	Scanner sc = new Scanner(System.in);
	int row;
	int column;
	int [][]mat;
	MatrixPrint(int row,int column)
	{
		this.row=row;
		this.column=column;
		mat=new int[row][column];
		scanMatrix();
		printMatrix();
	}
	public void printMatrix()
	{
		for(int i = 0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
	}
	public void scanMatrix()
	{
		System.out.println("Enter "+row*column+" elements");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<column;j++)
			{
				this.mat[i][j]=sc.nextInt();
			}
		}
	}
	public static void main(String[] args) 
	{
		MatrixPrint print = new MatrixPrint(3,3);
	}
}
