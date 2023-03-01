import java.util.Scanner;

public class ElectricityBill 
{
    static int bill(int wph, int unit_price)
    {

      int  kwh =(wph*24*30)/1000;
      int price = kwh*unit_price;
      return price;

    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter watt per hour");
        int wph = sc.nextInt();
        System.out.println("enter unit price");
        int unit_price = sc.nextInt();
        System.out.println(bill(wph,unit_price));
        sc.close();
    }
}