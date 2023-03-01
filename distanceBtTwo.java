import java.util.Scanner;
import java.lang.Math;

public class distanceBtTwo 
{
    static double distance(int x1, int x2, int y1, int y2)
    {
         
      double dis = Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
       
       
         return dis;
        
    }


    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);

        System.out.println("enter x1");
        int x1 = sc.nextInt();

        System.out.println("enter x2");
        int x2 = sc.nextInt();

        System.out.println("enter y1");
        int y1 = sc.nextInt();

        System.out.println("enter y2");
        int y2 = sc.nextInt();

        System.out.println(distance(x1,x2,y1,y2));
        sc.close();
    }
}
