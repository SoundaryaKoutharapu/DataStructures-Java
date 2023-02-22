import java.util.Scanner;

public class UpperToLower
{
    public static void main(String[] args)
     {
        char ch;
        Scanner in = new Scanner(System.in);
        System.out.println("enter a char");
        ch = in.next().charAt(0);
        in.close();
        int ascii = ch;
        if (ascii>=65 && ascii<=90 )
        {
           ascii+=32;
           char alpha = (char) ascii;
          System.out.print(alpha);
        }
        else if (ascii>=97 && ascii<=122)
        { 
            ascii-=32;
            char alpha = (char) ascii;
             System.out.print(alpha);       
        }
        else
        {
          System.out.println("undefined char");
        }
   }
}