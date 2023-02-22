import java.util.Scanner;

public class LetterString
{
    static void substring(String str, int n)
    {
        String s[] = str.split(" ", n);
        for(String a:s )
        {
            if(a.contains("o"))
            {
                System.out.println(a);
            }
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter string ");
        String str = sc.nextLine();
        System.out.println("enter no. of splits");
        int n = sc.nextInt();
        substring(str,n);
    }
}
