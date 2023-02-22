import java.util.Scanner;

public class UpperLower
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string");
        String st = sc.nextLine();
        System.out.println(st.toUpperCase());
        System.out.println(st.toLowerCase());
        sc.close();
    }
}
