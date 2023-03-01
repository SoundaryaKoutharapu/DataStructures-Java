import java.util.Scanner;

public class Concat
{
     String concat(String str1, String str2 )
    {
         String s="";
         str1.toLowerCase();
         str2.toLowerCase();
         if(str1.length()==0 || str2.length()==0)
        {
            s = str1+str2;
        }
        if(str1.charAt(str1.length()-1)==str2.charAt(0))
        {
             str2 = str2.substring(1);
             s = str1+str2;         
    
        }
        if(str1.charAt(str1.length()-1)!=str2.charAt(0) )
        {
            s = str1+str2;
        }



        return s.toLowerCase();

    }
    public static void main(String[] args) 
    {
        Concat c = new Concat();
        Scanner sc = new Scanner(System.in);

        System.out.println("enter string 1");
        String s1 = new String();
        s1 = sc.nextLine();
       

        System.out.println("enter string 2");
        String s2 = new String();
        s2 = sc.nextLine();
        
        
 
        System.out.println("concated string is:" +c.concat(s1,s2));
        sc.close();
    }
}
