import java.util.Scanner;

public class HCFofNUM 
{
    
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter num-1");
        int a = sc.nextInt();
        System.out.println("enter num-2");
        int b = sc.nextInt();
        System.out.println(hcf(a,b));

    }

   static int hcf(int a, int b) 
    {
        if(a!=b)
        {
            if(a>b)
            a = a-b;
            else
            b = b-a;
           return hcf(a, b);
        }

      return a;
    }


}
