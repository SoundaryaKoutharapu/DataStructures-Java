import java.util.Scanner;

public class Floyds
{
    static void floyds(int n)
    {
      for(int row = 1;row<=n; row++) 
       { 
          for(int col =1; col<=row; col++)
          {
              System.out.print("*");
          }    
              System.out.println("");
        }
    }  

    public static void main(String[] args) 
{
       Scanner sc = new Scanner(System.in);
       System.out.println("enter a  number ");
       int n = sc.nextInt();
             floyds(n);
             sc.close();

}
}