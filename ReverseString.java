//  Reverse a String Using Array

import java.util.Scanner;

public class ReverseString 
{
    static void reverse(String s)
    {
          char arr [] = s.toCharArray();
          for(int j = arr.length-1; j>=0; j--)
          {
             System.out.print(arr[j]);
          }    
    }

    public static void main(String[] args) 
    {
        String s = new String();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter string");
        s = sc.nextLine();
        System.out.println();
        reverse(s);
    }
}

