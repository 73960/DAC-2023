package in.org.main;

public class Program {

	public static void main(String[] args)
	{
		ArrayTest T1 = new ArrayTest();
		T1.acceptArray();
		int choice;
		while((choice =ArrayTest.menuList())!= 0)
		{
			switch(choice)
			{
				case 1:T1.sumArray();
					break;
					
				case 2:T1.subArray();
					break;
					
				case 3:T1.mulArray();
				    break;
				    
				case 4 : T1.transpose();
				    break;
					
			}
		}
			
			

	}

}
