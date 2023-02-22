package Arrays_DSA;
import java.util.*;

public class MaxMin
{
    static void minmax(int [] arr)
  {
      int i;
      int min = arr[0];
      int max = arr[0];
      for(i =0;i<arr.length;i++)
      {
          if(arr[i]<min)
          {
              //int temp = arr[i];
              //arr[i]=arr[i+1];
              //arr[i+1]=temp;
              min=arr[i];
          }

          if(arr[i]>max)
          {
            max = arr[i];
          }
           
      }
    }
      static void minsort(int [] arr)
      {
            minmax(arr);
          System.out.println(Arrays.toString(arr));
            int min;
            min = arr[0];
            System.out.println(min);
          //  return min;
      }

      static void maxsort(int[] arr) 
       {
        minmax(arr);
       System.out.println(Arrays.toString(arr));
        int max;
        max = arr[arr.length-1];
        System.out.println(max);
//return max;
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
          //  minmax(arr);
          minsort(arr);
          maxsort(arr);
      // System.out.println(Arrays.toString(arr));
    }

}