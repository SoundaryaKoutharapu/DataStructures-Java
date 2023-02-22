import java.util.Scanner;

public class RangePrime
{

    public static boolean prime(int n)
    {
       
        for( int i=1;i<=n/2;i++)
        {
            if(n%i!=0)
            {
              return true;
            }
        }
        return false;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int start =sc.nextInt();
        int end =sc.nextInt();
        for(int n=start;n<=end;n++)
        {
          if(prime(n)==true)
            System.out.println(n);
        }
    }
}