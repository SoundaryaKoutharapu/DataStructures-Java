import java.util.Scanner;

public class SumOfDigitsOfNumber
{
    static double sum(double n)
    {
       double sum=0;
          while(n>0) 
          {
          double r = n%10;
           sum+=r;
           n=n/10;
          }      

       return sum;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        double n = sc.nextDouble();
      System.out.println(sum(n));

    }
}