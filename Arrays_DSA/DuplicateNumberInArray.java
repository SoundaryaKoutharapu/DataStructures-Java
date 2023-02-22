
// Find the duplicate number in an (sorted) array 

package Arrays_DSA;

import java.util.Scanner;

public class DuplicateNumberInArray 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no. of elements");
        int n = sc.nextInt();
        System.out.println("enter array elements");
        int [] arr = new int [n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println();
        duplicate(arr);
    }

      static void duplicate(int[] arr)
    {
        BubbleSort.bubble(arr);
        for(int i=0;i<arr.length;i++)  
        {
              if(arr[i] == arr[i+1] )
               {
                 System.out.println(arr[i]);
                 
               }
        }
    }
}
