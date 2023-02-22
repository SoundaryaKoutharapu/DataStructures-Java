import java.util.Scanner;

public class Ceiling
{
     static int ceil(int arr[],int target)
    {
        int start =0;
        int end=arr.length-1;
        int mid = start+(end-start)/2;

        while(start<=end)
        {
           if(target<mid)
           {
               end=mid-1;
           }
           else if(target>mid)
           {
           start=mid+1;
           }
           else
           {
                return mid;
           }
        }
        return end;
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter array size");
        int n= sc.nextInt();
        
        System.out.println("enter array elements");
        int [] arr = new int[n];
        for(int i=0;i<arr.length;i++)
        {
        arr[i]=sc.nextInt();
        }
        System.out.println("enter target num:");
        int target = sc.nextInt();
        System.out.println(ceil(arr,target));
    }
}
