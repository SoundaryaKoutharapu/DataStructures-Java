import java.util.Scanner;

public class Version 
{
    String ver(String s)
    {
        int n= s.length();  
         if(n>=2)
         {
           s = s.substring(1,n-1);
           return s;
         }
         else 
              return null;  
    }     

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        Version v = new Version();
        System.out.println("enter string:");
        String s1 = new String();
        s1 = sc.nextLine();
        
        System.out.println(v.ver(s1));
    }
}
