import java.util.Scanner;

public class Menu
{
public static void main(String[] args) 
{   
    int con;
    do
    {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter menu option:");
    int num = sc.nextInt();
    System.out.println("enter first number:");
    int a = sc.nextInt();
    System.out.println("enter second number:");
    int b = sc.nextInt();
    Methods m = new Methods();
    
       switch(num)
        {
           case 1: 
                  m.add(a,b);
           break;
        
           case 2:
                 m.sub(a,b);
           break;    
        
           default:
                   System.out.println("invalid choice");
        }

        System.out.println("do you want to continue.? 1.Yes 2. No");
        con = sc.nextInt();

    }
    
    while (con==1);
}
}
            class Methods
        {
            void add(int a,int b)
            {
                int c = a+b;
                System.out.println("Addition is:"+c);
            }

            void sub(int a,int b)
            {
                int c = a-b;
                System.out.println("Subtraction is:"+c);
            }
        }