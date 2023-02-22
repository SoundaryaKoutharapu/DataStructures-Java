import java.util.Scanner;

public class LeapYear 
{
    static boolean leap(int year)
    {
        boolean one = true;
        boolean two = false;
       if(year!=0)
       { 
            if(year%4==0)
            {
                return one;
            }
            if(year%400==0)
            {
                return one;
            }
            if(year%100==0)
            {
                return two;
            }
       }
       return two;
   
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter year");
        int year = sc.nextInt();
        System.out.println(leap(year));
        sc.close();
    }
}
