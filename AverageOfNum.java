import java.util.Scanner;

public class AverageOfNum
{
       static int average(int arr[],int n)
       {
           int sum=0;
           for(int i=0;i<=n-1;i++)
           {
              sum = sum+arr[i];
           }
        
           int aver = sum/n;
             return  aver;

       }
       public static void main(String[] args) 
       {
           Scanner sc = new Scanner(System.in);
           System.out.println("enter the n value");
           int n=sc.nextInt();

           System.out.println("enter the numbers");
           int[] arr = new int[n];   
           for(int i=0;i<=arr.length-1;i++)
           {
              arr[i] = sc.nextInt();
           }
           System.out.println(average(arr,n));
           sc.close();
       }
}