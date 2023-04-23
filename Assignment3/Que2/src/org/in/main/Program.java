package org.in.main;

public class Program {

	public static void main(String[] args) 
	{
		ResturentManagment R1 = new ResturentManagment();
		R1.getArray();
		int choice;
		while((choice = ResturentManagment.menuList()) != 0)
		{
			switch(choice)
			{
				case 1:
					R1.addDish();
					break;
					
				case 2:
					R1.removeDish();
					break;
				
				case 3:
					R1.changePrice();
					break;
					
				case 4:
					R1.viewMenu();
					break;
			}
		}

	}

}
