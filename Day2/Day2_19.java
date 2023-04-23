class Day2_19
{
    public static void main(String args[])
    {
        float f1 = 14.8f;
        String str = Float.toString(f1);
        System.out.println(str);
        Float f2 = new Float(f1);
        String str1 = new String("123");
        Float f3 = new Float(str1);
        System.out.println(f3);
        String str2 = Float.toHexString( f1);
        System.out.println("conversion of float value to hexadecimal string: "+str2);



    }
}
//que.24)program to convert,a.float value to string,b.Float value into float instance ,c.String instance into Float instance,d.float value into hexadecimal string