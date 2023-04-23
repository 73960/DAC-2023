package in.org.main;

import java.util.Scanner;

public class ArrayTest
{
	int arr1[][];
	int arr2[][];
	int row, col;
	
	public static Scanner sc = new Scanner(System.in);
	public void acceptArray()
	{
		
		System.out.println("Enter rows  :");
		row = sc.nextInt();
		System.out.println("Enter coloumns  :");
		col = sc.nextInt();

		arr1 = new int[row][col];
		arr2 = new int[row][col];
		
		System.out.println("Enter the elements of array1  :");
		for (int i = 0; i < row; i++) 
		{
			for (int j = 0; j < col; j++)
			{
				arr1[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Enter the elements of array2  :");
		for (int k = 0; k < row; k++)
		{
			for (int m = 0; m < col; m++)
			{
				arr2[k][m] = sc.nextInt();
			}
		}
		for (int i = 0; i < row; i++) 
		{
			for (int j = 0; j < col; j++) 
			{
				System.out.print(arr1[i][j]+" ");
			}
			System.out.println();
		}
		for (int k = 0; k < row; k++) 
		{
			for (int m = 0; m < col; m++)
			{
				System.out.print(arr2[k][m]+" ");
			}
			System.out.println();
		}

	}

	public void sumArray() 
	{
		System.out.println("Sum!!");
		int sum[][] = new int[row][col];
		for (int i = 0; i < row; i++)
		{
			for (int j = 0; j < col; j++)
			{
				sum[i][j] = arr1[i][j] + arr2[i][j];
			}
		}

		for (int i = 0; i < row; i++)
		{
			for (int j = 0; j < col; j++)
			{
				System.out.print(sum[i][j]+" ");

			}
			System.out.println();

		}
	}
	public void subArray()
	{
		int sub[][] = new int[row][col];
		for (int i = 0; i < row; i++)
		{
			for (int j = 0; j < col; j++)
			{
				if(arr1[i][j] > arr2[i][j])
					sub[i][j] = arr1[i][j] - arr2[i][j];
				else
					sub[i][j] = arr2[i][j] - arr1[i][j];
			}

		}

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(sub[i][j] + " ");

			}
			System.out.println();

		}
		
	}
	public void mulArray()
	{
		int[][] mul = new int[row][col];
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				mul[i][j] = arr1[i][j] * arr2[i][j];
			}
				
		}
		for(int n=0;n<row;n++)
		{
			for(int m=0;m<col;m++)
			{
				System.out.print(mul[m][n]+" ");
			}
			System.out.println();
		}
	}
	public void transpose()
	{
		for(int i = 0;i<row;i++)
		{
			for(int j =0;j<col;j++)
			{
				System.out.print(arr1[j][i]+" ");
			}
			System.out.print(" ");
			for(int j = 0;j<col;j++)
			{
				System.out.print(arr2[j][i]+" ");
			}
			System.out.println(" ");
		}   
		
	}
	public static int menuList()
	{
		System.out.println("1.Addition ");
		System.out.println("2.Substraction ");
		System.out.println("3.Multiplication ");
		System.out.println("4.Transpose of Array ");
		System.out.println("0.exit ");
		System.out.println("Enter choice");
		return sc.nextInt();
	}

	
}
