import java.util.Scanner;

public class Example6
{
   public static void main(String[] args) 
   {
    Scanner sc  = new Scanner(System.in);
    String s = sc.nextLine();
                                        /* char[] p = s.toCharArray();
                                           for(char c: p)
                                             {
                                                 System.out.println(c);
                                              } */
         palindrome(s);
   }


   private static void palindrome(String s) 
   {
      char[] p = s.toCharArray();
      int n = s.length();
      int i = 0;
      while(i<n)
      {
         if(p[i]==p[n-1])
         {
            i++;
            n--;
            System.out.println("Yes");
         }
         else
              System.out.println("No");
      }

     /*  if(n/2==c)
      {
        System.out.println("Yes");
      } */
   }

}