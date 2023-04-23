class Day2_5
{
    public static void main(String args[])
    {

    byte num = 123;
    Byte b1 = new Byte(num);
    
    byte num1 = b1.byteValue();
    System.out.println("Num1 = "+num1);

    short num2 = b1.shortValue();
    System.out.println("Num2 = "+num2);

    int num3 = b1.intValue();
    System.out.println("Num3 = "+num3);

    float num4 = b1.floatValue();
    System.out.println("num4 = "+num4);

    double num5 = b1.doubleValue();
    System.out.println("Num4 ="+num4);

    long num6 = b1.longValue();
    System.out.println("Num6 ="+num6);




    

    }

}
//que.9);write a program to convert state of Byte instance into byte,short,int,long,float,double.