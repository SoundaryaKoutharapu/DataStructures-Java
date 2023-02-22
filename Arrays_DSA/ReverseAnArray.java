package Arrays_DSA;

import java.util.Scanner;

// USING TEMPORARY ARRAY

/* public class ReverseAnArray 
{
    static void reversearray(int[] array, int n)
{   
         int [] arr = new int[n];
         int j=n;
         for(int i=0;i<array.length;i++)
         {
                 arr[j-1]=array[i];
                 j=j-1;   
         }
        System.out.println("reversed array elements:");
        for(int k=0;k<array.length;k++)
        System.out.println(arr[k]);
    
    }
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("enter no of elements in array:");
        int n = in.nextInt();
        System.out.println("enter array elements:");
        int[] array = new int[n];
        for(int i=0;i<array.length;i++)
        {
            array[i]=in.nextInt();
        }
        reversearray(array,n);

    }
}
*/


// USING SWAPPING

public class ReverseAnArray
{
    static void reversearray(int[] arr, int n)
    {
        int temp;

        for(int i =0;i<n/2;i++)
        {
         temp = arr[i];
         arr[i]= arr[n-i-1];
         arr[n-i-1]=temp;
        }

         System.out.println("reversed array is:");
         for(int k =0;k<n;k++)
         {
             System.out.println(arr[k]);
         }
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println( "enter n");
        int n = sc.nextInt();
        System.out.println("enter array elements");
        int [] arr = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
         reversearray(arr, n);

    }
}