package MultiDiamentionalArray;

import java.util.Scanner;

public class MatrixMultiplication 
{
	Scanner sc = new Scanner(System.in);
	int row;
	int column;
	int [][]mat;
	MatrixMultiplication(int row,int column)
	{
		this.row=row;
		this.column=column;
		mat=new int[row][column];
		scanMatrix();
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
	public static void main(String args[])
	{
		MatrixMultiplication mat1 = new MatrixMultiplication(2,2);
		MatrixMultiplication mat2 = new MatrixMultiplication(2,2);
		mat1.printMatrix();
		System.out.println("--------------------------------------------------");
		mat2.printMatrix();
	}
	

}
