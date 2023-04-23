class Day2_15
{
    public static void main(String args[])
    {
        long lv = 890;
        String str = Long.toString(lv);
        System.out.println("long to string conversion ="+str);
        Long l1 = new Long(lv);
        String str1 = new String("123");
        Long l2 = new Long(str1);
        System.out.println("long instance ="+l2);

        String  str3 = Long.toBinaryString(lv);
        System.out.println("long to binary string conversion = "+str3);

        String str4 = Long.toHexString(lv);
         System.out.println("long to hexadecimal string conversion = "+str3);

         String str5 = Long.toOctalString(lv);
         System.out.println("long to octal string conversion = "+str3);


    }
}