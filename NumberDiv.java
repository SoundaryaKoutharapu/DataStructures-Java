import java.util.Scanner;

public class NumberDiv
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter N:");
        int N = sc.nextInt();
        for(int num=1;num<N;num++)
        {
           if(num%2==0 && num %3==0 && num%5==0)
           {
            System.out.println("number is:" +num);
           }
        }
    }    
}
