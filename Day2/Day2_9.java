class Day2_9
{
    public static void main(String args[])
    {
        short num = 12;
        Short st = new Short(num);
        byte num1 = st.byteValue();
        System.out.println("NUM1 = "+num1);
         
         short num2 = st.shortValue();
         System.out.println("NUM2 = "+num2);

         int num3 = st.intValue();
         System.out.println("NUM3 = "+num3);
         long num4 = st.longValue();
         System.out.println("NUM4 ="+num4);
         float num5 = st.floatValue();
         System.out.println("NUM5 ="+num5);
         double num6 = st.doubleValue();
         System.out.println("NUM6 ="+num6);
    }
}