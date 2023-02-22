import java.io.*;
import java.util.*;

public class Example2
{
  static void method(int h, int b)
  {
    int A=0;
    if(b >0 && h>0)
    {
       A = b*h;
       System.out.println(A);
    }
    else
    System.out.println("java.lang.Exception: Breadth and height must be positive");

    
  }
    public static void main(String[] args) 
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("enter b value");
      int b = sc.nextInt();
      System.out.println("enter h value");
      int h = sc.nextInt();
      method(b,h);
    }
}