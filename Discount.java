import java.util.Scanner;

public class Discount 
{
    static double  disc(int price, int rateofdis)
    {
         double D  = (price*rateofdis)/100;

         return D;
    }  
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter price");
        int price = sc.nextInt();
        System.out.println("enter rate of discount");
        int rateofdis = sc.nextInt();
        System.out.println(disc(price,rateofdis));
    }
}