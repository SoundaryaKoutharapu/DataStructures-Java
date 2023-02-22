/*

import java.util.Scanner;

public class ReverseAnArray 
{

    public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in);
       System.out.println("enter no of elements");
       int n = sc.nextInt();
       int [] arr = new int[n];
       System.out.println("enter elements");
       for(int i =0;i<arr.length;i++)
       {
         arr[i] = sc.nextInt();
       }
       System.out.println();
          reverse(arr);
    }

     static void reverse(int[] arr) 
    {
        for(int i = arr.length-1; i>=0; i--)
        {
            System.out.println(arr[i]);
        }
    }
}

  */

 import java.util.Arrays;
import java.util.Scanner;

 public class ReverseAnArray
 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no of elements");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("enter elements");
        for(int i =0;i<arr.length;i++)
        {
          arr[i] = sc.nextInt();
        }
        System.out.println();
        reverse(arr,n);
    }

      static void reverse(int[] arr, int n) 
    {
       int [] arr1 = new int[n];
       int j = n;
       for(int i=0;i<n;i++)
       {
        arr1[j-1] = arr[i];
        j--;
       }
       System.out.println(Arrays.toString(arr1));
    }
 }