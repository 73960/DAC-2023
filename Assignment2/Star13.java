class Star13
{
	public static void main(String args[])
	{
		for(int i=5;i>=1;i--)
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
		for(int n=2;n<=5;n++)
		{
			for(int m=1;m<=5-n;m++)
			{
				System.out.print(" ");
			}
			for(int p =1;p<=n;p++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}