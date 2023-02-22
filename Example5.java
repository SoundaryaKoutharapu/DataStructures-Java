import java.util.Scanner;

public class Example5 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s1  = sc.nextLine();
        String s2  = sc.nextLine();
        add(s1,s2);
        uppercase(s1,s2);
        compare(s1,s2);
    }

    private static void compare(String s1, String s2) 
    {
        if(s1.compareTo(s2)>0)
        {
            System.out.println("NO");
        }
        else
            System.out.println("Yes");
    }

    private static void uppercase(String s1, String s2) 
    {
        String S1 = s1.toUpperCase().substring(0,1) + s1.substring(1);
        String S2 = s2.toUpperCase().substring(0,1) + s2.substring(1);
        System.out.println(S1);
        System.out.println(S2);
    }

    private static void add(String s1, String s2) 
    {
        String sum = s1+s2;
        System.out.println(sum.length());
    }
}
