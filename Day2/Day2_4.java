class Day2_4
{
    public static void main(String args[])
    {
        byte num = 1;
        String str = Byte.toString(num);
        System.out.println(str);
        Byte b1 = new Byte(num);
        System.out.println("Byte value = "+b1);
        String str1 = new String("123");
        Byte b2 = new Byte(str1);
        System.out.println("String instance to Byte instance ="+b2);
        

    }
}
//que.8 :write a program to convert a.byte value into string b. byte value into Byte instance c.String instance into Byte instance