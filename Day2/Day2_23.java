class Day2_23
{
    public static void main(String args[])
    {
        double d1 = 16.89;
        String str = Double.toString( d1);
        System.out.println(str);
        Double d2 = new Double(d1);
        System.out.println(d2);
        String str1 = new String("123");
        Double d3 = new Double(str1);
         System.out.println(d3);
         String str2 = Double.toHexString(d1);
         System.out.println(str2);

        

    }
}
//que.28