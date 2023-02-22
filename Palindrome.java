import java.util.Scanner;

public class Palindrome
{
    public static boolean palin (String str)
    {
        int i = 0;
        int j = str.length()-1;
        if (str.charAt(i) == str.charAt(j))
        {
            return true;
        }
        else
             return false;
    }
    
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter string:");
         String str = sc.nextLine();
         System.out.println(palin(str));
    }
}
