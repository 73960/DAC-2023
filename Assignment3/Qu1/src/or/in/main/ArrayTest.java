package or.in.main;
import java.util.Arrays;
import java.util.Scanner;
public class ArrayTest
{
	private int arr[];
	private int sum;
  public void Acceprecord()
  {
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter the size of an array");
	  int size = sc.nextInt();  
	  arr = new int[size];
	  System.out.println("Enter the array elements");
	  for(int index =0;index<arr.length;index++)
	  arr[index] = sc.nextInt();	  
  }
  public void printRecord()
  {
	  for(int index =0;index<arr.length;index++)
	  {
		  System.out.println(arr[index] +" ");
	  }
  }
  public void ArraySum()
  {
	  sum =0;
	  for(int index =0;index<arr.length;index++)
	  {
		  sum = sum+arr[index];
	  }
  }
  public void ArrayAvg()
  {
	  double avg;
	  avg = sum/arr.length;
	  System.out.println("Average of array are :"+avg);
  }
  public void ArrayElements()
  {
	  Arrays.sort(arr);
	  System.out.println("Largest element in array = "+arr[arr.length - 1]);
	  System.out.println("Smallest element in array = "+arr[0]);
	  System.out.println("Sorted element in array " + Arrays.toString(arr));
  }
  
}
