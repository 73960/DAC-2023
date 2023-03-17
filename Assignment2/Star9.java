class Star9
{
	public static void main(String args[])
	{
		for(int i=1;i<=5;i++)
		{
			for(int k=1;k<=5-i;k++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(int n=4;n>=1;n--)
		{
			for(int m=1;m<=5-n;m++)
			{
				System.out.print(" ");
			}
			for(int l=1;l<=n;l++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}