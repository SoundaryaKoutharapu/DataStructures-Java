package Arrays_DSA;

import java.util.Scanner;

public class ReverseAfterPosition
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of elements");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("enter elements");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("enter position of elements");
        int m = sc.nextInt();
        rev_after_position(arr,m);
    }

     static void  rev_after_position(int[] arr, int m) 
   {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==m)
            {
                for(int j=m;j<arr.length;j++)
                {
                System.out.println();
                System.out.println(arr[j]);
                }
            } 
            else
            //System.out.println(arr[i]);
           continue;
         }
    }
}