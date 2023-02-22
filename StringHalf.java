import java.util.Scanner;

public class StringHalf
{
    String half(String s)
    {
        if(s.length()%2==0)
        {
             int n = s.length();
             s = s.substring(n/2);
             return s;
        }
        else
             return null;
    }
    public static void main(String[] args) 
    {
        StringHalf c = new StringHalf();
         Scanner sc = new Scanner(System.in); 

         System.out.println("enter string:");
         String s1 = new String();
         s1 = sc.nextLine();

         System.out.println("Half string is:" +c.half(s1));
        
    }
}
