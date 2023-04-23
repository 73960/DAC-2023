//ASSIGNMENT:que6.conversion of boolean into string
class Day2_2
{
    public static void main(String args[])
    {
        boolean num = false;
        String s1 = Boolean.toString(num);
        System.out.println(s1);

        Boolean b1 = new Boolean(num);
        String s2 = "true";
        
        boolean b = Boolean.valueOf(s2);
        
        System.out.println(b);

        Boolean b2 = new Boolean(s2);
        

    }
}