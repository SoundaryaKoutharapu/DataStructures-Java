import java.util.Scanner;

public class Vowel
{
    static void vowel(char s)
    {
      if(s=='a' || s == 'e' || s== 'i' || s== 'o' || s== 'u')
      {
           System.out.println("character is vowel");
      }
           System.out.println("character is not vowel");
    }

public static void main(String[] args)
{
   Scanner sc = new Scanner(System.in);
   String a = sc.nextLine();
   System.out.println("enter a character");
   char s = sc.next().charAt(0);
   vowel(s);

}
}