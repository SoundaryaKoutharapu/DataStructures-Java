package Arrays_DSA;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort 
{
      static void selection(int arr[])
      {
          for(int i=0;i<arr.length;i++)
          {
             int last= arr.length-i-1;
             if(arr[i]>last)
             {
                 last=arr[i];
             }
          }
       }


    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no of array");
        int n = sc.nextInt();
        System.out.println("enter array elements");
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }
}
