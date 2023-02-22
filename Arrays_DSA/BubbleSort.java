package Arrays_DSA;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort
{
    
    static void bubble(int[] arr )
    {
        int i, j;
        boolean swapped = false;
       for(i=0;i<arr.length;i++)
       {
           for(j=1;j<arr.length-i;j++ )
           {
              if(arr[j-1]>arr[j])
              {
                int temp = arr[j-1];
                arr[j-1]=arr[j];
                arr[j]=temp;
                swapped=true;
              }

           }
                  if(!swapped)
                    {
                        break;
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
        bubble(arr);
       System.out.println(Arrays.toString(arr));
    }
}