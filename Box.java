import java.util.Scanner;

public class Box 
{
    double method(double w, double h, double b)
    {
        double vol = b*h*w;  
         
        return vol;
    }
     

     public static void main(String[] args) 
     {
            Box c = new Box();

         Scanner sc = new Scanner(System.in);
         System.out.println("enter height:");
         double h = sc.nextDouble();

         System.out.println("enter breadth:");
         double b = sc.nextDouble();

         System.out.println("enter height:");
         double w = sc.nextDouble();

         System.out.println("The volume of box is:"+ c.method(w,h,b));
         
         
    }
}

