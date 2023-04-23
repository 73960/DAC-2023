package org.in.main;
import java.util.Scanner;
public class ResturentManagment 
{
   private static int index;
   private static Scanner sc = new Scanner(System.in);
   Restaurent[] arr = new Restaurent[5];
   
   public void getArray()
   {
	   for(int i=0;i<arr.length;i++)
	   {
		   arr[i] = new Restaurent();
	   }
   }
   public void addDish()
   {
	   if(index <arr.length)
	   {
		   System.out.println("Enter the dish name");
		   //sc.nextLine();
		   arr[index].setDishname(sc.next());
		   System.out.println("Enter the dish price");
		   arr[index].setPrice(sc.nextInt());
		   index++;
       }
	   else
		   System.out.println("List is Full");
   }
   public void changePrice()
   {
	   System.out.println("Enter the dish name : ");
	   for(int i= 0;i<arr.length;i++)
	   {
		   if(sc.nextLine() == arr[i].getDishname())
		   {
			   arr[i].setPrice(0);
			   System.out.println("Enter the price : ");
			   arr[i].setPrice(sc.nextInt());
			   break;
		   }
		   else
			   System.out.println("Enter valid name");
	   }
   }
   public void removeDish()
   {
	   System.out.println("Enter the dish name : ");
	   String s = sc.next();
	   int i;
	   for( i=0;i<arr.length;i++)
	   {
		   if(arr[i].getDishname() == s)
		   {
			   arr[i] = null;
			   break;
		   }
	   }
	   //arr[i] = new Restaurent();
   }
   public void viewMenu()
   {
	   if(arr != null)
	   {
		   for(int i=0;i<arr.length;i++)
		   {
			   System.out.println(arr[i].toString());
		   }
	   }
   }
   public static  int menuList()
   {
	   System.out.println("0.Exit");
	   System.out.println("1.Add new Dish");
	   System.out.println("2.Remove Dish");
	   System.out.println("3.Change price of Dish");
	   System.out.println("4.View Menue");
	   System.out.print("Enter choice ");
	   return sc.nextInt();
	   	   	   
   }
   
}
