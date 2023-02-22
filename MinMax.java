import java.util.Scanner;

public class MinMax
{
  
    int max(int[] a)
    {
        int max=0;
      for(int i=0;i<a.length;i++)
      {
          if(a[i]>max)
          max=a[i];
      }
      return max;
    }
     
      int min(int[] a)
    {
        int min=0;
      for(int i=0;i<a.length;i++)
      {
          if(a[i]<min)
          min=a[i];
      }
      return min;
    }
      
    public static void main(String[] args) 
    {
        int [] array = new int[40];
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the array elements:");
        for(int i=0;i<array.length;i++)
        {
        array[i]=sc.nextInt();
        }  
         MinMax m =new MinMax();
         System.out.println("Maximum value in the array is:"+m.max(array));
         System.out.println("Minimum value in the array is:"+m.min(array)); 
    }
}