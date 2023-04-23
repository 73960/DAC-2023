class Day2_13
{
    public static void main(String args[])
    {
        int num1 = 16;
        int num2 = 56;
        int Max_no = Math.max( num1, num2);
        System.out.println("Maximum value = "+ Max_no);
        int Min_no = Math.min(num1 ,num2);
        System.out.println("Minimum value = "+ Min_no);
        int result = Integer.sum(num1,num2);
        System.out.println("Result ="+result);
       
    }
}